import java.util.Scanner;

public class SolidReactangle {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of rows in pattern");
        n = sc.nextInt();

        for(int row=1;row<=n;row++){
            for(int column=1;column<=n+1;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
