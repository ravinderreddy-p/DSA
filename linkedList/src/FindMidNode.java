public class FindMidNode {
    public static class Node{
        int data;
        Node next;
        public Node(int inputData){
            this.data = inputData;
            this.next = null;
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i = 1; i < arr.length; i++){
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            if(fast != null){
                slow = slow.next;
            }

        }
        System.out.println(slow.data);
    }
}
