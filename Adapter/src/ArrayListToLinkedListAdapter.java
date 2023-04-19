import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedListAdapter implements ITarget {
    IAdapted adapted;

    ArrayListToLinkedListAdapter(IAdapted adapted) {
        this.adapted = adapted;
    }

    @Override
    public void request(ArrayList<String> arraylist) {
        System.out.println("I am the adapter and I am converting the array list to a linked list");
        //do some additional logic (arrayList to linkedList)
        List<String> list = new ArrayList<String>(arraylist);
        LinkedList<String> linkedList = new LinkedList<>(list);

        this.adapted.specificRequest(linkedList);

    }

}
