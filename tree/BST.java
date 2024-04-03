package tree;

public class BST {

    class Node {
        int value;
        Node left, right;
 
        public Node(int item)
        {
            value = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;

	public BST() {
		root = null; 
	}
 
    public BST(int value) { 
    	root = new Node(value); 
    }
    
    //INORDER TRAVERSAL
    void inorder() { 
    	inorderRec(root); 
    }
    
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
    
    
    //PREORDER TRAVERSAL
    void preOrder() { 
    	preOrderRec(root); 
    }
    void preOrderRec(Node root)
    {
        if (root != null) {
        	System.out.print(root.value + " ");
        	preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }    
    
    //POSTORDER TRAVERSAL
    void postOrder() { 
    	postOrderRec(root); 
    }
    void postOrderRec(Node root)
    {
        if (root != null) {
        	postOrderRec(root.left);
        	postOrderRec(root.right);
        	System.out.print(root.value + " ");
        }
    }

    //SEARCH
    Node search(Node root, int key) {
        if (root == null || root.value == key)
            return root;
 
        if (root.value < key)
            return search(root.right, key);
        
        return search(root.left, key);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
