public class BinaryTree {
    public static void main(String[] args){
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(10);
        System.out.println("InOrder");
        inOrder(root);
        System.out.println();
        System.out.println("preOrder");
        preOrder(root);
        System.out.println();
        System.out.println("postOrder");
        postOrder(root);
        System.out.println();
        int h = heightofBinaryTree(root);
        System.out.println(h);
        printKNodes(root, 1);
    }

    private static void printKNodes(Node root, int i) {
        if(root == null)
            return;
        if(i == 0)
            System.out.println(root.key);
        else{
            printKNodes(root.left, i-1);
            printKNodes(root.right, i-1);
        }
    }

    private static int heightofBinaryTree(Node root) {
        if(root == null)
            return 0;
        return Math.max(heightofBinaryTree(root.left), heightofBinaryTree(root.right)) + 1;
    }

    private static void postOrder(Node root) {
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    private static void preOrder(Node root) {
        if(root != null){
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void inOrder(Node root) {
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    public static class Node {
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key = key;
        }
    }
}
