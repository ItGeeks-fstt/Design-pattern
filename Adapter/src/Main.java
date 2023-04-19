public class Main {
    public static void main(String[] args) {
//        convert an interface of a class to another interface that the client expects
//        Adapter lets classes work together that couldn't otherwise because of incompatible interfaces
//        the attention is not to change a behaviour or extend or modify it somehow
//        the attention is to change an interface of a class (Concrete request) to another interface that the client expects (client request)

        Client client = new Client();
        client.Request();

    }
}