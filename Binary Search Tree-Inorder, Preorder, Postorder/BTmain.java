package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class BTmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BTImplimentation bt01 = new BTImplimentation();
		BTImplimentation bt02 = new BTImplimentation();
		
		int[] result;
		int ch;
		bt01.createBinaryTree01();
		bt02.createBinaryTree02();
		do {
			System.out.println("1.Inorder traversal\n" + "2.PreOrder Traversal\n" + "3.PostOrderTraversal\n"
					+ "4.Count Leaf nodes\n"+"5.Exit \n" + "Enter your choice ");
			
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				result = bt02.inorder();
				System.out.println(Arrays.toString(result));
				break;
				
			case 2:
				result = bt02.preOrder();
				System.out.println(Arrays.toString(result));
				break;
				
			case 3:
				result = bt02.postOrder();
				System.out.println(Arrays.toString(result));
				break;

			case 4:
				System.out.println("Leaf nodes in the tree are : "+ bt02.leafCounter());
				break;
				
				
			case 5:
				System.out.println("Thank you!");
				break;
			
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (ch != 5);

		sc.close();
	}

}
