package CSW2703;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n+"! = "+fact(n));
    }
    static int fact(int n){
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }
}
