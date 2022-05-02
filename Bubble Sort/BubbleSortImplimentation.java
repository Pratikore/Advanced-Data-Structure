package Question2;

public class BubbleSortImplimentation {

	public static int[] bubbleSort(int[] arr) {
		int flag = arr.length - 1;
		while (flag >= 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			flag--;
		}
		return arr;
	}
}
