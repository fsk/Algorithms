package org.fsk.algorithms.tree;

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BST {
    Node root;

    public BST() {
        this.root = null;
    }


    void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        }else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    //inorder -> left - root - right
    //preorder -> root - left - right
    //postorder -> left - right - root

    void inOrderTraverse(Node root) {
        if (root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.value + " - ");
            inOrderTraverse(root.right);
        }
    }

    void preOrderTraverse(Node root) {
        if (root != null) {
            System.out.print(root.value + " - ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    void postOrderTraverse(Node root) {
        if (root != null) {
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            System.out.print(root.value + " - ");
        }
    }

    void inOrderHelper() {
        inOrderTraverse(root);
    }

    void preOrderHelper() {
        preOrderTraverse(root);
    }

    void postOrderHelper() {
        postOrderTraverse(root);
    }


    void deleteHelper(int value) {
        root = deleteRec(root, value);
    }

    Node deleteRec(Node root, int value) {
        if (root == null) return null;

        //Silinecek Degeri Bul
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        }else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        }else {
            //Node tek child ise ya da leaf durumunda ise
            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {
                return root.left;
            }

            //Node iki cocuga sahipse: Sag alt agacin en kucuk degeri ile
            //yer degistirme
            root.value = minFindValue(root.right);

            //Sag alt agacin en kucuk degerini sil
            root.right = deleteRec(root.right, root.value);

        }

        return root;
    }

    private int minFindValue(Node root) {

        int minValue = root.value;

        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }

        return minValue;

    }


}

//10, 5, 12, 6, 13, 14, 11, 4, 3, 7
class Main {
    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(12);
        bst.insert(6);
        bst.insert(13);
        bst.insert(14);
        bst.insert(11);
        bst.insert(4);
        bst.insert(3);
        bst.insert(7);

        System.out.println("== INORDER ==");
        bst.inOrderHelper();

        System.out.println();

        System.out.println("== PREORDER ==");
        //10, 5, 4, 3, 6, 7, 12, 11, 13, 14
        bst.preOrderHelper();

        System.out.println();

        System.out.println("== POSTORDER ==");
        //3, 4, 7, 6, 5, 11, 14, 13, 12, 10
        bst.postOrderHelper();


        System.out.println();
        bst.deleteHelper(10);
        bst.inOrderHelper();

    }
}


