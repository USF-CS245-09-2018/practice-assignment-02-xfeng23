
public class LinearSearch implements Practice2Search{

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "LinearSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i = 0; i<arr.length;i++) {
			if (target == arr[i]) return i;
		}
		return -1;
	}

}
