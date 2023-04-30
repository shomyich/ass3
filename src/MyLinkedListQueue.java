import java.util.LinkedList;
import java.util.NoSuchElementException;

// This class implements a queue data structure using a linked list as the underlying data structure.
// It is a generic class that can hold elements of any type.
// The class includes methods to enqueue elements at the back of the queue, dequeue elements from the front of the queue, peek at the front element without removing it, and get the current size of the queue.
public class MyLinkedListQueue<E> {
    private LinkedList<E> list;

    // Constructor initializes an empty linked list.
    public MyLinkedListQueue() {
        list = new LinkedList<>();
    }

    // Enqueues the given element at the back of the queue by adding it to the end of the linked list.
    public void enqueue(E element) {
        list.addLast(element);
    }

    // Dequeues the front element from the queue by removing the last element from the linked list.
// Throws a NoSuchElementException if the queue is empty.
    public Object dequeue() {
        if (list.isEmpty()) throw new NoSuchElementException();
        else {
            Object el = list.getFirst();
            list.removeLast();
            return el;
        }
    }

    // Peeks at the front element of the queue without removing it.
// Throws a NoSuchElementException if the queue is empty.
    public Object peek() {
        if (list.isEmpty()) throw new NoSuchElementException();
        else {
            return list.getFirst();
        }
    }

    // Returns the current size of the queue.
    public int size() {
        return list.size();
    }

    // Returns true if the queue is empty, false otherwise.
    public boolean isEmpty() {
        if (list.size() == 0) return true;
        else return false;
    }
}