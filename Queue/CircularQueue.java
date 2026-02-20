//https://leetcode.com/problems/design-circular-queue/description/?envType=problem-list-v2&envId=queue
class MyCircularQueue {
 int capacity;
 int size;
 int front;
 int rear;
 int arr[];
    public MyCircularQueue(int k) {
        capacity=k;
        arr=new int[k];
        front=0;
        rear=-1;
        size=0;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
        return true;

    }
    
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        front=(front+1)%capacity;
        size--;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty())
        {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty())
        {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}
