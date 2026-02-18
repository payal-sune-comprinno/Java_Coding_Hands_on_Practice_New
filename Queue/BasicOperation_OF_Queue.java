import java.util.*;

class Main {

    public static void display(Queue<Integer> q) 
    {
        int n = q.size();
        for (int i = 1; i <= n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void insertATPosition(Queue<Integer> q, int index, int val) {
        int n = q.size();
        for (int i = 1; i <= index; i++) {
            q.add(q.remove());
        }
        q.add(val);
        for (int i = 1; i <= n - index; i++) {
            q.add(q.remove());
        }
    }

    public static int peek(Queue<Integer> q, int index) {
        int n = q.size();
        for (int i = 1; i <= index; i++) {
            q.add(q.remove());
        }
        int peek1 = q.peek();
        for (int i = 1; i <= n - index; i++) {
            q.add(q.remove());
        }
        return peek1;
    }

    public static int remove(Queue<Integer> q, int index) {
        int n = q.size();
        for (int i = 1; i <= index; i++) {
            q.add(q.remove());
        }
        int removed = q.remove();
        for (int i = 1; i <= n - index - 1; i++) {
            q.add(q.remove());
        }
        return removed;
    }

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.add(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(8);
        q1.add(10);
        q1.add(4);
        q1.add(1);
        q1.add(6);

        System.out.println(q1);
        System.out.println("Size of queue: " + q1.size());
        System.out.println("Removed element: " + q1.remove());
        System.out.println(q1);
        System.out.println("Size of queue: " + q1.size());
        System.out.println("Peek element: " + q1.peek());

        display(q1);

        insertATPosition(q1, 2, 99);
        display(q1);

        System.out.println(peek(q1, 3));
        System.out.println(remove(q1, 2));

        display(q1);

        reverse(q1);
        display(q1);
    }
}
