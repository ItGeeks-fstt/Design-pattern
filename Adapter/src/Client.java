import java.util.ArrayList;

public class Client {
    ITarget target;


    Client() {

        target = new ArrayListToLinkedListAdapter(new Adapted());

    }

    void Request() {
        System.out.println("I am client and I send a request as an array list of strings to the adapted(target) via the adapter");
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("!");
        // the as a client I expect array list of strings but the adapted needs a linked list of strings
        target.request(list);
    }
}
