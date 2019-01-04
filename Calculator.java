import java.util.Scanner;
/**
 * A simple arithmetic calculator 
 *
 * Basit 
 * 
 */
public class Calculator{
    /** the main method */
    public static void main(String[] args) {
        Calculator demo = new Calculator();
        demo.run();
    }

    /** the run method */
    public void run() {
        Scanner reader = new Scanner(System.in);//Creates a scanner which reads from system input

        //instance variables 
        int numO;//number of operations
        float num1;// First number
        float num2;// Second number 
        float ans = 0;// Answer 
        String operator = null; // String for the operator Sign 

        try {
            System.out.print("Number of arithmetic operations: " );
            numO = reader.nextInt();

            while (numO > 0){
                System.out.print("First number: ");
                num1 = reader.nextFloat();
                System.out.print("Operator: ");
                operator = reader.next();

                //using if statement to ensure that only +, - , / and * are the only operators allowed
                if (operator.equals("+") ||operator.equals("-")|| operator.equals("/")|| operator.equals("*")){ 
                    System.out.print("Second number: ");
                    num2 = reader.nextFloat();

                    switch (operator) {//handles operations based on the operator sign
                        case "+":
                        ans = num1 + num2;
                        break;
                        case "-":
                        ans = num1 - num2;
                        break;
                        case "/":
                        ans = num1/ num2;
                        break;
                        case "*":
                        ans = num1 * num2;
                        break;
                    }
                    System.out.println(ans);//prints out the answer                 
                }
                else{
                    System.out.println("Invalid Operator ");//prints invalid operator when an invalid operator is inputed 
                }
                numO--;
            }
        } catch (Exception e) {//catch exception when inputs do not match required data type 
            System.out.println( "Exception occured " + e);
        }
    }
}