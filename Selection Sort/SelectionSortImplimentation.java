package Question2;

public class SelectionSortImplimentation {

	public static int[] SelectionSortDesc(int arr[]){
	
		int flag = arr.length-1;
		while (flag >0) {
			for (int i = flag-1 ; i>=0 ; i--) {
				if(arr[flag] > arr[i]) {
					int temp = arr[flag];
					arr[flag] = arr[i];
					arr[i] = temp;
				}
			}
			flag --;
		}
		return arr;
	}
}
