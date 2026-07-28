import java.util.*;

public class ArrayElementMultiplication{
	// method signature
static void arrayEleMulti(int[] arr){
		// for multiplication we have to initialize the variable equal to one (1)
		int mul = 1;
		int n = arr.length;
		for(int i=0;i<n;i++){
			mul *= arr[i];
		}
		System.out.println("Multiplication of array:"+ mul);
		return;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in arry:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}

		arrayEleMulti(arr);
		sc.close();
	}
}
