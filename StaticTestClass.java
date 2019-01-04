
/**
 * Write a description of class lab1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaticTestClass
{
    Integer x;
    Integer y;

    public static void main(String[] args) {
        //The following if executed would be a compile error:
        //System.out.println(y);

        StaticTestClass st1 = new StaticTestClass();
        st1.run();

    }
    // Constructor.
    public StaticTestClass() {
        this.x = 3;
        this.y = 4;
    }

    public void run() {

        System.out.println("st1: " + this.x + " " + this.y);
        x = 100;
        y = 300;
        System.out.println("st1: " + this.x + " " + this.y);
    }
}
