package practice4;

import org.w3c.dom.Node;

import java.util.Scanner;
public class LinkedListExamples1 {

    Node head; // head of list

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
        public static void main(String args[])
        {
         LinkedListExamples1 list = new LinkedListExamples1();
         list.head = new Node(100);
         Node second = new Node(200);
         Node third = new Node(300);
         list.head.next = second;
         second.next = third;
         list.display();
        }
    }

