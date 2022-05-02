package utils;

import exceptions.QueueException;
import implementation.QueueIntf;

public class LinearQueueUsingArray implements QueueIntf 
{
	int front, rear;
	int size;
	int[] queue;
	
	public LinearQueueUsingArray(int size) 
	{
		this.size = size;
		queue = new int[size];
		front = rear = -1;
	}

	@Override
	public void addQ(int element) 
	{
		if(isFull())
			throw new QueueException("Queue already full, can't add new elements.");
		
		queue[++rear] = element;
		
		if(front == -1)
			front = 0;
	}

	@Override
	public int deleteQ()
	{
		if(isEmpty())
			throw new QueueException("Queue is empty, no element to delete.");
		
		return queue[front++];
	}

	@Override
	public boolean isEmpty() 
	{
		if(front > rear || front == -1)
			return true;
		return false;
	}

	@Override
	public boolean isFull() 
	{
		if(rear >= size)
			return true;
		return false;
	}
}
