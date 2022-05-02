package Question1;

public class BTImplimentation {

	BTNode root;
	int [] result;
	int count;
	
	public BTImplimentation() {
		root  = null;
	}

	private int getCount (BTNode node) {
		//if node is empty 
		if(node == null)
			return 0;
		
		int count = 0;
		//if node has lest child (l-p-r)
		if(node.lchild !=null) {
			count+= getCount (node.lchild);
		}
		
		//p
		//System.out.println(node.data);
		++count;
		
		//r
		if(node.rchild!=null)
			count += getCount(node.rchild);
		return count;
	}
	
	
	private void inorder (BTNode node) {
		//if node is empty 
		if(node == null)
			return;
		//if node has lest child (l-p-r)
		if(node.lchild !=null) {
			inorder (node.lchild);
		}
		
		//p
		//System.out.println(node.data);
		result[count] = node.data;
		++count;
		
		//r
		if(node.rchild!=null)
			inorder (node.rchild);
	}
	
	
	public int [] inorder () {
		result = new int [getCount(root)];
		count = 0;
		inorder(root);
		return result;
	}
	
	private void preOrder(BTNode node) {
		if(node == null)
			return;
		
		// p
		result[count] = node.data;
		count++;
		
		//left
		if(node.lchild !=null) 
			preOrder(node.lchild);
		
		//right
		if(node.rchild!=null)
			preOrder(node.rchild);
	}

	private int getCountPre(BTNode node) {
		if(node == null)
			return 0;
				
		int count = 0;
		// p
		++count;
		
		//left
		if(node.lchild !=null) 
			count +=getCountPre(node.lchild);
		
		//right
		if(node.rchild!=null)
			count +=getCountPre(node.rchild);
		
		return count;
	}
	public int[] preOrder () {
		result = new int[getCountPre(root)];
		count = 0;
		preOrder(root);
		return result;
	}
	
	private void postOrder(BTNode node) {
		if(node ==null)
			return;
		//left
		if(node.lchild!=null)
			postOrder (node.lchild);
		//right
		if(node.rchild!= null)
			postOrder (node.rchild);
		//pro
		result[count] = node.data;
		count++;
	}
	
	private int getCountPost(BTNode node) {
		if(node ==null)
			return 0;
		int count = 0;
		//left
		if(node.lchild!=null)
			count +=getCountPost(node.lchild);
		//right
		if(node.rchild!= null)
			count +=getCountPost(node.rchild);
		//pro
		++count;
		return count;
	}
	
	public int [] postOrder() {
		result = new int [getCountPost(root)];
		count = 0;
		postOrder(root);
		return result;
	}
	
	private int leafCounter (BTNode node) {
		if(node == null)
			return 0;
		
		 count =0;
		if(node.lchild != null)
			leafCounter(node.lchild);
		
		if(node.rchild != null)
			leafCounter(node.rchild);
		
		++count;
		
		return count;
	}
	
	public int leafCounter() {
		int count = leafCounter(root);
		return count;
	}
	
	public void createBinaryTree01() {
		BTNode n1,n2,n3,n4;
		n1 = new BTNode(1);
		n2 = new BTNode(2);
		n3= new BTNode(3);
		n4 = new BTNode(4); 
		
		n1.lchild =n2;
		n1.rchild = n3;
		
		n2.lchild = n4;
		
		root = n1;
}
	public void createBinaryTree02() {
		BTNode n1,n2,n3,n4,n5,n6;
		n1 = new BTNode(1);
		n2= new BTNode(2);
		n3= new BTNode(3);
		n4 = new BTNode(4);
		n5= new BTNode(5);
		n6 = new BTNode(6);
		
		n1.lchild = n2;
		n1.rchild = n3;
		
		n2.lchild = n4;
		n3.lchild = n5;
		n3.rchild = n6;
		
		root = n1;
		
	}
}