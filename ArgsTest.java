
/**
 * Write a description of class ff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest st1 = new ArgsTest();
        st1.run(args);
    }

    public void run(String[] a) {
        
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

