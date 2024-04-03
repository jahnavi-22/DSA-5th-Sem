package tree;

import java.util.ArrayList;
import java.util.List;



public class Tree {
    
	private static class Node {
        
		private int data;
        private List<Node> children;

        public Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public int getData() {
            return data;
        }

        public void addChild(Node child) {
            this.children.add(child);
        }

        public List<Node> getChildren() {
            return children;
        }
        
    }
    private Node root;

    
    //CONSTRUCTOR
    public Tree(int data) {
        this.root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }

    
    
    public void displayTree() {
        displayTree(root, 0);
    }

    private void displayTree(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t"); // Adding tabs to represent levels
        }

        System.out.println("- " + node.getData());

        List<Node> children = node.getChildren();
        for (Node child : children) {
            displayTree(child, level + 1); // Recursive call for each child
        }
    }
    
    // Other methods to manipulate the tree can be added here
    // For example: addNode, removeNode, traverse, etc.
    
    //DRIVER CODE
    public static void main(String[] args) {
        
    	Tree myTree = new Tree(0);

        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeC);
        nodeB.addChild(nodeD);
        nodeB.addChild(nodeE);

        myTree.getRoot().addChild(nodeA);

        Node root = myTree.getRoot();
        System.out.println("Root Node Data: " + root.getData());

        List<Node> childrenOfRoot = root.getChildren();
        for (Node child : childrenOfRoot) {
            System.out.println("Child Node Data: " + child.getData());
        }
        
        
        myTree.displayTree();
    }
}
