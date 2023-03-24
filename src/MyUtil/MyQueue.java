package MyUtil;

public class MyQueue<E> {
    // Instance Variables
    public Node<E> front, rear; // Need two heads because one is used for inserting a new node
    // (rear),
    // while the other is used for removing a node(front) that already exists.

    // Methods
    public void enqueue(E data) { // Adds a node from the back of the queue
        Node<E> temp = new Node<>(data); /* Stores the new node(data) into a new node called temp,
         For
        example if 'data' is 5 then temp is a new node with temp.data = 5 and temp.next = null. */

        if (rear == null) { // This line checks if the rear node is null. This is true if the
            // queue is empty.
            front = rear = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
    }

    // Dequeue
    public Node<E> dequeue() throws EmptyException { // Removes a node from the front of the
        // list(so the element that came into the queue first)
        if (isEmpty()) {
            throw new EmptyException("The queue is empty");
        }

        Node<E> temp = front; // Store a copy of front node(data) into temp, so we can return it
        // later in the terminal we when print it out.
        front = front.next;

        if (isEmpty()) {
            rear = null; // Front is already null in the isEmpty method now we just need rear to
            // equal to null as well.
        }
        return temp; // Returns the removed node
    }

    // Iterates through the queue
    public void iterateQueue() {
        Node<E> temp = front;
        System.out.println("Nodes of the queue");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Checks if the queue is empty by seeing if head has any elements
    public boolean isEmpty() {
        return front == null;
    }

    // Counts the amount of nodes in a queue if it has any elements
    public int size() {
        int count = 0;
        Node<E> temp = front; // Temp now has a copy of head. If head has nodes then increase the
        // count by one.
        while (temp != null) { // While head has elements(node(data))
            count++; // Increase count by 1
            temp = temp.next; // Head is equal to Head.next(which is the next node in the queue)
        }
        return count; // Returns the amount of nodes that is counted.
    }
}


