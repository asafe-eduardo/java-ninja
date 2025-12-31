import java.util.*;

public class ArvoreTest {

    // =========================
    // 1) BST - Binary Search Tree
    // Ideal para cenarios com muitas atualizações
    // =========================
    static class BST {
        static class Node {
            int key;
            Node left, right;

            Node(int key) { this.key = key; }
        }

        private Node root;

        public void insert(int key) {
            root = insert(root, key);
        }

        private Node insert(Node node, int key) {
            if (node == null) return new Node(key);
            if (key < node.key) node.left = insert(node.left, key);
            else if (key > node.key) node.right = insert(node.right, key);
            // se key == node.key, ignoramos (sem duplicatas)
            return node;
        }

        public boolean contains(int key) {
            return contains(root, key);
        }

        private boolean contains(Node node, int key) {
            if (node == null) return false;
            if (key == node.key) return true;
            if (key < node.key) return contains(node.left, key);
            return contains(node.right, key);
        }

        public List<Integer> inorder() {
            List<Integer> out = new ArrayList<>();
            inorder(root, out);
            return out;
        }

        private void inorder(Node node, List<Integer> out) {
            if (node == null) return;
            inorder(node.left, out);
            out.add(node.key);
            inorder(node.right, out);
        }
    }

    // =========================
    // 2) AVL (simplificada)
    // Ideal para arvores "Baixas" com muitas buscas
    // =========================
    static class AVL {
        static class Node {
            int key;
            int height;
            Node left, right;

            Node(int key) {
                this.key = key;
                this.height = 1;
            }
        }

        private Node root;

        public void insert(int key) {
            root = insert(root, key);
        }

        private Node insert(Node node, int key) {
            if (node == null) return new Node(key);

            if (key < node.key) node.left = insert(node.left, key);
            else if (key > node.key) node.right = insert(node.right, key);
            else return node; // sem duplicatas

            // Atualiza altura
            node.height = 1 + Math.max(height(node.left), height(node.right));

            // Calcula balance factor
            int balance = balance(node);

            // Casos de rotação (4 casos)
            // Left Left
            if (balance > 1 && key < node.left.key) return rotateRight(node);

            // Right Right
            if (balance < -1 && key > node.right.key) return rotateLeft(node);

            // Left Right
            if (balance > 1 && key > node.left.key) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }

            // Right Left
            if (balance < -1 && key < node.right.key) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }

            return node;
        }

        private int height(Node n) {
            return n == null ? 0 : n.height;
        }

        private int balance(Node n) {
            return n == null ? 0 : height(n.left) - height(n.right);
        }

        private Node rotateRight(Node y) {
            Node x = y.left;
            Node t2 = x.right;

            // Rotação
            x.right = y;
            y.left = t2;

            // Atualiza alturas
            y.height = 1 + Math.max(height(y.left), height(y.right));
            x.height = 1 + Math.max(height(x.left), height(x.right));

            return x;
        }

        private Node rotateLeft(Node x) {
            Node y = x.right;
            Node t2 = y.left;

            // Rotação
            y.left = x;
            x.right = t2;

            // Atualiza alturas
            x.height = 1 + Math.max(height(x.left), height(x.right));
            y.height = 1 + Math.max(height(y.left), height(y.right));

            return y;
        }

        public List<Integer> inorder() {
            List<Integer> out = new ArrayList<>();
            inorder(root, out);
            return out;
        }

        private void inorder(Node node, List<Integer> out) {
            if (node == null) return;
            inorder(node.left, out);
            out.add(node.key);
            inorder(node.right, out);
        }
    }
    
    
    public static void main(String... args) {
    
    	/*
      representação gráfica de uma BST
    
    	      10
			 /  \
			5    15
		   / \
		  3   7

    	*/
    
        // BST demo
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        System.out.println("BST inorder (ordenado): " + bst.inorder());
        System.out.println("BST contém 7? " + bst.contains(7));
        System.out.println("BST contém 99? " + bst.contains(99));






        /**
               30
			  /  \
			20    40
			/ \     \
		  10  25     50
 
        **/
        
       /**
		conceito da rotação da direita
		
		      y               x
			 /               / \
			x      ->       ?   y
			 \
			  t2

		**/
		        // AVL demo
        AVL avl = new AVL();
        // Inserção que força rotações
        int[] valores = {10, 20, 30, 40, 50, 25};
        
        for (int v : valores) avl.insert(v);
        System.out.println("AVL inorder (ordenado e balanceado): " + avl.inorder());

    }
    
    
}
