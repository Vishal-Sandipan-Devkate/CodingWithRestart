import java.util.Arrays;

public class QuickSort{
	//partition function
	static int partition(int[] arr, int low, int high){
		//chose the pivot
		int pivot = arr[high];
		// index of smaller elements and indicates the right position of pivot found so far
		int i = low - 1;
		// traver array low to high and move all small ele to left side. ele from low to i are smaller afert every iteration
		for(int j = low; j <=high -1; j++){
			if(arr[j] < pivot){
				i++;
				swap(arr, i ,j);
			}
		}
		// move pivot after smaller element and return position 
		swap(arr, i+1, high);
		return i+1;
	}

	// swap function
	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void quickSort(int[] arr, int low, int high){
		if(low<high){
			// pi partition return index of pivot
			int pi = partition(arr, low, high);
			// recursion call for smaller ele and greater or equals ele
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}

	public static void main(String[] args){
		int[] arr = {10, 7, 8, 9, 1, 5};
		int n = arr.length;

		quickSort(arr, 0, n-1);
		for(int val : arr)
			System.out.print(val + " ");
	}
}

