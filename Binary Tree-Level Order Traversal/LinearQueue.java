package Question1;

public class LinearQueue implements QueueIntf {

	LinearQueueNode front;
	LinearQueueNode rear;

	public LinearQueue() {
		front = null;
		rear = null;
	}

	@Override
	public void AddQ(BTNode node) {
		LinearQueueNode newNode = new LinearQueueNode();
		newNode.data = node;
		newNode.next = null;
		if (front == null) {
			front = newNode;
			rear = newNode;
			System.out.println("Executed");
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}

	@Override
	public BTNode DeleteQ() {

		if (isEmpty())
			throw new LinearQException("Queue is empty");
		LinearQueueNode temp = front;
		LinearQueueNode curr = front;

		if (front == rear) {
			front = null;
			rear = null;
			return temp.data;
		}

		front = front.next;
		return temp.data;

	}

	@Override
	public boolean isEmpty() {
		if (rear == null)
			return true;
		return false;
	}

}
