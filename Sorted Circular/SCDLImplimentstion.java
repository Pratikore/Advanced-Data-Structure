package Question1;

public class SCDLImplimentstion {

	SCDLNode head;
	SCDLNode curr;
	
	public SCDLImplimentstion() {
		super();
		head= new SCDLNode(-1);
		head.next = head;
		head.prev = head;
		this.curr = null;
	}
	
	public void insert(int ele) {
		SCDLNode newNode = new SCDLNode(ele);
		
		if(head.next== head) {//list is empty
		head.next = newNode;
		head.prev= newNode;
		newNode.prev = head;
		newNode.next = head;
		}
		
		curr = head.next;
		while(curr!= head) {
			if(curr.data >ele)
				break;
			curr = curr.next;
		}
		
		curr.prev.next = newNode;
		newNode.prev = curr.prev;
		newNode.next = curr;
		curr.prev = newNode;
		
	}
	
	public void delete(int element) {

		if(head.next == head)
			System.out.println("List is empty!");
		
		curr = head.next;
		while(curr!= head) {
			if(curr.data == element)
				break;
			curr = curr.next;
		}		
		
		if(curr == head) {
			System.out.println("Element not found");
		return;
		}
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		curr.prev= curr.next = null;
		System.out.println("deleted!");
	}
	
	public void deleteAll() {
		head.next = head;
		head.prev = head;
	}
	

	
	private int getCount (SCDLNode node) {
		int count = 0;
		if(head.next == head)
			return count;
		
		curr = head.next;
		while(curr!= head) {
			curr = curr.next;
			count++;
		}		
		return count;
	}
	
	public int [] display() {
		int arr[] = new int [getCount(head)];
		int i=0;
		curr = head.next;
		while(curr!=head) {
			arr[i] = curr.data;
			System.out.println(curr.data);
			curr = curr.next;
			i++;
		}
		return arr;
	}
}
