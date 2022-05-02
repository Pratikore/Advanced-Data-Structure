package Question2Circular;

import java.util.Scanner;

public class MainProgCircularQueue {

	public static void main(String[] args) throws CiQueueException {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of the queue");
		
		CircularQueueUsingArray lqobj = new  CircularQueueUsingArray(scan.nextInt());
		
		lqobj.addQ(10);
		lqobj.addQ(20);
		lqobj.addQ(30);
		lqobj.addQ(40); //10-20-30-40
					
		lqobj.deleteQ();
		lqobj.deleteQ();
		//lqobj.deleteQ();
		//lqobj.deleteQ();
		//lqobj.deleteQ();
		System.out.println(lqobj);
	}

}
