package Assignment2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;ArrayList<Integer> al = new ArrayList<>();
        do{
            System.out.print("Enter an integer: ");
            al.add(sc.nextInt());
            System.out.print("Enter 'y' to add another element, or any other key to exit insertion sequence: ");
            ch = sc.next().charAt(0);
        } while(ch == 'y'||ch == 'Y');
        ListIterator<Integer> LI = al.listIterator();
        System.out.print("The current arraylist: ");
        while(LI.hasNext()){
            System.out.print(LI.next()+" ");
        }
        System.out.println();
        System.out.print("Enter an element to search in the current arraylist: ");
        int x = sc.nextInt();
        if(al.contains(x)){
            System.out.println("The element is present in the given list.");
        } else System.out.println("The element is not present in the given list.");
        System.out.print("Enter the index of the element to be removed: ");
        x = sc.nextInt();
        if(x<=al.size()){
            System.out.println("The element removed is: "+al.remove(--x));
        } else System.out.println("The given index is out of bounds. The size of the current arraylist: "+al.size());
        if(!al.isEmpty()){
            System.out.println("The given arraylist is not empty.");
        } else System.out.println("The given arraylist is empty.");
    }
}
