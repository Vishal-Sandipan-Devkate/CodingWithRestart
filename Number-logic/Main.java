import java.util.*;

// class to find the sum of all digits in number
class SumOfDigitInNumber{
	int additionOfDigit(int num){
		int sum = 0;
		while(num>0){
			sum +=num%10;
			
			// termination condiation
			num/=10;
		}
		return sum;
	}
	
}

// class to find largest digit in number
class LargestNumber{ 
		public int findLargeDigit(int num){
		
		// we initialize the large number is 0 because we compare with all digit in num
		// 0  is  small so any large occur then large digit change
		int largeDigit=0;

		while(num>0){
			int digit = num%10;
			if(digit>largeDigit){
				largeDigit=digit;
			}
			num /= 10;
		}
		return largeDigit;
	}
}


// class to find smallest digit in number
class SmallestDigitInNumber{
	int findSmallDigit(int num){

		//we assign samll digit = 9 to compare with digit in number
		// so if we get any number greater than that small digit var is changed
		int smallDigit=9;

		while(num>0){
			int digit = num%10;
			if(digit<smallDigit){
				smallDigit=digit;
			}
			num/=10;
		}
		return smallDigit;
	}
}

public class Main{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number:");

			// Scanner object creation 
			int num = sc.nextInt();



			// LargestNumber ln = new LargestNumber();
			// int largeDigit = ln.findLargeDigit(num);
			// System.out.println("Largext Digit:" + largeDigit)

			// SmallestDigitInNumber sm = new SmallestDigitInNumber();
			// int smallDigit = sm.findSmallDigit(num);
			// System.out.println("Smallest Digit in number:"+ smallDigit);

			// SumOfDigitInNumber sod = new SumOfDigitInNumber();
			// int result = sod.additionOfDigit(num);
			// System.out.println("sum of digits in number:" + result);


			// close scanner object
			sc.close();
	}
}
			
