package CSW1704;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CustomSort {
    public static void main(String[] args) {
        int[] arr1 = {2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2 = {2,1,3,8};
        customSort(arr1,arr2);
    }
    public static void customSort(int[] arr, int[] order){
        HashMap<Integer,Integer> HM = new HashMap<>();
        HashSet<Integer> HS = new HashSet<>();
        int[] temp = new int[arr.length];
        int a = 0;
        for (int i : order) {
            HM.put(i,0);
        }
        for (int i : arr) {
            if(HM.containsKey(i))
                HM.put(i,HM.get(i)+1);
            else HS.add(i);
        }
//        System.out.print(HM);
//        System.out.print(HS);
        for (int i : order) {
            int x = HM.get(i);
            while(x!=0){
                temp[a++] = i;
                x--;
            }
        }
        for (int i : HS) {
            temp[a++] = i;
        }
        System.out.print(Arrays.toString(temp));
    }
}
