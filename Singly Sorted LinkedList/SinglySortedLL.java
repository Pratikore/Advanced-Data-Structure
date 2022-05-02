package Ouestion1;

public class SinglySortedLL {

	SLLNode head;
	SLLNode curr;
	SLLNode prev;

	public SinglySortedLL() {
		super();
		this.head = null;
		this.curr = null;
		this.prev = null;
	}

	public void InsertInList(int element) {

		SLLNode newNode = new SLLNode();
		newNode.data = element;
		newNode.next = null;
		
		if (IsEmpty()) {
			head = newNode;
			return;
		}

		curr = head;
		
		while (curr!= null) {
			if (curr.data < element) 
				break;
				prev = curr;
				curr =curr.next;
			}
			
			if(curr == head ) {
					head = newNode;
					newNode.next = curr;
				return;
			}
			
			if(curr== null) {
				prev.next = newNode;
				return;
			}
			
			newNode.next = curr;
			prev.next = newNode;
	}

	public int Delete(int element) {
		if (IsEmpty()) {
			throw new SortedLLException("List is Empty!");
		}
		
		curr = head;
		
		while (curr != null) {
			if (curr.data == element) 
				break;
			prev = curr;
			curr = curr.next;
		}

		if (curr == null) {
			throw new SortedLLException("Element dosen't exist! ");
		}
		
		if (curr== head) {
			SLLNode temp =curr;
			head = curr.next;
			curr.next = null;
			return temp.data;
		}
		
		else {
			SLLNode temp  = curr;
			curr = curr.next;
			prev.next = curr;
			temp.next =null;
			return temp.data;
		}
	}
	
	public boolean Search (int element) {
		if(IsEmpty()) {
			throw new SortedLLException("List is empty !");
		}
		
		curr = head;
		while (curr!= null) {
			if(curr.data == element) {
				return true;
			}
				curr = curr.next;
		}
		return false;
	}

	public void DeleteAll () {
		if(IsEmpty()) {
			throw new SortedLLException("List is empty!");
		}
		while(head != null) {
			head = head.next;
		}
	}
	

	public int GetCount() {
		int count = 0;
		curr = head;

		while (curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}

	public int[] GetElement() {
		if (IsEmpty()) {
			throw new SortedLLException("LinkedList is Empty!");
		}

		int elements[] = new int[GetCount()];
		int i = 0;
		curr = head;

		while (curr != null) {
			elements[i] = curr.data;
			curr = curr.next;
			i++;
		}
		return elements;
	}


	public boolean IsEmpty() {
		if (head == null)
			return true;
		return false;
	}

}
