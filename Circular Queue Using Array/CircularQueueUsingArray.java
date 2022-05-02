package utils;

import exceptions.QueueException;
import implementation.QueueIntf;

public class CircularQueueUsingArray implements QueueIntf 
{
	int front, rear;
	int size;
	int[] queue;
	
	public CircularQueueUsingArray(int size) 
	{
		this.size = size;
		queue = new int[size];
		front = rear = 0;
	}

	@Override
	public void addQ(int element) 
	{
		if(isFull())
			throw new QueueException("Queue already full, can't add new elements.");
		
		queue[rear] = element;
		
		rear = (rear+1)%size;
	}

	@Override
	public int deleteQ()
	{
		if(isEmpty())
			throw new QueueException("Queue is empty, no element to delete.");
		
		int num = queue[front];
		front = (front+1)%size;
		return num;
	}

	@Override
	public boolean isEmpty() 
	{
		if(front == rear)
			return true;
		return false;
	}

	@Override
	public boolean isFull() 
	{
		if((rear+1)%size == front)
			return true;
		return false;
	}
}
