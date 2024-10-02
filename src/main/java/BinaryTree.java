class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Pre-order
    void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.value + " "); // Посетить узел
        preOrder(node.left);                // Обход левого поддерева
        preOrder(node.right);               // Обход правого поддерева
    }

    // In-order
    void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);                 // Обход левого поддерева
        System.out.print(node.value + " "); // Посетить узел
        inOrder(node.right);                // Обход правого поддерева
    }

    // Post-order
    void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);               // Обход левого поддерева
        postOrder(node.right);              // Обход правого поддерева
        System.out.print(node.value + " "); // Посетить узел
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre-order:");
        tree.preOrder(tree.root);

        System.out.println("\nIn-order:");
        tree.inOrder(tree.root);

        System.out.println("\nPost-order:");
        tree.postOrder(tree.root);
    }
}
