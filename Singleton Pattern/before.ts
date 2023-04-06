import { MongoClient } from "mongodb";


class MongoClientConnection {
    private _instance: MongoClient;

    public constructor() {

        // Create a MongoClient with a MongoClientOptions object to set the Stable API version
        console.log("creating a new _instance of MongoClient");

        const client = new MongoClient("mongodb://localhost:27017");

        this._instance = client;

    }
    async connectInstance() {
        await this._instance.connect();
        await this._instance.db("admin").command({ ping: 1 });
        console.log("Pinged your deployment. You successfully connected to MongoDB!");

    }

}
const clientConnectionForMovies = new MongoClientConnection();
const clientConnectionForComments = new MongoClientConnection();
console.log("Is the client for movies is the same  as the comments client ?", clientConnectionForMovies === clientConnectionForComments);
