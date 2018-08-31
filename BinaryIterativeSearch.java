import java.util.Arrays;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "BinaryIterativeSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		
		while (start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == target) return mid;		
			else if(arr[mid] < target) start = mid+1;
			else end = mid-1;
		}
		return -1;
	}

}
