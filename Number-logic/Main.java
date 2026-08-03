 import java.util.*;
 
class PrintDigitOfNumber{
	void printDigit(int num){
		// repeat till num != 0
		while(num !=0){
			int digit = num % 10;
			System.out.println(digit);
			num = num / 10;
		}
		return;
	}
}

class CountNumberOfDigits{
	int countDigit(int num){
		int count = 0;
		while(num !=0){
			count++;
			num = num/10;
		}
		return count;
	}
}

// class to find largest even digit in number
class LargestEvenDigitInNumber{
	int largestEvenDigitFinder(int num){
		int largeEvenDigit=-1;
		while(num>0){
			int digit = num%10;
			if(digit % 2 == 0 && digit >largeEvenDigit){
				largeEvenDigit = digit;
			}
			num/=10;
		}
		return largeEvenDigit;
	}
}
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

class SmallestDigitInNumber{
	int findSmallDigit(int num){
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

class ReverseNumberAndPalindrome{
	// method to reverse the number
	int reverseNumber(int num){
		int revNum = 0;
		while(num != 0){
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		return revNum;
	}

	// Method to check the number is palindrome or not
	boolean numberPalindrome(int num, int revNum){
		if(revNum == num){
			return true;
		}
		else{
			return false;
		}
	}

}

class PrimeNumber{
	boolean isPrimeNotOptimized(int num){
		for(int i=2; i<=num-1; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	boolean isPrimeOptimized(int num){
		int n = (int) Math.sqrt(num);
		for(int i=2; i<=n; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
}

class LCMAndGCDCalculation{
	int calGCD(int a, int b){
		if(a<b){
			int temp = b;
			b = a;
			a = temp;
		}

		while(b!=0){
			int temp = b;
			b = a%b;
			a = temp;
		}

		return a;
	}

	int calLCM(int a, int b){
		int gcd = calGCD(a, b);
		return (a*b)/gcd;
	}

}

class ArmStrongNumber{
	boolean isArmstrong(int num){
		int original = num;
		int sum = 0;
		while(num!=0){
			int digit = num%10;
			sum = sum + (digit * digit * digit);
			num = num/10;
		}
		if(original == sum){
			return true;
		}
		return false;
	}
}

class PerfectNumberCheck{
	boolean isPerfectNumber(int num){
		// every number is perfectly divisible by 1
		int sum = 1;
		for(int i=2; i*i<num; i++){
			if(num%i == 0){
				int factorOne = i;
				int factorSecond = num/i;
				sum = sum + factorOne + factorSecond;
			}
		}
		if(sum == num){
			return true;
		}
		return false;
	}
}

			
public class Main{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number:");

			//Scanner object creation 
			int num = sc.nextInt();

			PerfectNumberCheck pnc = new PerfectNumberCheck();
			boolean perNumRe = pnc.isPerfectNumber(num);
			System.out.println("Number is perfect:" + perNumRe);

			 //ArmStrongNumber an = new ArmStrongNumber();
			 //boolean armNumResult = an.isArmstrong(num);
			 //System.out.println("Number is armstrong:" + armNumResult);

			
			//System.out.println("Enter the First Number:");
			//int num1 = sc.nextInt();
			//System.out.println("Enter the Second Number:");
			//int num2 = sc.nextInt();

			//LCMAndGCDCalculation lagc = new LCMAndGCDCalculation();
			//int gcdResult = lagc.calGCD(num1, num2);
			//System.out.println("GCD of number is :" + gcdResult);
			//int lcmResult = lagc.calLCM(num1, num2);
			//System.out.println("LCM of number is:" + lcmResult);


			//PrimeNumber pn = new PrimeNumber();
			//boolean primeResult = pn.isPrimeNotOptimized(num);
			//boolean primeResultOpt = pn.isPrimeOptimized(num);
			//System.out.println("Number is Prime:" + primeResult);
			//System.out.println("Numbber is Prime:"+ primeResultOpt);
	

			// LargestNumber ln = new LargestNumber();
			// int largeDigit = ln.findLargeDigit(num);
			// System.out.println("Largext Digit:" + largeDigit)

			// SmallestDigitInNumber sm = new SmallestDigitInNumber()			
			// int smallDigit = sm.findSmallDigit(num);
			// System.out.println("Smallest Digit in number:"+ smallDigit);

			// SumOfDigitInNumber sod = new SumOfDigitInNumber();
			// int result = sod.additionOfDigit(num);
			// System.out.println("sum of digits in number:" + result);

			//LargestEvenDigitInNumber ledin = new LargestEvenDigitInNumber();
			//int larEvenDigit = ledin.largestEvenDigitFinder(num);
			//System.out.println("Largest Even Digit:"+ larEvenDigit);
			
			//PrintDigitOfNumber pdon = new PrintDigitOfNumber();
			//pdon.printDigit(num);

			//CountNumberOfDigits cnod = new CountNumberOfDigits();
			//int ans = cnod.countDigit(num);
			//System.out.println("Count of digits in number:"+ ans);

			//ReverseNumberAndPalindrome rnap = new ReverseNumberAndPalindrome();
			//int reversedNumber = rnap.reverseNumber(num);
			//System.out.println("Reversed the number: " + reversedNumber);
			//boolean palResult = rnap.numberPalindrome(reversedNumber, num);
			//System.out.println("Number is palindrome :"+ palResult);
			

			// close scanner object
			sc.close();
	}
}
			
