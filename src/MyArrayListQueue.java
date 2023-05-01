import java.util.ArrayList;
import java.util.NoSuchElementException;

// This class implements a queue data structure using an ArrayList as the underlying data structure.
// It is a generic class that can hold elements of any type.
// The class includes methods to enqueue elements at the back of the queue, dequeue elements from the front of the queue, peek at the front element without removing it, and get the current size of the queue.
public class MyArrayListQueue<E> {
    private ArrayList<E> list;

    // Constructor initializes an empty ArrayList.
    public MyArrayListQueue() {
        list = new ArrayList<>();
    }

    // Enqueues the given element at the back of the queue by adding it to the end of the ArrayList.
    public void enqueue(E element) {
        list.add(element);
    }

    // Dequeues the front element from the queue by removing the first element from the ArrayList.
// Throws a NoSuchElementException if the queue is empty.
    public Object dequeue() {
        if (list.isEmpty()) throw new NoSuchElementException();
        else {
            Object el = list.get(0);
            list.remove(0);
            return el;
        }
    }

    // Peeks at the front element of the queue without removing it.
// Throws a NoSuchElementException if the queue is empty.
    public Object peek() {
        if (list.isEmpty()) throw new NoSuchElementException();
        else {
            return list.get(0);
        }
    }

    // Returns the current size of the queue.
    public int size() {
        return list.size();
    }

    // Returns true if the queue is empty, false otherwise.
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
