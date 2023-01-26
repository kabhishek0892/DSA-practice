package LinkedList;

import java.util.LinkedList;

public class LL {

    Node head; //head of the list

    class Node{
        String data;
        Node next;
//Mandatory Constructor
        Node(String data){
            this.data =data;
            this.next = null;
        }


    }

    // Method to print the LinkedList.
    public  void printList()
    {
        Node temp =  head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (temp != null) {
            // Print the data at current node
            System.out.print(temp.data + " ");

            // Go to next node
            temp = temp.next;
        }
    }


    //add First
    public void addFirst(String data){
        Node newNode = new Node(data); //create node first
        if(head ==null){
        head = newNode;
        return;
        }
        newNode.next = head;
        head =newNode;
    }
    //add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp =temp.next;
        }
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("This");
        list.addFirst("is");
        list.addFirst("book");
        list.printList();

        LinkedList lis = new LinkedList();
        lis.addFirst(1);
        lis.addLast(2);
       lis.add(1,33);

    }
}
