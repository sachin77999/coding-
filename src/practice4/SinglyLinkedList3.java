package practice4;

import java.util.Scanner;
public class SinglyLinkedList3 {

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            //System.out.println("List is empty");
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
        SinglyLinkedList3 sList = new SinglyLinkedList3();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.display();
    }
}
