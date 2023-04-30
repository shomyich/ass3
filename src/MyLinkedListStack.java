import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyLinkedListStack<E> {
    private LinkedList<E> list;

    public MyLinkedListStack() {
        list = new LinkedList<>();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public Object pop() {
        if (list.isEmpty()) throw new EmptyStackException();
        else {
            Object el = list.getFirst();
            list.removeFirst();
            return el;
        }
    }

    public Object peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        } else {
        return list.getFirst();}
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        if (list.size() == 0) return true;
        else return false;
    }
}
