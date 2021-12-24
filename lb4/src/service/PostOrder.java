
package service;

public class PostOrder {
    static class Node {
        String key;
        Node left, right;

        public Node(String item) {
            key = item;
            left = right = null;
        }
    }

     public static class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        void printPostorder(Node node) {
            if (node == null) {
                return;
            }
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.key + " ");
        }

         public void printPostorder() {
            System.out.println("Зворотній обхід дерева: ");
            printPostorder(root);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("%");
        tree.root.left = new Node("x");
        tree.root.right = new Node("^");
        tree.root.left.left = new Node("24");
        tree.root.left.right = new Node("3");
        tree.root.right.left = new Node("b");
        tree.root.right.right = new Node("x");
        tree.root.right.right.left = new Node("2");
        tree.root.right.right.right = new Node("-");
        tree.root.right.right.right.left = new Node("5");
        tree.root.right.right.right.right = new Node("u");
        tree.printPostorder();
    }
}
