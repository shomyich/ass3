import java.util.LinkedList;
public class MyLinkedListStack<E>{
    private LinkedList<E> list;

    public MyLinkedListStack(){
        list = new LinkedList<>();
    }
    public void push(E element){
        list.addFirst(element);
    }

    public Object pop(){
        Object el = list.getFirst();
        list.removeFirst();
        return el;
    }
    public Object peek(){
        return list.getFirst();
    }

}
