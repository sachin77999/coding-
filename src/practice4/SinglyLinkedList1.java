package practice4;

import java.util.Scanner;
public class SinglyLinkedList1 {

    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node current = head;

        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        while(current!=null)
        {
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        SinglyLinkedList1 sList = new SinglyLinkedList1();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.display();
    }

}
