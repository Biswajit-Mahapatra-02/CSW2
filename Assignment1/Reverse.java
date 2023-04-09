package Assignment1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String rev = "";
        while(n!=0){
            int d = n%10;
            rev = rev + d;
            n/=10;
        }
        System.out.print("Reverse: "+Integer.parseInt(rev));
    }
}
