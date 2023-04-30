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
        if (list.isEmpty()) throw new NoSuchElementException();
        else {
        Object el = list.getFirst();
        list.removeLast();
        return el;}
    }
    public Object peek(){
        if (list.isEmpty()) throw new NoSuchElementException();
        else {
        return list.getFirst();}
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        if (list.size() == 0) return true;
        else return false;
    }

}
