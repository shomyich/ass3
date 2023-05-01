# ass3


## MyLinkedListStack

My code defines a generic class `MyLinkedListStack` that implements a stack data structure using a linked list as the underlying data structure. The stack can hold elements of any type, denoted by the type parameter `E`. 

The class includes the following methods:
- `push(E element)`: pushes the given element onto the top of the stack by adding it to the front of the linked list.
- `pop()`: pops the top element off the stack by removing the first element from the linked list. Throws an `EmptyStackException` if the stack is empty.
- `peek()`: peeks at the top element of the stack without removing it. Throws an `EmptyStackException` if the stack is empty.
- `size()`: returns the current size of the stack.
- `isEmpty()`: returns `true` if the stack is empty, `false` otherwise.

The constructor initializes an empty linked list. 

Overall, this implementation of a stack using a linked list is efficient in terms of time complexity for adding and removing elements from the top of the stack, which takes constant time O(1).


## MyLinkedListQueue
My code defines a generic class MyLinkedListQueue that implements a queue data structure using a linked list as the underlying data structure. The queue can hold elements of any type, denoted by the type parameter E.

The class includes the following methods:

enqueue(E element): enqueues the given element at the back of the queue by adding it to the end of the linked list.
dequeue(): dequeues the front element from the queue by removing the last element from the linked list. Throws a NoSuchElementException if the queue is empty.
peek(): peeks at the front element of the queue without removing it. Throws a NoSuchElementException if the queue is empty.
size(): returns the current size of the queue.
isEmpty(): returns true if the queue is empty, false otherwise.
The constructor initializes an empty linked list.

Overall, this implementation of a queue using a linked list is efficient in terms of time complexity for adding and removing elements from both the front and back of the queue, which takes constant time O(1).



## MyArrayListStack

The MyArrayListStack class is a generic class that implements a stack data structure using an ArrayList as the underlying data structure. The stack can hold elements of any type, denoted by the type parameter E.

The class includes the following methods:

push(E element): pushes the given element onto the top of the stack by adding it to the end of the ArrayList.
pop(): pops the top element off the stack by removing the last element from the ArrayList. Throws an EmptyStackException if the stack is empty.
peek(): peeks at the top element of the stack without removing it. Throws an EmptyStackException if the stack is empty.
size(): returns the current size of the stack.
isEmpty(): returns true if the stack is empty, false otherwise.

The constructor initializes an empty ArrayList.

This implementation of a stack using an ArrayList is efficient in terms of time complexity for adding and removing elements from the top of the stack, which takes constant time O(1) on average, but could be up to O(n) in the worst-case scenario when the ArrayList needs to be resized. However, the resizing overhead is amortized over a sequence of push and pop operations, making the overall time complexity of most operations constant on average.

## MyArrayListQueue

This code defines a generic class `MyArrayListQueue` that implements a queue data structure using an ArrayList as the underlying data structure. The queue can hold elements of any type, denoted by the type parameter E.

The class includes the following methods:

`enqueue(E element)`: enqueues the given element at the back of the queue by adding it to the end of the ArrayList.

`dequeue()`: dequeues the front element from the queue by removing the first element from the ArrayList. Throws a NoSuchElementException if the queue is empty.

`peek()`: peeks at the front element of the queue without removing it. Throws a NoSuchElementException if the queue is empty.

`size()`: returns the current size of the queue.

`isEmpty()`: returns true if the queue is empty, false otherwise.

The constructor initializes an empty ArrayList.

Overall, this implementation of a queue using an ArrayList is efficient in terms of time complexity for adding and removing elements from the front and back of the queue, which takes constant time O(1). However, removing an element from the middle of the queue takes linear time O(n).
