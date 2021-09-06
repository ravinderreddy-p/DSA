public class ReverseLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int inputData){
            this.data = inputData;
        }
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        printLinkedList(head);
        Node temp = reverseLinkedList(head);
        printLinkedList(temp);
    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
//            Change curr.next to prev but if Directly do it then I will lost connect to current next val(ie., 2)
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static void printLinkedList(Node head) {
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
