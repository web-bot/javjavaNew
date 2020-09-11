package Lesson3;

import java.util.Scanner;


public class Task1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, welcome to our new game - What is the number!");
        int range = 10;
        int compNumber = (int) (Math.random() * range);


        myGame(range, compNumber);
        doExit();
        scanner.close();
    }

    private static void myGame(int range, int compNumber) {
        int maxTryAt = 4;
        for (int tryAt = 1; tryAt < maxTryAt; tryAt++) {
            System.out.println("Please enter your number from 1 to " + range);
            int yourNumber = scanner.nextInt();
            if (yourNumber == compNumber) {
                System.out.println("It is correct!Well done!");
                break;
            } else if (yourNumber < compNumber) {
                System.out.println("Please, enter bigger number!" + "You have " + (maxTryAt - tryAt - 1) + " attempt left.");
            } else {
                System.out.println("Please, enter smaller number!"+ "You have " + (maxTryAt - tryAt - 1) + " attempt left.");
            }

             if (tryAt == 3) {
                System.out.println("Try next time, looser!");
            }

        }
    }
    private static void doExit() {
        System.out.println("Are you sure? Press y/n");
        if (scanner.next().equals("y")) {
            System.exit(0);
        }
    }
}
