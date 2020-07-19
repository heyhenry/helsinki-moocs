package Part_1;

import java.util.Scanner;

public class Grades_and_Points {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give points [0 - 100]: ");
        int points = sc.nextInt();

        if(points < 0) {

            System.out.println("Grade: Impossible!");

        } else if(points >= 0 && points < 50) {

            System.out.println("Grade: Failed");

        } else if(points >= 50 && points < 60) {

            System.out.println("Grade: 1");

        } else if(points >= 60 && points < 70) {

            System.out.println("Grade: 2");

        } else if(points >= 70 && points < 80) {

            System.out.println("Grade: 3");

        } else if(points >= 80 && points < 90) {

            System.out.println("Grade: 4");

        } else if(points >= 90 && points < 100) {

            System.out.println("Grade: 5");

        } else {

            System.out.println("Grade: Incredible!");

        }

        sc.close();

    }

}
