package Part_1;

import java.util.Scanner;

public class Message {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a message: ");
        String msg = String.valueOf(sc.nextLine());

        System.out.println(msg);

    }

}
