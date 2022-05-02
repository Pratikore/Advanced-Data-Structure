package Question4;

import static Question3.BubbleSortAscImplimentation.bubbleSort;
import static Question4.BinarySearchImplimentation.searchElement;

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr [] = {20,60,10,30,2,4,90};
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		if(searchElement(arr, 100))
		System.out.println("Element found at index" );
		else 
			System.out.println("Element not found");
	}

}
