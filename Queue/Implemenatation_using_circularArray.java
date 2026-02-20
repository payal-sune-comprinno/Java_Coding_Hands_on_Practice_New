// Circular Queue Implementation using Array

class CircularQueue {

    int[] arr;
    int size;
    int front;
    int rear;

    // Constructor
    CircularQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Insert element
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = x;
    }

    // Remove element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = arr[front];

        if (front == rear) {   // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    // Get front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    // Display elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(4);

        q.enqueue(7);
        q.enqueue(2);
        q.enqueue(9);
        q.enqueue(3);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Peek: " + q.peek());
        System.out.println("Is Empty: " + q.isEmpty());

        q.enqueue(38);
        q.display();

        q.enqueue(90);   // Should show full
        System.out.println("Is Full: " + q.isFull());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        q.enqueue(8);
        q.display();
    }
}
