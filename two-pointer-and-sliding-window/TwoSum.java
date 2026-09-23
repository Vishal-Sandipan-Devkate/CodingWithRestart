import java.util.ArrayList;

class SortedTwoSum {
	public ArrayList<Integer> twoSumSorted(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1 ;

		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target){
				ArrayList<Integer> result = new ArrayList<>();
				result.add(arr[left]);
				result.add(arr[right]);
				return result;
			}
			else if( sum < target){
				left++;
			}
			else{
				right--;
			}
		}
		return new ArrayList<>();
	}
}

public class TwoSum {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		SortedTwoSum sts = new SortedTwoSum();
		ArrayList<Integer> output = sts.twoSumSorted(arr, 10);
		System.out.println(output);
	}
}

