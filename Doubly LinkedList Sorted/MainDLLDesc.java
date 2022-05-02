package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class MainDLLDesc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DLLDescending obj = new DLLDescending();
		int choice;
		do {
			System.out.println("1.Insert the element\n" + "2. Delete the Element \n" + "3. Search element\n"
					+ "4.Display elements\n" + "5.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.Insert(sc.nextInt());
				break;

			case 2:
				obj.Delete(sc.nextInt());
				break;

			case 3:
				System.out.println(obj.Search(sc.nextInt()));
				break;

			case 4:
				System.out.println(Arrays.toString(obj.GetElement()));
				break;

			case 5:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Invalid choice!");
				break;
			}
		} while (choice != 5);
	}

}
