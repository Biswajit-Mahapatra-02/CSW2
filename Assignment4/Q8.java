package Assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(hmap.containsKey(arr[i])) {
                int val = hmap.get(arr[i]);
                hmap.put(arr[i], val + 1);
            }
            else
                hmap.put(arr[i], 1);
        }
        for(Integer a:hmap.keySet()) {
            if(hmap.get(a) % 2 != 0)
                System.out.println("The odd repeating element is: "+a);
        }
    }
}
