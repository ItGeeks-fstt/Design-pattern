import java.util.Iterator;

public class CircularSinglyLinkedIterator<T> implements Iterator<T> {
    CircularSinglyLinked<T> head;
    CircularSinglyLinked<T> current;

    CircularSinglyLinkedIterator(CircularSinglyLinked<T> head) {
        this.head = this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current.next != head;
    }

    @Override
    public T next() {
        current = current.next;
        return current.value;
    }

    @Override
    public void remove() {
        // remove current node
        CircularSinglyLinked<T> node = head;
        while (node.next != current) {
            node = node.next;
        }
        // node.next is current
        node.next = current.next;
        current = node;
    }

}
