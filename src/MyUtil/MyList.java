package MyUtil;

public class MyList<E> {
    // Instance variables
    public Node<E> head = null; // Head for starting node
    public Node<E> tail = null;

    // Methods
    public void add(E data) { // Adds a new item to the list
        Node<E> newNode = new Node<>(data);

        // Check if list is empty
        if (isEmpty()) {
            head = newNode; // Head will point to the new node(data)
            tail = newNode; // Tail will point to the new node(data)
            // since there is only one node in the list head and tail is both the start and the end
        } else { // If list already has at least one node
            tail.next = newNode; // Tail.next value will point to the new node
            tail = newNode; // Tail is equal to the new node in the list. Head still points
            // at the first node and will not change.
        }
    }

    public E removeAt(int index) throws EmptyException {
        if (isEmpty()) {
            throw new EmptyException("The list is empty");
        }

        if (index == 0) {
            head = head.next; // remove head node
            return head.data;
        }

        Node<E> current = head;
        Node<E> previous = null;
        for (int i = 0; i < index && current != null; i++) { // Finds the specified index and
            // stops either when it finds the index or when current equals to null
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next; // remove current node
        }

        return current.data;
    }

    public E getElementAt(int index) throws EmptyException {
        Node<E> current = head;

        if (index < 0 || index >= size()) {
            throw new EmptyException("Index out of range: " + index);
        }

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void iterateList() throws EmptyException {
        Node<E> current = head;

        if (isEmpty()) {
            throw new EmptyException("The list is empty");
        }
        System.out.println("Nodes of the singly linked list");
        while (current != null) { // If there are nodes in the list
            System.out.print(current.data + " "); // Print out the data in the node
            current = current.next; // current is now going to equal the next value the node
            // which is the next node in the list. So it keeps pointing to the next list.
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}



