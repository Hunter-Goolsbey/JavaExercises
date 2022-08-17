package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a singular noun: ");

        boolean hasNextString = scanner.hasNext();
        if (hasNextString){
            String noun = scanner.next();
            scanner.nextLine();
            System.out.println("Enter a verb ending in 'ing': ");

            String verb = scanner.nextLine();
            System.out.println("There is a " + noun + " " + verb + " around in my living room!");

        } else{
            System.out.println("Unable to recognize input type");
        }

        scanner.close();
    }
}
