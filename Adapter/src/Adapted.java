import java.util.LinkedList;

public class Adapted implements IAdapted {
    @Override
    public void specificRequest(LinkedList<String> list){
        System.out.println("I am the adapted and I am receiving a linked list of strings and here is it");
        printList(list);
    }
    void printList(LinkedList<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }
}
