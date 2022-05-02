package Question1;

public class BTImplimentation {

	BTNode root;
	int [] result;
	int count;
	
	public BTImplimentation() {
		root  = null;
	}

	private void levelOrderTraversal(BTNode node) {
		 LinearQueue queue  = new LinearQueue();
		 queue.AddQ(node);
		 BTNode curr;
		while (!queue.isEmpty()) {
			curr = queue.DeleteQ();
			result[count] = curr.data;
			count++;
			if(curr.lchild!= null)
				queue.AddQ(curr.lchild);
			if(curr.rchild != null)
				queue.AddQ(curr.rchild);
		}
		
	}
	
	public int[]  levelOrderTraversal() {
		 result= new int[getCount(root)];
		count =0;
		levelOrderTraversal(root);
		return result;
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
		n2.rchild = n5;
		n3.rchild = n6;
		
		root = n1;
		
	}
}