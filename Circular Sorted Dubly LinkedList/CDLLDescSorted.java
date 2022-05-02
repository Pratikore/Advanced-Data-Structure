package Question2;


public class CDLLDescSorted {

	CDLLNode head;
	
	public CDLLDescSorted () {
		head = new CDLLNode(-1);
		
		head.next = head;
		head.prev = head;
	}
	
	public void Insert( int element) {
		
		CDLLNode newNode = new CDLLNode(element);
		
		CDLLNode curr = head.next;
		newNode.data = element;
		newNode.prev = newNode.next = null;
		
		while(curr!=head) {
			if(curr.data < element)
				break;
			curr = curr.next;
		}
		
		newNode.prev = curr.prev;
		newNode.next = curr;
		
		curr.prev.next = newNode;
		curr.prev = newNode;
		return;
	
	}


	public void Delete(int ele) {
		CDLLNode curr = head.next;
		while(curr!=head) {
			if(curr.data == ele)
				break;
			curr = curr.next;
		}
		
		if(head.next == head) {
			System.out.println("List is empty!");
			return;
		}
		
		if(curr == head) {
			System.out.println("Element not found!");
			return;
		}
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		System.out.println("Deleted!");
		return;
	}

	public int getCount() {
		int count = 0;
	    CDLLNode current;

		current = head.next;
		while (current != head) {
			++count;
			current = current.next;
		}

		return count;
	}

	public int[] getElements() {
		int elements[] = new int[getCount()];
		int i = 0;
		CDLLNode current;

		current = head.next;
		while (current != head) {
			elements[i] = current.data;
			++i;
			current = current.next;
		}
		return elements;
	}

	public boolean Search(int ele) {
		CDLLNode curr = head.next;
		while(curr!=head) {
			if(curr.data== ele)
				return true;
			curr = curr.next;
		}
		return false;
	}
	
}
