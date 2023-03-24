package MyUtil;
public class MyStack<E> {
    // Instance Variable
    Node<E> Top; // Head node(The node that is always on top of the stack)

    // Constructor
    public MyStack() {
        this.Top = null; // The stack is empty(Head is null)
    }

    // Methods
    public void push(E data) { // Push method - Adds a new node(data) to the top of the stack
        Node<E> newNode = new Node<E>(data);
        newNode.next = Top; // The newly inserted Node(data).next will equal to null because the
        // current top has a value of null.
        Top = newNode; // Current top which is null is going to equal to the new data(node).
    }

    public E pop() throws EmptyException { // Pop method - Deletes a new node(data) from the top
        // of the stack
        if (isEmpty()) { // First checks if stack is empty and prints out stack is empty.
            throw new EmptyException("The stack is empty");
        }

        E data = Top.data; // We save the current top node(data) in a local variable, so we can
        // delete it later.
        Top = Top.next;
        return data; // Returns the node(data) that we removed from the stack
    }

    public void iterateStack(MyStack<E> stack) {
        Node<E> current = stack.Top;
        System.out.println("Nodes of the stack");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        int count = 0;
        Node<E> current = Top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return Top == null;
    }
}
