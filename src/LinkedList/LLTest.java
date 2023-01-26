package LinkedList;

public class LLTest {

     static class Node <T> {
        T data;
        Node next;


        public Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(11);
        Node n3 = new Node(9);

        Node head = n1 ;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        PrintList(n1);
        insert(10,3,n1);

    }

    static void PrintList(Node head){
         Node current = head;

         while(current!=null){
             System.out.println(current.data);
             current = current.next;
         }
    }

   static void insert (int data ,int position ,Node head){
         Node toAdd = new Node(data);

         if(position==0){
             toAdd.next = head;
             head = toAdd;
             return;
         }

         Node prev = head;
        for (int i = 0; i < position-1; i++) {
            prev = prev.next;
        }
        //sequencing is very important of below lines
        toAdd.next = prev.next;
        prev.next = toAdd;

        }

        static void DeleteNode (int position , Node head){
if (position==0){
    head =head.next;
    return ;
}

           Node prev = head;
            for (int i = 0; i <position-1 ; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }

        Node reverseLinkedListIterative(Node head){
         Node current = head;
         Node prev = null;
         while (current!=null){
             Node temp = current.next;
             current.next = prev;
             prev = current;
             current = temp;

         }
         return prev;
        }

        Node reverseLInkedListRecursive(Node head){
         if(head ==null || head.next ==null){
             return head;
         }
         Node newHead = reverseLInkedListRecursive (head.next);
         Node headNext = head.next;
         headNext.next = head;
         head.next = null;
         return  newHead;

        }
    }

