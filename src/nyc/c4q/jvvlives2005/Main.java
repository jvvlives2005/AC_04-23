package nyc.c4q.jvvlives2005;
//Write a program tht takes in a number from 0 to 100, representing a student's grade, and prints out the letter grade:
//100-A+, 90 to 99- A, 80-89- B, 70-79-C, 60-69-D, 0-59-F

import java.util.Scanner;

public class Main {

    public static String grade (int gradenumber) {
        int i = 0;
        while (true){
            if (i == 100)
                System.out.println("A+");
            else if (i >= 90 && i <= 99)
                System.out.println("A");
            else if (i >= 80 && i <= 89)
                System.out.println("B");
            else if (i >= 70 && i <= 79)
                System.out.println("C");
            else if (i >= 60 && i <= 69)
                System.out.println("D");
            else if (i == 0 && i <= 59)
                System.out.println("F");


        }

    }

    public static void main(String[] args) {

    }
}
