import java.util.Arrays;
public class NaiveApproch{
	static void partition(int[] arr){
		int n = arr.length;
		// last element as pivot value
		int pivot = arr[n-1];
		// temp arrray to store the element in order
		int[] temp = new int[n];
		int idx = 0;
		//first fill element smaller than or equal to pivot into temp array
		for(int i=0; i<n; i++){
			if(arr[i]<=pivot)
				temp[idx++] = arr[i];
		}
		// now fill the elements greater than pivot
		for(int i=0; i<n;i++){
			if(arr[i]>pivot)
				temp[idx++] = arr[i];
		}
		// copy temp array to original arr
		for(int i=0; i<n; i++){
			arr[i]=temp[i];
		}
	}
	public static void main(String[] args){
		int[] arr = {5, 13, 6,9, 12, 11, 8};
		partition(arr);

		for(int ele:arr){
			System.out.print(ele+" ");
		}
	}
}
