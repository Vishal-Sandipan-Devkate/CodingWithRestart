import java.util.*;
public class HoarePartition{
	static void partition(int[] arr){
		int n = arr.length;
		int pivot = arr[0];
		int i = -1, j = n;
		while(true){
			//find next element larger than pivot from the left
			do{
				i++;
			}while(arr[i] < pivot);

			// find next elemant smaller than pivot from right
			do{
				j--;
			}while(arr[j] > pivot);

			// if the left and right cross each other no swapping required
			if(i>j) break;

			// swap larger and smaller elements
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args){
		int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
		partition(arr);
		for(int ele: arr)
			System.out.print(ele + " ");
	}
}
