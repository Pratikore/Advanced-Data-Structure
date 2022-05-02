package Question3;

import java.util.Arrays;

public class InsertionSortMain {

	public static void main(String[] args) {

		int arr [] = {20,30,10,50,5,6,0};
		System.out.println(Arrays.toString(arr));
		arr=InsertionSortImplimentation.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
