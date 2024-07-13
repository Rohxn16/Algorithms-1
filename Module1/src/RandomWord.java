import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord
{
    public static void main(String[] args)
    {
        int n = 0;
        String champion = "";
        while(!StdIn.isEmpty())
        {
            ++n;
            String current;
            current = StdIn.readString();
            if(StdRandom.bernoulli(1.0/n)){
                champion = current;
            }
        }
        if(champion != null)
        {
            StdOut.print(champion);
        }
    }
}
