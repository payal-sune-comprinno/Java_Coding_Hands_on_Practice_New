// Queue Implementation using Array

class Main {

    int front;
    int rear;
    int[] arr;
    int size;

    Main(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Main m1 = new Main(5);

        m1.enqueue(15);
        m1.enqueue(7);
        m1.enqueue(6);
        m1.enqueue(3);
        m1.display();

        System.out.println(m1.dequeue());
        m1.display();

        System.out.println(m1.peek());
        System.out.println(m1.isEmpty());

        m1.enqueue(9);
        m1.enqueue(77);

        System.out.println(m1.isFull());
    }
}
