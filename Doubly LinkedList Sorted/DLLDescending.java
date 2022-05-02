package Question1;

public class DLLDescending {

	DLLNode head;
	DLLNode tail;

	public DLLDescending() {
		head = null;
		tail = null;
	}

	// 1. Insert function

	public void Insert(int element) {
		// create sp
		DLLNode newNode = new DLLNode();
		newNode.data = element;

		if (IsEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}

		DLLNode curr = head;
		while (curr != null) {
			if (curr.data < element)
				break;
			curr = curr.next;
		}

		if (curr == null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			return;
		}

		if (curr == head) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}

		newNode.prev = curr.prev;
		curr.prev.next = newNode;
		newNode.next = curr;
		curr.prev = newNode;
		return;
	}

	public void Delete(int ele) {
		if (IsEmpty()) {
			throw new DLLDescendingException("List is empty!");
		}

		DLLNode curr = head;
		while (curr != null) {
			if (curr.data == ele)
				break;
			curr = curr.next;
		}

		if (curr == head) {
			head = curr.next;
			curr.next = null;
			head.prev = null;
			System.out.println("Deleted!");
			return;
		}

		if (curr == tail) {
			tail = curr.prev;
			curr.prev = null;
			tail.next = null;
			System.out.println("Deleted!");
			return;
		}

		if (curr == null)
			throw new DLLDescendingException("Element dosen't exist!");

		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		System.out.println("Deleted!");
		return;
	}

	public boolean Search(int ele) {
		if (IsEmpty()) {
			throw new DLLDescendingException("List is empty!");
		}

		DLLNode curr = head;
		while (curr != null) {
			if (curr.data == ele)
				return true;
			curr = curr.next;
		}
		return false;
	}


	public int GetCount() {
		int count = 0;
		DLLNode curr=head;

		while (curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}

	public int[] GetElement() {
		if (head == null) {
			System.out.println("List is empty");
		}

		int elements[] = new int[GetCount()];
		int i = 0;
		DLLNode curr = head;

		while (curr != null) {
			elements[i] = curr.data;
			curr = curr.next;
			i++;
		}
		return elements;
	}

	
	public boolean IsEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
}
