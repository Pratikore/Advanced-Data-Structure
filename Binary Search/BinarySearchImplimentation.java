package Question4;

public class BinarySearchImplimentation {
	
	public static boolean searchElement(int arr[] , int element) {
		int left,mid,right;
		left = 0;
		right =arr.length-1;
		
		while(left<=right) {
			mid = (left+right)/2;
			if(element == arr[mid])
				return true;
			else
				if(element >arr[mid]) 
					left = mid+1;
				else
					right = mid-1;
		}
		
		return false;
	}

}
