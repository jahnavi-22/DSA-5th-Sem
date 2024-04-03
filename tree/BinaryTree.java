package tree;


public class BinaryTree {
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(int value) {
		root = addNode(root, value);
	}
	
	public int getTreeHeight() {
		return getTreeHeight(root);
	}
	
	private int getTreeHeight(Node root) {
		return root;
	}
	
	private void levelOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
	}
	
	
	private Node addNode(Node root, int value) {
		
		//case 1: when root is null
		if(root==null) {
			return new Node(value);
		}
		
		//case 2: when root is null
		if(root.left == null && root.right == null) {
			root.left = addNode(root.left, value);
		}else if(root.left != null && root.right != null) {
			root.right = addNode(root.right, value);
		}else {
			root.left = addNode(root.left, value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
