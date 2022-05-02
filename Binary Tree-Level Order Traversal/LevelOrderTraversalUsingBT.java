package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class LevelOrderTraversalUsingBT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BTImplimentation bt02 = new BTImplimentation();
		
		int[] result;
		int ch;
		bt02.createBinaryTree02();
		do {
			System.out.println("1.LevelOrderTraversal\n"+"2.Exit \n" + "Enter your choice ");
			
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				result = bt02.levelOrderTraversal();
				System.out.println(Arrays.toString(result));
				break;
								
			case 2:
				System.out.println("Thank you!");
				break;
			
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (ch != 2);

		sc.close();
	}

}
