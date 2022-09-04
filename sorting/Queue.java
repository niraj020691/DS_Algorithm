package sorting;

public class Queue {

    int front,rear =0;
    int capacity =5;

    int[] que = new int[capacity];

    void enqueue(int x){
        que[rear++]=x;
    }

    void dequeue(){
        for(int i=0; i<rear-1; i++){
            que[i]=que[i+1];
        }
        rear--;
    }
    void print(){
        for(int i=front;i<rear;i++)
            System.out.println(que[i]);
    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.print();
        System.out.println("ok");
        q.dequeue();
        q.print();
    }
}

