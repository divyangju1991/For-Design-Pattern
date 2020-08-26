package Problems;

public class BinaryTree {

/* Java program to find the median of BST 
in O(n) time and O(1) space*/
	
/* A binary search tree Node has data, pointer 
to left child and a pointer to right child */
static class Node 
{ 
	int val; 
	Node left, right; 
}; 

static Node newNode(int data) 
{ 
	Node temp = new Node(); 
	temp.val = data; 
	temp.left = temp.right = null; 
	return temp; 
} 

// cur for storing the current count 
// of the value and mx for the maximum count 
// of the element which is denoted by node 
static int cur = 1, mx = 0; 
static int node; 
static Node previous = null; 

// Find the inorder traversal of the BST 
static void inorder(Node root) 
{ 
	// If root is null then return 
	if (root == null) 
	{ 
		return; 
	} 
	inorder(root.left); 
	if (previous != null) 
	{ 
		
		// If the previous value is equal to 
		// the current value then increase the count 
		if (root.val == previous.val) 
		{ 
			cur++; 
		} 
		
		// Else initialize the count by 1 
		else
		{ 
			cur = 1; 
		} 
	} 
	
	// If currrent count is greater than the 
	// max count then update the mx value 
	if (cur > mx) 
	{ 
		mx = cur; 
		node = root.val; 
	} 
	
	// Make the current Node as previous 
	previous = root; 
	inorder(root.right); 
} 

// Utility function 
static int findnode(Node root) 
{ 
	inorder(root); 
	return node; 
} 

// Java Code 
public static void main(String args[]) 
{ 
	/* Let us create following BST 
				6 
				/ \ 
				5	 7 
			/ \ / \ 
			4	 5 7 7 
	*/
	Node root = newNode(6); 
	root.left = newNode(5); 
	root.right = newNode(7); 
	root.left.left = newNode(4); 
	root.left.right = newNode(5); 
	root.right.left = newNode(7); 
	root.right.right = newNode(7); 

	System.out.println("Node of BST is " + 
						findnode(root)); 
} 
} 

// This code is contributed by Arnab Kundu 
