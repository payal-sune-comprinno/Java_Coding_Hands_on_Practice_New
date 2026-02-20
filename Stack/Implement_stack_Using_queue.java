import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    // Push operation
    public void push(int x) {
        q.add(x);

        // Rotate previous elements
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.remove();
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    // Check if empty
    public boolean isEmpty() {
        return q.isEmpty();
    }

    // Display
    public void display() {
        System.out.println(q);
    }

    public static void main(String[] args) {

        MyStack s = new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();   // [30, 20, 10]

        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());

        s.display();
    }
}
