import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<E> {
    private ArrayList<E> list;

    // Constructor initializes an empty ArrayList.
    public MyArrayListStack() {
        list = new ArrayList<>();
    }

    // Pushes the given element onto the top of the stack by adding it to the end of the ArrayList.
    public void push(E element) {
        list.add(element);
    }

    // Pops the top element off the stack by removing the last element from the ArrayList.
    // Throws an EmptyStackException if the stack is empty.
    public E pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return list.remove(list.size() - 1);
        }
    }

    // Peeks at the top element of the stack without removing it.
    // Throws an EmptyStackException if the stack is empty.
    public E peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return list.get(list.size() - 1);
        }
    }

    // Returns the current size of the stack.
    public int size() {
        return list.size();
    }

    // Returns true if the stack is empty, false otherwise.
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
