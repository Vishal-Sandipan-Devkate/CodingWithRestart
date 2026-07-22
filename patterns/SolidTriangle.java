import java.util.*;

public class SolidTriangle{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		n = sc.nextInt();

		for(int row=1;row<=n;row++){
			for(int column=1;column<=row;column++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

