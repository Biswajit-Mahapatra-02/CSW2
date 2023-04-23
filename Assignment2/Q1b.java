package Assignment2;

import java.util.Scanner;
import java.util.TreeSet;

public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> TS = new TreeSet<>();
        TS.add(23);
        TS.add(54);
        TS.add(12);
        TS.add(24);
        TS.add(53);
        System.out.print("Element search: ");
        int a = sc.nextInt();
        if(TS.remove(a))
            System.out.println("Element found and removed");
        else System.out.println("Element not found");

    }
}
