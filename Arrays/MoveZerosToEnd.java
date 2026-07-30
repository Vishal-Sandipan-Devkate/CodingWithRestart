import java.util.*;

class NaiveApprochWithTemp{
	//function to move all zero to end 
	void moveZeroToEnd(int [] arr){
		int n = arr.length;
		// temp storage for the elements
		int [] temp = new int[n];

		int j = 0;
		// let first move all non-zero elements of array 
		for(int i=0; i<n; i++){
			if(arr[i] != 0){
				temp[j++] = arr[i];
			}
		}
		// filling reaming places with zeros
		while(j<n){
			temp[j++] = 0;
		}
		// copy all the temp array to original
		for(int i=0; i<n; i++){
			arr[i] = temp[i];
			}
		return;
	}
	// TC= O(n)
	// SC= O(n)
}

class TwoPassApproch{
	void moveZerosToEnd(int [] arr){
			int n = arr.length, count = 0;
			// fist task to move all non zero elements to front in array
			for(int i=0; i<n; i++){
				if(arr[i] != 0){ // Condition in move i th element only if it is not equal to 0
					arr[count++] = arr[i];
				}
			}
			// repalce reaming arry with zeros
			while(count < n){
				arr[count++] = 0;
			}
			return;
	}
	// TC = O(n)
	// SC = O(1)
}

class OnePassApproch{
	void moveZerosToEnd(int [] arr){
		int n = arr.length, count = 0;
		// instead above approch in this approch we are swapping the elements so totally inplace changes
		for(int i=0; i<n; i++){
			if(arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		return;
	}
	// TC = O(n)
	// SC = O(1)
}



public class MoveZerosToEnd{
	public static void main(String[] args){
		int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		//NaiveApprochWithTemp nawt = new NaiveApprochWithTemp();
		//nawt.moveZeroToEnd(arr);

		//TwoPassApproch tpa = new TwoPassApproch();
		//tpa.moveZerosToEnd(arr);

		OnePassApproch opa = new OnePassApproch();
		opa.moveZerosToEnd(arr);

		System.out.print("[");
		for(int i=0; i<arr.length; i++){
			System.out.print( arr[i] + ",");
		}
		System.out.print("]");
	}
}
