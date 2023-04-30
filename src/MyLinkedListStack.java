import java.util.EmptyStackException;
import java.util.LinkedList;


// This class implements a stack data structure using a linked list as the underlying data structure.
// It is a generic class that can hold elements of any type.
// The class includes methods to push elements onto the top of the stack, pop the top element off the stack, peek at the top element without removing it, and get the current size of the stack.
public class MyLinkedListStack<E> {
    private LinkedList<E> list;

    // Constructor initializes an empty linked list.
    public MyLinkedListStack() {
        list = new LinkedList<>();
    }

    // Pushes the given element onto the top of the stack by adding it to the front of the linked list.
    public void push(E element) {
        list.addFirst(element);
    }

    // Pops the top element off the stack by removing the first element from the linked list.
// Throws an EmptyStackException if the stack is empty.
    public Object pop() {
        if (list.isEmpty()) throw new EmptyStackException();
        else {
            Object el = list.getFirst();
            list.removeFirst();
            return el;
        }
    }

    // Peeks at the top element of the stack without removing it.
// Throws an EmptyStackException if the stack is empty.
    public Object peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return list.getFirst();
        }
    }

    // Returns the current size of the stack.
    public int size() {
        return list.size();
    }

    // Returns true if the stack is empty, false otherwise.
    public boolean isEmpty() {
        if (list.size() == 0) return true;
        else return false;
    }
}