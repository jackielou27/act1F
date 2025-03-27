class Node {
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}
class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }
    
    void insert(int data){
        root = insertRec(root,data);
    }
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void inord(){
        inOrder(root);
        System.out.println();
    }
void inOrder(Node node) {
    if (node != null){
        inOrder(node.left);
        System.out.print(node.data + "  ");
        inOrder(node.right);
    }
}

void preord(){
    preOrder(root);
    System.out.println();
}
void preOrder(Node node) {
    if (node != null){
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

void postord(){
    postOrder(root);
    System.out.println();
}
void postOrder(Node node) {
    if (node != null){
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "  ");
    }
}
}

public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree bst = new BinarySearchTree();
    int[] values = {10,5,15,3,8,20};

    for (int value : values) {
        bst.insert(value);
    }

    
    System.out.println("In-Order Traversal: ");
    bst.inord();
   
    System.out.println("Pre-Order Traversal: ");
    bst.preord();

    System.out.println("Post-Order Traversal: ");
    bst.postord();
    }
}
