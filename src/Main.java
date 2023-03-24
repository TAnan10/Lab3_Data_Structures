import MyUtil.*;
public class Main {
    public static void main(String[] args) {
        // Stack list Testing
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println();

        stack.iterateStack(stack);
        System.out.println();
        System.out.println("The stack size is " + stack.size());

        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------");
        System.out.println();

        // Queue List Testing
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        queue.iterateQueue();
        System.out.println();

        queue.dequeue();
        queue.dequeue();

        queue.iterateQueue();
        System.out.println();
        System.out.println("Queue size is " + queue.size());

        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------");
        System.out.println();

        // Linked-List Testing
        MyList<Integer> linkedList = new MyList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.iterateList();

        System.out.println();
        System.out.println("Linked-list size is " + linkedList.size());
        System.out.println();

        System.out.println("Got element " + linkedList.getElementAt(3));

        linkedList.removeAt(2);
        linkedList.removeAt(3);

        System.out.println();
        linkedList.iterateList();
    }
}







