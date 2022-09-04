package sorting;

public class Stack {

    static int MAX = 50;
    int top;
    int[] arr = new int[MAX];

    //int low = arr.length-1;
    Stack(){top =-1;}

    boolean isEmpty()
    {
        return (top < 0);
    }

    int pop(){
        int p=arr[top--];
        return p;
    }

    int peek(){
        int x= arr[top];
        return x;
    }

    boolean push(int x){
        if(top>MAX-1){
            System.out.println("stack overflow");
        }
        arr[++top]=x;

        return true;
    }
    void print(){
        for(int j=top; j>-1; j--)
            System.out.println(arr[j]);
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println("element pop " +s.pop());

    }
}

