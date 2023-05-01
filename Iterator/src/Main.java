import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinked<Integer> list = new CircularSinglyLinked<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Integer node : list) {
            System.out.println(node);
        }
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            Integer node = i.next();
            if (node == 3) {
                i.remove();
            }
        }
        for (Integer node : list) {
            System.out.println(node);
        }

    }
}