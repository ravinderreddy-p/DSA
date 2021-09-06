import java.util.LinkedList;
import java.util.Queue;

public class BTInsertion {
    public static void main(String[] args) {
        Node root = new Node(10);
        insertNode(root, 20);
        insertNode(root, 30);
        System.out.println("Level Order Traversal");
        printLevelOrderTraversal(root);
    }

    private static void printLevelOrderTraversal(Node root) {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        Node curr = root;
        q.add(root);
        while(q.isEmpty() == false){
            Node temp = q.poll();
            System.out.print(temp.key + " ");
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
//        System.out.println(root.key);
//        System.out.println(root.left.key);
//        System.out.println(root.right.key);
    }

    private static void insertNode(Node root, int i) {
        if(root == null){
            root = new Node(i);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.poll();
            if(curr.left == null){
                curr.left = new Node(i);
                return;
            }
            else{
                q.add(curr.left);
            }
            if(curr.right == null){
                curr.right = new Node(i);
                return;
            }
            else{
                q.add(curr.right);
            }

        }
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int i) {
            this.key = i;
        }
    }
}
