//https://leetcode.com/problems/implement-queue-using-stacks/submissions/1924044447/

class MyQueue {
  Stack<Integer> stack1=new Stack<>();
         Stack<Integer> stack2=new Stack<>();
    public MyQueue() {
      
    }
    
    public void push(int x) {
        stack1.push(x);
        
    }
    
    public int pop() {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());

            }
        }
        return stack2.pop();
        
    }
    
    public int peek() {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
        
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}


//basic implemenattaion
//implenation using stack of queue
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.Stack;
// class Main {
//     Stack<Integer> stack1=new Stack<>();
//     Stack<Integer> stack2=new Stack<>();
//     public void enqueue(int x)
//     {
//         stack1.push(x);
//     }
//     public boolean isEmpty()
//     {
//         return stack1.isEmpty() && stack2.isEmpty();
//     }
//     public int peek()
//     {
//         if(isEmpty())
//         {
//             System.out.println("queue is empty");
//             return -1;
//         }
//         if(stack2.isEmpty())
//         {
//             while(!stack1.isEmpty())
//             {
//                 stack2.push(stack1.pop());
//             }
//         }
//         return stack2.peek();
//     }
//     public int dequeue()
//     {
//         if(isEmpty())
//         {
//             System.out.println("queue is empty");
//             return -1;
//         }
//         if(stack2.isEmpty())
//         {
//             while(!stack1.isEmpty())
//             {
//                 stack2.push(stack1.pop());
//             }
//         }
//         return stack2.pop();
//     }
//     public void display()
//     {
//         if(isEmpty())
//         {
//             System.out.println("queue is empty");
//             return;
//         }
//         if(stack2.isEmpty())
//         {
//             while(!stack1.isEmpty())
//             {
//                 stack2.push(stack1.pop());
//             }
//         }
//         while(!stack2.isEmpty())
//         {
//             stack1.push(stack2.pop());
//         }
//         System.out.println(stack1);
//     }
//     public static void main(String[] args) {
//        Main m1=new Main();
//        m1.enqueue(5);
//        m1.enqueue(7);
//        m1.enqueue(3);
//        m1.enqueue(9);
//        m1.display();
//        System.out.println(m1.dequeue());
//        m1.display();
//        System.out.println(m1.peek());
//     }
// }