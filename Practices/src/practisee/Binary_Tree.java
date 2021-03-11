package practisee;

/*class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
*/	
  
// A Java program to introduce Binary Tree 
public class Binary_Tree 
{ 
	static class Node 
	{ 
	    int key; 
	    Node left, right; 
	  
	    public Node(int item) 
	    { 
	        key = item; 
	        left = right = null; 
	    } 
	} 
    // Root of Binary Tree 
     Node  root; 
  
    // Constructors 
    Binary_Tree(int key) 
    { 
        root = new Node(key); 
    } 
  
    Binary_Tree() 
    { 
        root = null; 
    } 
  
    public static void main(String[] args) 
    { 
        Binary_Tree tree = new Binary_Tree(); 
  
        /*create root*/
        tree.root = new Node(1); 
  
        /* following is the tree after above statement 
  
              1 
            /   \ 
          null  null     */
  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
  
        /* 2 and 3 become left and right children of 1 
               1 
             /   \ 
            2      3 
          /    \    /  \ 
        null null null null  */
  
  
        tree.root.left.left = new Node(4); 
        /* 4 becomes left child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    null  null  null 
           /   \ 
          null null 
         */
        tree.inOrder(tree.root);
    }
    public void inOrder(Node root)
	{
		if (root==null)
			return;
		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);
		
	}
}

