package CSW1403;

//WAP to take an array as input and find the sum of all the elements of the array
public class Q1 {
    static int SOA(int[] a){
        int s = 0;
        for (int x: a) {
            s+=x;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("The sum of array is: "+SOA(arr));
    }
}
