package Test;

import java.util.Stack;

public class QueueImplUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args)
    {
        QueueImplUsingStack t = new QueueImplUsingStack();
        t.enque(7);
        t.enque(8);
        t.enque(3);
        t.enque(4);
        t.deque();
        t.deque();
        t.enque(11);
        t.enque(13);
        t.deque();
        t.deque();
        t.deque();
    }
    public void enque (int m){
        s1.push(m);
        System.out.println("element entered "+m);
    }

    public void deque (){
        if(!s2.isEmpty()) {
            System.out.println(" element exited "+s2.peek());
            s2.pop();
        }else{
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            System.out.println(" element exited "+s2.peek());
            s2.pop();
        }
    }
}
