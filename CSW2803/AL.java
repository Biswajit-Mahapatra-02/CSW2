package CSW2803;
// WAP to create an arraylist of string value. Add six strings to it. Iterate through it using iterator, for each loop
// and for loop. Display values, find the index of the first occurrence of and element in the arraylist and find the
// index of the last occurrence of an element in the arraylist.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> S = new ArrayList<>();
        S.add("A");
        S.add("Q2b");
        S.add("C");
        S.add("Q2b");
        S.add("E");
        S.add("A");
        Iterator<String> iter = S.iterator();
        System.out.println("The list has: ");
        for (String a : S)
            System.out.println(a);
        System.out.println();
        for (; iter.hasNext(); ) {
            System.out.println(iter.next());
        }
        for (int i = 0; i < S.size(); i++) {
            System.out.println(S.get(i));
        }
        System.out.print("Enter the element to be searched: ");
        String X = sc.next();
        if(S.contains(X)){
            System.out.println("The first index of "+X+"= "+S.indexOf(X));
            System.out.println("The last index of "+X+"= "+S.lastIndexOf(X));
        } else {
            System.out.println("The element does not exist.");
        }
    }
}
