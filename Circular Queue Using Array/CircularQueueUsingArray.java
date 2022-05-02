package Question2Circular;

import java.util.Arrays;

public class CircularQueueUsingArray implements CircularQueueIntf {

	int front;
	int rear;
	int queue[];

	public CircularQueueUsingArray(int size) {
		super();
		this.front = 0;
		this.rear = 0;
		queue = new int[size];
	}

	@Override
	public void addQ(int element) throws CiQueueException {
		 if (!isFull() ){
			 rear = (rear+1) % queue.length;
			
		} else
			throw new CiQueueException("Queue is full");
	}

	@Override
	public int deleteQ() throws CiQueueException {
		if (!isEmpty()) {
			int element = queue[front];
			front = (front+1)% queue.length;
			//int temp = 0;
			//++front;
//			while (temp < queue.length - 1) {
//				queue[temp] = queue[(temp + 1)];
//				if (temp == queue.length - 2)
//					queue[temp + 1] = 0;
//				temp++;
//			}
			return element;
		} else {
			throw new CiQueueException("Queue is Empty");
		}
	}

	@Override
	public boolean isEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if ((rear +1)% queue.length== front)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(queue);
	}

}
