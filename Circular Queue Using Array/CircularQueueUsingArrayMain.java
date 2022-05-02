package tester;

import java.util.Scanner;

import exceptions.QueueException;
import utils.CircularQueueUsingArray;

public class CircularQueueUsingArrayMain 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the size of the Circular Queue");
			int n = sc.nextInt();
			CircularQueueUsingArray st = new CircularQueueUsingArray(n);
			
			boolean flag = true;
			while(flag)
			{
				System.out.println("\n1. Add element to the Linear Queue.\n2. Remove element from the Queue.\n3. Exit\nChoose an appropriate option");
				try
				{
					switch (sc.nextInt()) 
					{
						case 1: System.out.println("Enter element to add in the Queue");
								if(st.isFull())
									throw new QueueException("Queue is full, no element can be added.");
								else
									st.addQ(sc.nextInt());
						break;
						
						case 2: System.out.println("Element to removed from the Queue : " +st.deleteQ());break;
						
						case 3: flag = false;
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
