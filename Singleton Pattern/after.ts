import { MongoClient } from "mongodb";


class MongoClientConnection {
    private static _instance: MongoClient;

    private constructor() {

        // Create a MongoClient with a MongoClientOptions object to set the Stable API version
        console.log("creating a new instance of MongoClient");

        const client = new MongoClient("mongodb://localhost:27017");

        MongoClientConnection._instance = client;

    }

    static async getInstance() {
        if (this._instance) {
            // console.log(!!this._instance);
            await this._instance.connect();
            // Send a ping to confirm a successful connection
            await this._instance.db("admin").command({ ping: 1 });
            console.log("Pinged your deployment. You successfully connected to MongoDB!");
            return this._instance;
        }

        new MongoClientConnection();
        return this._instance;
    }
}


const clientConnectionForMovies = await MongoClientConnection.getInstance();
const clientConnectionForComments = await MongoClientConnection.getInstance();
console.log("Is the client for movies is the same  as the comments client ?", clientConnectionForMovies === clientConnectionForComments);
