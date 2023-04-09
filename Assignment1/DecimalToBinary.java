package Assignment1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String binary = "";
        while(n!=0){
            int d = n%2;
            binary = d + binary ;
            n/=2;
        }
        System.out.println("Binary: "+Integer.parseInt(binary));
    }
}
