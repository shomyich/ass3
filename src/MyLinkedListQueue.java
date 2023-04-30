import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<E> {
    private LinkedList<E> list;

    public MyLinkedListQueue(){
        list = new LinkedList<>();
    }
    public void enqueue(E element){
        list.addLast(element);
    }
    public Object dequeue(){
        Object el = list.getFirst();
        list.removeLast();
        return el;
    }

}
