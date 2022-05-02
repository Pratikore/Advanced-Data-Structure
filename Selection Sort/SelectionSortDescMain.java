package Question2;
import static Question2.SelectionSortImplimentation.*;

import java.util.Arrays;
public class SelectionSortDescMain {

	public static void main(String[] args) {

		int arr[] = {50,44,66,22,33,99};
		System.out.println(Arrays.toString(arr));
		arr=SelectionSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
