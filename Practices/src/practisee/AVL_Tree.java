package practisee;
class Node
{
	int data;int height;
	Node left;
	Node right;
	public Node(int data)
	{
		this.data=data;
		height=1;
		right=left=null;
	}
}
public class AVL_Tree {
	Node root;
	int height(Node no)
	{
		if(no==null)
			return 0;
		else 
			return no.height;
	}
	
	
	int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	int getBalance(Node n)
	{
		if(n==null)
			return 0;
		else
			return height(n.left)-height(n.right);
	}
	//right rotation
	Node rightRotation(Node y)
	{
		Node x=y.left;
		Node k=x.right;
		x.right=y;
		y.left=k;
		
		y.height=max(height(y.left),height(y.right))+1;
		x.height=max(height(x.left),height(x.right))+1;
		
		return x;
	}


//Left Rotation
Node leftRotation(Node x) {
	Node y=x.right;
	Node k=y.left;
	y.left=x;
	x.right=k;
	
	y.height=max(height(y.left),height(y.right))+1;
	x.height=max(height(x.left),height(x.right))+1;
	
	return y;
}
public void insertAt(int data)
{
	root=insert(root,data);
}

Node insert(Node node, int data) { 
	  
    /* 1.  Perform the normal BST insertion */
    if (node == null) {
        node=new Node(data);
    return node;
    }
    if (data < node.data) 
        node.left = insert(node.left, data); 
    else if (data > node.data) 
        node.right = insert(node.right, data); 
    else // Duplicate keys not allowed 
        return node; 

    /* 2. Update height of this ancestor node */
    node.height = 1 + max(height(node.left), 
                          height(node.right)); 

    /* 3. Get the balance factor of this ancestor 
          node to check whether this node became 
          unbalanced */
    int balance = getBalance(node); 
    if(balance>1)
    {
    	if(node.left.data<data)
    		node.left=leftRotation(node.left);
    	return(rightRotation(node));
    	}
    if(balance<-1)
    {
    	if(node.right.data>data)
    		node.right=rightRotation(node.right);
    	return (leftRotation(node));
    	
    }
    return node;
}

public Node Delete(Node node,int data)
{
	if(node==null)
		return null;
	if(data<node.data)
		node.left= Delete(node.left,data);
	else if(data>node.data)
		node.right=Delete(node.right,data);
	else
	{
		if(node.left==null||node.right==null)
		{
			Node temp=null;
			if(temp==node.left)
				temp=node.right;
			else
				temp=node.left;
			if(temp==null)
				node=null;
			else
				node=temp;
		}
		else 
		{
			Node temp=minValue(node.right);
			node.data=temp.data;
			node.right=Delete(node.right,temp.data);
			
		}
	}
	if(node==null)
		return node;
	node.height = max(height(node.left), height(node.right)) + 1;  
	  
    // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether  
    // this node became unbalanced)  
    int balance = getBalance(node);  
    if(balance>1)
    {
    	if(node.left.data<data)
    		node.left=leftRotation(node.left);
    	return(rightRotation(node));
    	}
    if(balance<-1)
    {
    	if(node.right.data>data)
    		node.right=rightRotation(node.right);
    	return (leftRotation(node));
    	
    }
    return node;
}
private Node minValue(Node node) {
	Node current=node;
	while(current.left!=null)
	{
		current=current.left;
	}
	return current;
}


void preOrder(Node node) { 
    if (node == null) 
    	return ;
        System.out.print(node.data + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }
public static void main(String[] args) { 
    AVL_Tree tree = new AVL_Tree(); 

    /* Constructing tree given in the above figure */
    tree.insertAt(10);
    tree.insertAt(20);
    tree.insertAt(30);
    tree.insertAt(40);
    tree.insertAt(50);
    tree.insertAt(25);
    tree.Delete(tree.root,20);

    /* The constructed AVL Tree would be 
         30 
        /  \ 
      20   40 
     /  \     \ 
    10  25    50 
    */
    System.out.println("Preorder traversal" + 
                    " of constructed tree is : "); 
    tree.preOrder(tree.root); 
} 
} 