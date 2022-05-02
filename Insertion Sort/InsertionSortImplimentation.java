package Question3;

import java.util.Arrays;

public class InsertionSortImplimentation {

	public static int [] insertionSort(int arr[]) {
		int sortsize, i;
		for(sortsize = 1 ; sortsize<arr.length ; ++sortsize) {
			int newelement=arr[sortsize];
			i = sortsize-1;
			while (i>=0) {
				if(newelement <arr[i]) 
					break;
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = newelement;
		}
		return arr;
}
}