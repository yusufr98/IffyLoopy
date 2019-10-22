package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean redEyes;
        String i = "N";
        Scanner k = new Scanner(System.in);
        do {
            System.out.println("Are your eyes red?");
            String answer = k.next();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                redEyes = true;
                System.out.println("Get some sleep!");
            } else {
                redEyes = false;
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again?");
            i = k.next();
        } while(i.equalsIgnoreCase("y") || i.equalsIgnoreCase("yes"));
    }
}
