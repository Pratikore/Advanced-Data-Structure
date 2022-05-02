package Question2;

import static Question2.BubbleSortImplimentation.*;

import java.util.Arrays;
public class BubbleSortMain {
	public static void main(String[] args) {
		int arr[] = {10,2,50,33,2,9,1};
		System.out.println("Array before sorting = " + Arrays.toString(arr));
		System.out.println("Array after sorting = " +Arrays.toString(bubbleSort(arr)) );
	}

}
