import java.util.Arrays;

class MergeArray {
	void mergeArrayNoExtraSpace(int[] arr1, int[] arr2) {
		int n = arr1.length, m = arr2.length;
		int i = n - 1, j =0;
		// swap the element of array
		while(i>=0 && j<m) {
			if(arr1[i] > arr2[j]){
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
			}
			i--;
			j++;
		}
		
		// sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return ;
	}
}

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 6, 18, 20, 22};
		int[] arr2 = { 2, 5, 15, 16};

		MergeArray ma = new MergeArray();
		ma.mergeArrayNoExtraSpace(arr1, arr2);
		for(int i = 0; i< arr1.length; i++)
			System.out.print(arr1[i]+" ");

		System.out.println();
		for(int i = 0; i< arr2.length; i++)
			System.out.print(arr2[i]+" " );
	}
}


