package Test;

import org.w3c.dom.Node;

import java.io.*;

public class LinkedListTest {

    Node1 head1;
    static class Node1{
        int data;
        Node1 next;
        Node1(int d){
            this.data=d;
        }
    }
    public static LinkedListTest insert(LinkedListTest list, int data){
        Node1 new_node = new Node1(data);
        if(list.head1==null){
            list.head1= new_node;
        }else{
            Node1 last1 = list.head1;
            while (last1.next != null) {
                last1 = last1.next;
            }
            last1.next=new_node;
        }
        return list;
    }
    public static void printList(LinkedListTest list)
    {
        Node1 currNode = list.head1;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void deleteList(LinkedListTest list, int val){
        Node1 currNode = list.head1;
        Node1 prevNode = null;
        if(currNode!=null&&currNode.data==val){
            list.head1=currNode.next;
        }
        while(currNode != null&&currNode.data!=val){
            prevNode=currNode;
            currNode= prevNode.next;
        }
        if(currNode==null){
            return;
        }
        prevNode.next=currNode.next;
    }
    public static void main(String[] args)
    {
        LinkedListTest list = new LinkedListTest();
        insert(list,5);
        insert(list,6);
        insert(list,8);
        insert(list,1);
        insert(list,3);
        printList(list);

        deleteList(list,8);
        System.out.println();
        printList(list);

        deleteList(list,1);
        System.out.println();
        printList(list);

        deleteList(list,8);
        System.out.println();
        printList(list);
    }
}

