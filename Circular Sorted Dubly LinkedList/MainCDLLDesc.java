package Question2;

import java.util.Arrays;
import java.util.Scanner;

public class MainCDLLDesc {

	public static void main(String[] args) {

		CDLLDescSorted obj = new CDLLDescSorted();
		Scanner sc = new Scanner(System.in);
		int ch ; 
		do {
			System.out.println("1.Add elemments\n" +
														"2.Search elements\n" +
														"3.Display elements\n"+
														"4. Delete Element\n" +
														"5.Exit");
			ch =sc.nextInt();
			switch (ch) {
			case 1:
				obj.Insert(sc.nextInt());
				break;

			case 2:
				System.out.println(obj.Search(sc.nextInt()));
				break;

			case 3:
				System.out.println(Arrays.toString(obj.getElements()));
				break;
			

			case 4:
				obj.Delete(sc.nextInt());
				break;
							
			case 5:
				System.out.println("Thank you!");
				break;
				
			default:
				System.out.println("Invalid choice!");
				break;
			}
		}while(ch!=5);
		sc.close();
	}
	

}
