/**
 * Created by Magdalena Polak on 18.04.2016.
 */
public class Results
{
    public static void main (String[]args)
    {
        Algorithms a = new Algorithms(3, 1000, 10);
        System.out.println("FIFO: " + a.FIFO());
        System.out.println("RANDOM: " + a.RANDOM());

    }

}
