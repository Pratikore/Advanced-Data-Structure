package Question1;

import java.util.Scanner;
import static Question1.LinearSearchImplimentation.*;
public class LinearSearchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int []arr= {1,2,3,4,5,6};
		System.out.println("Enter the element to search");
		int ele = sc.nextInt();
		if(linearSearch(arr,ele))
			System.out.println("Element found");
		else 
			System.out.println("Element not found");
	}

}
