package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class SCDLMain {

	public static void main(String[] args) {

		SCDLImplimentstion obj = new SCDLImplimentstion();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Insert the element \n" +
		"2.Delete the element\n" +
					"3.Delete All elements\n" +
		"4.Display the elements\n "+
					"5.Exit\n" +
		"Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				obj.insert(sc.nextInt());
				break;

			case 2:
				obj.delete(sc.nextInt());
				break;
				
			case 3:
				obj.deleteAll();
				break;
				
			case 4:
				System.out.println(Arrays.toString(obj.display()));
				break;
				
			case 5:
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while (ch !=5);
	}

}
