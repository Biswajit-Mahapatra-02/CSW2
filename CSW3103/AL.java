package CSW3103;
// WAP to create an arraylist of string value. Add six strings to it. Iterate through it using iterator, for each loop
// and for loop. Display values, find the index of the first occurrence of and element in the arraylist and find the
// index of the last occurrence of an element in the arraylist.
import java.util.*;
public class AL {
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        num.add("1");
        num.add("2");
        num.add("3");
        num.add("4");
        num.add("5");
        num.add("6");
        num.add("7");
        System.out.println("Current arraylist: \t\t"+num);
        System.out.println("The reversed array list: "+reverseArrayList(num));
        System.out.println("Maximum element in the list: "+Collections.max(num));
        System.out.println("Minimum element in the list: "+Collections.min(num));

        System.out.print("List iterator reverse: ");
        ListIterator<String> rev = num.listIterator(num.size());

        while(rev.hasPrevious()){
            System.out.print(rev.previous()+" ");
        }
        System.out.println();

        Collections.swap(num, 2, 6);
        System.out.println("Arraylist after swapping: "+num);
    }
    static ArrayList<String> reverseArrayList(ArrayList<String> AL){
        ArrayList<String> temp = new ArrayList<>();
        for (int i = AL.size() - 1; i >= 0; i--) {
            temp.add(AL.get(i));
        }
        return temp;
    }
}
