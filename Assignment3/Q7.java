package Assignment3;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reduction(arr);
    }
    public static void reduction(int[] arr){
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : arr) {
            A.add(i);
        }
        while(!A.isEmpty()){
            int min = Collections.min(A);
            for (int i = 0; i<A.size();) {
                int temp = A.get(i)-min;
                if(temp>0) {
                    A.set(i, temp);
                    i++;
                }
                else A.remove(i);
            }
            System.out.println(A);
        }
    }
}
