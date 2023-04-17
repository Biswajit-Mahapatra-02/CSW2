package CSW1704;

import java.util.Arrays;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the elements of the second array: ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        unionIntersection(arr1, n1, arr2, n2);
    }
    public static void unionIntersection(int[] arr1, int size1, int[] arr2, int size2){
        int first = 0, second = 0;
        int[] union = new int[size1 + size2];
        int[] intersection = new int[Math.min(size1, size2)];
        int uIndex = 0, iIndex = 0;
        while (first < size1 && second < size2) {
            if (arr1[first] == arr2[second]) {
                union[uIndex++] = arr1[first];
                intersection[iIndex++] = arr1[first];
                first += 1;
                second += 1;
            } else if (arr1[first] < arr2[second]) {
                union[uIndex++] = arr1[first];
                first += 1;
            } else {
                union[uIndex++] = arr2[second];
                second += 1;
            }
        }
        while (first < size1) {
            union[uIndex++] = arr1[first];
            first += 1;
        }
        while (second < size2) {
            union[uIndex++] = arr2[second];
            second += 1;
        }
        System.out.println("The union: "+Arrays.toString(union));
        System.out.println("The intersection: "+Arrays.toString(intersection));
    }
}
