
/**
 * Write a description of class TerminalDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TerminalDemo {
    public static void main(String[] args) {
        TerminalDemo demo = new TerminalDemo();
        demo.run();
    }

    public void run() {
        Scanner reader = new Scanner(System.in);
        String name = null;
        int age;
        try {
            // Read line from user input and print out.
            System.out.print("Name: ");
            name = reader.next();
            System.out.println("Name entered : " + name);
            System.out.print("Age: ");
            age = reader.nextInt();
            System.out.println("Age is: " + age);
        } catch (Exception e) {
            System.out.println( "Exception occured " + e);
        }
    }
}
