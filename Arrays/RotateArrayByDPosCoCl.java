import java.util.*;

class OneEleAtTime{
	void rotateArray(int [] arr, int d){
		int n = arr.length;
		// passes for rotation of individual
		for(int j=1; j<=d; j++){

			// temp store array's first element 
			int first = arr[0];

			// Move each element one position to left
			for(int i=0; i<n-1; i++){
				arr[i] = arr[i+1];
			}
			// now insert first elelment to last
			arr[n-1] = first;
		}
		return;
	}
	// TC = O(n*d)
	// SC = O(n)
}

class TempArrayExtraSpace{
	void rotateArray(int [] arr, int d){
		int n = arr.length;
		// if d > n
		d = d % n;
		// temp array to store the rotated elements
		int temp[] = new int[n];
		
		// first task- move n-d elements to temp array
		for(int i=0; i<n-d; i++){
			temp[i] = arr[d+i];
		}

		// second task - copy first d elements to temp
		for(int i=0; i<d; i++){
			temp[n-d+i] = arr[i];
		}

		//third task - copy temporary array to original array
		for(int i=0; i<n; i++){
			arr[i] = temp[i];
		}
		return;
	}
	// TC = O(n)
	// SC = O(n)
}

class JugglingAlgorithm{
	void rotateArray(int [] arr, int d){
		int n = arr.length;
		// handling d > n
		d = d % n;
		
		// claculating cycles required to ratate the array
		int cycles = findGCD(n, d);

		// shifting of each element through cycles
		for(int i=0; i<cycles; i++){
			// start element of current cycle
			int startEle = arr[i];
			// current index of cycle
			int currentIdx = i, nextIdx;
			// let rotate element till we reach the start of the cycle
			while(true){
				nextIdx = (currentIdx + d) % n;

				if(nextIdx == i){
					break;
				}

				// update next index with current index
				arr[currentIdx] = arr[nextIdx];
				currentIdx = nextIdx;
			}
			arr[currentIdx] = startEle;
		}
		return; 
	}

	// function to find gcd it requiared to calculate num of cycles
	int findGCD(int a , int b){
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}

class ReversalAlgorithmApproch{
	void rotateArray(int [] arr, int d){
		int n = arr.length;
		// handling d>n
		d = d % n;
		// task one - reverse the d elements of arr[0:d-1]
		reverseArray(arr, 0, d-1);
		// task two - reverse the next sub array arr[d:n-1]
		reverseArray(arr, d, n-1);
		// task-3 reverse the entire array arr[0:n-1]
		reverseArray(arr, 0, n-1);
		return;
	}

	// let first define the array reverse function
	void reverseArray(int [] arr, int left, int right){
		while(left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return;
	}
}
public class RotateArrayByDPosCoCl{
	public static void main(String[] args){
		int []arr = {1, 2 , 3, 4, 5, 6};
		//OneEleAtTime oeat = new OneEleAtTime();
		//oeat.rotateArray(arr,2);
		
		//TempArrayExtraSpace taes = new TempArrayExtraSpace();
		//taes.rotateArray(arr, 10);

		//JugglingAlgorithm ja = new JugglingAlgorithm();
		//ja.rotateArray(arr, 20);

		ReversalAlgorithmApproch raa = new ReversalAlgorithmApproch();
		raa.rotateArray(arr, 21);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
}

