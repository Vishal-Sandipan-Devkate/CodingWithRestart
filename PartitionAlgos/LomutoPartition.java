import java.util.Arrays;
public class LomutoPartition{
	static void partition(int[] arr){
		int n = arr.length;
		int pivot = arr[n-1];
		// i acts as boundry between smaller and lerger elemants compared to pivot
		int i =-1;
		for(int j=0;j<n;j++){
			// if smaller element found expand the boundary and swapping it with boundary element
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] =temp;
			}
		}
		// place the pivot at its correct position
		int temp = arr[i+1];
		arr[i+1] = arr[n-1];
		arr[n-1] = temp;

	}

	public static void main(String[] args){
		int[] arr = {5, 13, 6, 9, 12, 11, 8};
		partition(arr);
		for(int ele: arr)
			System.out.print(ele + " ");
	}
}

