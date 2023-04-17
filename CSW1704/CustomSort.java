package CSW1704;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CustomSort {
    public static void main(String[] args) {
        int[] arr1 = {2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2 = {2,1,3,8};
        ArrayList<Integer> AL = new ArrayList<>();
        for (int x : arr1) {
            AL.add(x);
        }
        ArrayList<Integer> TAL = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if(AL.contains(arr2[i]))
                TAL.add(arr2[i]);
        }
        System.out.println(TAL);
    }
}
