class NaiveApprochUseTemp{
	void reverseArray(int [] arr){
		int n = arr.length, j=0;

		// first task- create temporary array
		int temp[] = new int[n];

		// second task- to copy the array element in reverse order
		for(int i=n-1; i>=0; i--){
			temp[j++] = arr[i];
		}

		// third task copy the temp array to original array as it is
		for(int i=0; i<n; i++){
			arr[i] = temp[i];
		}
		return;
	}
	// TC = O(n)
	// SC = O(n)
}

class TwoPointerApproch{
	void reverseArray(int [] arr){
		int n = arr.length;
		int left = 0, right = n-1;
		// traversing array till left < right
		while(left < right){
			int temp = arr[left];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
		return;
	}
	// Tc = O(n)
	// SC = O(n)
}

class OnePointerApproch{
	void reverseArray(int [] arr){
		int n = arr.length;
		for(int i=0; i < n/2; i++){
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

		return;
	}
	// TC = O(n)
	// SC = O(n)
}

// we can also reverse array using builtin functions - implement 


public class ReverseTheArray{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 6, 7, 8, 9};

		//NaiveApprochUseTemp naut =new NaiveApprochUseTemp();
		//naut.reverseArray(arr);
		
		//TwoPointerApproch tpa = new TwoPointerApproch();
		//tpa.reverseArray(arr);
		
		OnePointerApproch opa = new OnePointerApproch();
		opa.reverseArray(arr);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

