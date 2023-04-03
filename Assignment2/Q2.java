package Assignment2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Q2 {
    public static Scanner sc = new Scanner(System.in);
    public static LinkedList<Student> SL = new LinkedList<>();
    public static void main(String[] args) {

        System.out.print("Enter the number of students you want to enter: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter marks: ");
            double mark = sc.nextDouble();
            Student temp = new Student(name,age,mark);
            SL.add(temp);
            sc.nextLine();
        }
        System.out.println("\n\nPrinting the linked list: ");
        display();
        System.out.print("Enter the name of the student to be searched: ");
        String sname = sc.nextLine();
        Student temp = search(SL,sname);
        if(temp!=null) {
            System.out.println("The student was found!");
            System.out.println("Age: "+temp.age);
            System.out.println("Marks: "+temp.mark);
        }
        else System.out.println("Student was not found.");
        System.out.print("\n\nEnter the student name to be removed: ");
        temp = search(SL,sc.nextLine());
        if(temp!=null){
            SL.remove(temp);
            System.out.println("Student removed successfully.\n\n");
            System.out.println("Current list: ");
            display();
        } else System.out.println("The given student was not found.");
        System.out.println("Number of students present in the current list: "+SL.size());
    }

    public static Student search(LinkedList<Student> SL, String sname){

        for (Student temp : SL) {
            if (sname.equals(temp.name))
                return temp;
        }
        return null;
    }
    public static void display(){
        ListIterator<Student> LI = SL.listIterator();
        int iter = 1;
        while(LI.hasNext()){
            Student temp = LI.next();
            System.out.println("Student "+(iter++)+": ");
            System.out.println("Name: "+temp.name);
            System.out.println("Age: "+temp.age);
            System.out.println("Mark: "+temp.mark);
            System.out.println("\n");
        }
    }
    public static class Student{
        String name;
        int age;
        double mark;

        public Student(String name, int age, double mark) {
            this.name = name;
            this.age = age;
            this.mark = mark;
        }
    }
}
