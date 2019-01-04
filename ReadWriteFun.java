
/**
 * Write a description of class ReadWriteFun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;

public class ReadWriteFun{

    public static void main(String[] args){

        Scanner sc = null;
        try { 
            sc = new Scanner(new FileReader("sample.txt"));
            while (sc.hasNextLong())    {
                long aLong = sc.nextLong();
                System.out.println(aLong);
            }
        }
        catch(Exception e) {
            System.out.println(e);   
        }

    }
}