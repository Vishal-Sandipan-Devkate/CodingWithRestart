import java.util.*;

 class SortingArrayNaiveApproch{
	// fuction to find the largest elemant in array
	int getSecondLargestElement(int [] arr){
		int n = arr.length;
		// sort arrayr in non-decreasing order
		Arrays.sort(arr);

		//find second largest element in array
		for(int i=n-2; i>=0; i--){
			//checing the element is not equal to largest, there can be repeataion of number
			if(arr[i]!=arr[n-1]){
				return arr[i];
			}
		}
		//else return element not found	
		return -1;
	}
	// Time Complexity O(n*log(n)) = O(n*log(n) +O(n) = array sorting time + array traverse time
	// Space complexity (1) = No extra space required
}

class TwoPassSearch{
	// Method to find second largest element
	int getSecondLargestElement(int [] arr){
		// Declaring largest and Second largest Element as -1 for false case
		int largestElement = -1;
		int secondLargestElement = -1;
		// it require to traverse the array as condition
		int n = arr.length;
		
		//First pass to find the largest element
		for(int i=0; i<n;i++){
			if(arr[i] > largestElement){
				largestElement = arr[i];
			}
		}

		// Second pass for finding Second largest element
		for(int i=0;i<n;i++){
			if(arr[i] > secondLargestElement && arr[i] != largestElement){
				secondLargestElement = arr[i];
			}
		}
		return secondLargestElement;
	}
	// Time Complexity O(2*n) = O(n)
	// Space Complexity O(1) - no extra space required
}


class OnePassApproch{
	// method to find second largest array
	int secondLargest(int [] arr){
		// declare largest and second largest equal to -1 for false case
		int largest = -1;
		int secondLargest = -1;
		// require array length to traverse
		int n = arr.length;
		for(int i = 0; i < n; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest){
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	//Time Complexity = O(n)
	//space Complexity = O(1)
}


class SecondLargestElement{
	public static void main(String[] args){
		// the example array
		int arr[] ={12,10,25,34,35,35,33};
		//SortingArrayNaiveApproch sana = new SortingArrayNaiveApproch();
		//int secondLargest= sana.getSecondLargestElement(arr);
		//System.out.println("The Second Largest Element :" + secondLargest);
		
		// Two pass search approch
		//TwoPassSearch tps = new TwoPassSearch();
		//System.out.println("Two pass search result:"+ tps.getSecondLargestElement(arr));

		// One pass approch
		OnePassApproch opa = new OnePassApproch();
		System.out.println("One pass approch result:"+ opa.secondLargest(arr));

	}
}


