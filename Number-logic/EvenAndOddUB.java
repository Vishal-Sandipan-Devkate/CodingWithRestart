import java.util.*;
class Process{
	boolean isOdd(int n){
		if((n&1)==1){ 
			return true;
		}else{
			return false;
		}
	}
}
public class EvenAndOddUB{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		Process ps = new Process();
		if(ps.isOdd(n)==true){
			System.out.println("odd:true");
		}else{
			System.out.println("Even:true");
		}
	}
}

