import java.util.Scanner;
import java.io.*;
/**
 * This class reads data from a sample text file  and writes into output text file  
 *
 * Author: Basit 
 */
public class FileReaderAndWriter{
    /** the main method */
    public static void main(String[] args) {
        FileReaderAndWriter demo = new FileReaderAndWriter();
        demo.run();
    }

    /** the run method */
    public void run(){
        try {
            //Create a scanner that reads the text file  
            Scanner sc = null;
            sc = new Scanner(new FileReader("sample.txt"));

            //Set up a file writer that writes to the output text file
            File output = new File("output.txt");
            PrintWriter writer = new PrintWriter(output);

            //while there is a new line
            while (sc.hasNextLine()){
                int numW = 0; //sets initial word count to 0
                int numL = 0; //sets initial letter count to 0
                String lWord = ""; // string for the longest word
                String line = sc.nextLine();// converts the line into a string 

                Scanner sc2 = new Scanner(new String(line));//Scans each line
                while (sc2.hasNext()){ 
                    numW++;
                    String word = sc2.next();
                    numL = word.length() + numL;
                    if (word.length() > lWord.length()){
                        lWord = word; 
                    }

                }
                //Writes to the output file
                writer.println("Words: " + numW   +" Letters: " + numL  + " Longest: " + lWord);

            }

            writer.close();// stop writing

        }
        catch(Exception e) {
            System.out.println(e);//catch exception when inputs do not match required data type 
        }

    }

}
