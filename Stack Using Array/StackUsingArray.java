package utils;

import exceptions.StackUnderFlowException;
import implementation.StackIntf;

public class StackUsingArray implements StackIntf 
{
	int[] stack;
	int top;
	int n;
	
	public StackUsingArray(int n) 
	{
		this.n = n;
		stack = new int[n];
		top = -1;
	}
	
	@Override
	public void push(int number)
	{
		stack[++top] = number;
	}

	@Override
	public int pop()
	{
		if(isEmpty())
			throw new StackUnderFlowException("Stack is empty, no element can be retrieved.");
		
		return stack[top--];
	}

	@Override
	public boolean isFull() 
	{
		if(top == (n - 1))
			return true;
		return false;
	}

	@Override
	public boolean isEmpty() 
	{
		if(top == -1)
			return true;
		return false;
	}

	@Override
	public int peek() throws StackUnderFlowException 
	{
		if(isEmpty())
			throw new StackUnderFlowException("Stack is empty, no element to peek.");
	
		return stack[top];
	}
}
