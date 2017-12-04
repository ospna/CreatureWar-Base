import java.util.Random;

/**
 * Create a single object to be used to generate random numbers where ever they are 
 * needed throughout the program, such as calculating damage and stats of the "monsters"
 */

public class Randomizer
{
    private static Random rand;
    
    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * Create a random object that can be called and passed arguemnts for boundries
     * @param y An int value to represent the boundries of the random number to generate
     */

    public static int nextInt(int y)
    {
        if (rand == null) 
        {
            rand = new Random();
        }
 
        return rand.nextInt(y);
    }
}

