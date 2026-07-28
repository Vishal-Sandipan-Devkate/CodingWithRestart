import java.util.*;

public class ArrayElementSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of elements in array:");
		int n = sc.nextInt();
		int sum=0; // varable to store sum of array
		int [] arr = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++){
			sum+=arr[i];
		}
		System.out.println("the total sum of array:"+ sum);
		sc.close();
	}
}

