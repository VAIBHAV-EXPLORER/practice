package practisee;

public class Binary_Search_tree {
	static TreeNode root;
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Binary_Search_tree()
	{
		root=null;
	}
	void insert(int data)
	{
		root=insertRec(root,data);
	}
	TreeNode insertRec(TreeNode root,int data) {
		
		if(root==null)
		{
			root=new TreeNode(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insertRec(root.left,data);
		}
		else if(data>root.data)
			root.right=insertRec(root.right,data);
		return root;
	}
	void delete(int data) {
		root=deleteRec(root,data);
	}
	private TreeNode deleteRec(TreeNode root, int data) {
		if(root==null)
		return null;
		 if(data<root.data)
			 root.left=deleteRec(root.left,data);
		 else if(data>root.data)
			 root.right=deleteRec(root.right,data);
		 else
		 {
			 // node with only one child or no child 
	            if (root.left == null) 
	                return root.right; 
	            else if (root.right == null) 
	                return root.left; 
	  
	            // node with two children: Get the inorder successor (smallest 
	            // in the right subtree) 
	            root.data = minValue(root.right); 
	  
	            // Delete the inorder successor 
	            root.right = deleteRec(root.right, root.data); 
	        } 
	  
	        return root; 
	    } 
	  
	    int minValue(TreeNode root) 
	    { 
	        int minv = root.data; 
	        while (root.left != null) 
	        { 
	            minv = root.left.data; 
	            root = root.left; 
	        } 
	        return minv; 
	    }
		 
	public void inOrder(TreeNode root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	public static void main(String args[])
	{
		Binary_Search_tree ob=new Binary_Search_tree();
		ob.insert(50);
		ob.insert(30);
		ob.insert(20);
		ob.insert(40);
		ob.insert(70);
		ob.insert(60);
		ob.insert(80);
		ob.insert(70);
		
//		ob.delete(20);
//		ob.delete(30);
//		ob.delete(50);
//		ob.delete(80);
//		ob.delete(60);
		//ob.delete(70);
		
		ob.inOrder(root);
	}
	

}
