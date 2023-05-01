import java.util.Iterator;

public class CircularSinglyLinked<T> implements Iterable<T> {
    protected T value;
    protected CircularSinglyLinked<T> next;

    public CircularSinglyLinked() {
        this.next = this;
    }

    public void add(T value) {
        CircularSinglyLinked<T> node = new CircularSinglyLinked<>();
        node.setValue(value);
        node.next = this.next;
        this.next = node;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Iterator<T> iterator() {
        return new CircularSinglyLinkedIterator<>(this);
    }

}
