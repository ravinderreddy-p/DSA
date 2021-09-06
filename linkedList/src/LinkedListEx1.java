public class LinkedListEx1 {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i = 1; i < 5; i++){
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

//        add number 10 at the end of linked list.

        curr = head;
        while(curr.next != null){
            curr = curr.next;

        }
        curr.next = new Node(10);

//        curr = head;
//        while(curr != null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

//        Add number 20 at the begining (ie., head)
        curr = head;
        head = new Node(20);
        head.next = curr;

//        curr = head;
//        while(curr != null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

//        Add node at 3rd place
        curr = head;
        for(int i = 1; i < 2; i++){
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = new Node(30);
        curr.next.next = temp;

        curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }


    }

}

//Linked List Node insert
//Linked List Node access - one by one print
//Linked List add Node at beginning
//Linked List add Node at end
//LInked list Reverse nodes
//Linked list add node at kth place

//Node = data|next pointer link
