public class BinaryTreePrintNodesAtKDistance {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int k = 2;
        printNodesAtKDistance(root, k);
        int h = heightOfBT(root);
        System.out.println(h);
    }

    private static void levelOrderTraversal(Node root, int h) {
        if(root == null)
            return;
        if(h == 0){
            System.out.print(root.key + " ");
            return;
        }
        System.out.print(root.key + " ");
        levelOrderTraversal(root.left,h-1);
        levelOrderTraversal(root.right,h-1);
        return;
    }

    private static int heightOfBT(Node root) {
        if(root == null)
            return 0;
        return Math.max(heightOfBT(root.left), heightOfBT(root.right))+1;
    }

    private static void printNodesAtKDistance(Node root, int k) {
        if(root == null)
            return;
        if(k == 0){
            System.out.println(root.key);
            return;
        }
        printNodesAtKDistance(root.left, k-1);
        printNodesAtKDistance(root.right, k-1);
    }

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int i) {
            this.key = i;
        }
    }
}
