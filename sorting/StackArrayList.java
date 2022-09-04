package sorting;

import java.util.ArrayList;

public class StackArrayList {
    //static int MAX = 50;
    int top;
    //int[] arr = new int[MAX];
    ArrayList<Integer> arr = new ArrayList<>();

    //int low = arr.length-1;
    StackArrayList(){top =-1;}

//    boolean isEmpty()
//    {
//        return (top < 0);
//    }

    int pop(){
        int p=arr.get(top);
        top--;
        return p;
    }
//
//    int peek(){
//        int x= arr[top];
//        return x;
//    }

    void push(int x){
//        if(top>MAX-1){
//            System.out.println("stack overflow");
//        }
        ++top;
        arr.add(x);


    }
    void print(){
        for(int j=top; j>-1; j--)
            System.out.println(arr.get(j));
    }

    public static void main(String[] args) {

        StackArrayList s = new StackArrayList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println("element pop " +s.pop());

    }

}

