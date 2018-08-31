import java.util.Arrays;

public class BinaryRecursiveSearch implements Practice2Search{

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "BinaryRecursiveSearch";
	}

	@Override
	//overload
	public int search(int[] arr, int target) {
		return search (arr, target, 0, arr.length-1);
	}
	
	public int search(int[] arr, int target, int left, int right) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int mid = left + (right-left)/2;
		
		if(target == arr[mid]) return mid;
		else if(target>arr[mid]) return search(arr, target, mid+1, right);
		return search(arr, target, left, mid-1);
	}
}
