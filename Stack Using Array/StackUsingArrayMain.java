package tester;

import java.util.Scanner;

import exceptions.StackOverflowException;
import utils.StackUsingArray;

public class StackUsingArrayMain 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the size of the stack");
			int n = sc.nextInt();
			StackUsingArray st = new StackUsingArray(n);
			
			boolean flag = true;
			while(flag)
			{
				System.out.println("\n1. Push element to the stack.\n2. Pop element from the stack.\n3. Peek at the stack\n4. Exit\nChoose an appropriate option");
				try
				{
					switch (sc.nextInt()) 
					{
						case 1: System.out.println("Enter element to push in the stack");
								if(st.isFull())
									throw new StackOverflowException("Stack is full, no element can be added.");
								else
									st.push(sc.nextInt());
						break;
						
						case 2: System.out.println("Element to poped from the stack : " +st.pop());break;
						
						case 3: System.out.println("Element at the top of the stack : " +st.peek());break;
						
						case 4: flag = false;
								System.out.println("End of program");
						break;

						default: System.out.println("Enter valid choice");break;
					}
					sc.nextLine();
				}
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
				}
			}
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
