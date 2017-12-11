import java.util.ArrayList;
import java.util.Random;

/**
 * The war between two sides! Who will win? Lets find out!
 *
 * @author Giovanny Ospina
 * @version 12.01.2017
 */
public class War
{
    private ArrayList <Creature> goodguys = new ArrayList<Creature>();
    private ArrayList <Creature> badguys = new ArrayList<Creature>();
    private Randomizer ran = new Randomizer();

    /**
     * Constructor for objects of class War
     * Creates the two armies by letting the randomizer determine what creature will be added into the army.
     */
    
    public War()
    {
        // army of good guys
        for (int i = 0; i < 75; i++) 
        {
            int ran = Randomizer.nextInt(10);
            if (ran <= 6) 
            {
                goodguys.add(new Human());
            } 
            else 
            {
                goodguys.add(new Elf());
            }

        }   
        
        // army of bad guys
        for (int i = 0; i < 75; i++) 
        {
            int ran = Randomizer.nextInt(10);
            
            if (ran == 9)
            {
                badguys.add(new Cyberdemon());
            } 
            else if (ran == 10) 
            {
                badguys.add(new Barlog());
            }
            else
            {
                badguys.add(new Demon());
            } 
        }
    }

    /**
     * Method to call the battle between the two armies, the goodguys versus the badguys. 
     * 
     */
    
    public void teamDeathmatch()
    {
        Creature good = null;
        Creature bad = null;
        int deadGG = 0;
        int deadBG = 0;

        do
        {
            if(good == null)
            {
                good = goodguys.remove(0);
            }
            
            if(bad == null)
            {
                bad = badguys.remove(0);
            }
            
            while(good.isAlive() && bad.isAlive())
            {
                good.takeDamage(bad.damage());
                bad.takeDamage(good.damage());
            }
            
            if(good.isDead())
            {
                good = null;
                System.out.println("Man down!");
                deadGG++;
            }   

            if(bad.isDead())
            {
                bad = null;
                System.out.println("Enemy terminated!");
                deadBG++;
            }
            
        } while (goodguys.size() != 0 && badguys.size() != 0);
        
        System.out.println(" ");
        System.out.println("Goodguys alive: " + goodguys.size());
        System.out.println("Goodguys killed to death: " + deadGG); 
        System.out.println(" ");
        System.out.println("Badguys alive: " + badguys.size());
        System.out.println("Badguys killed to death: " + deadBG); 
        System.out.println(" ");
        
        if (goodguys.size() > 0) 
        {
              System.out.println ("Victory!");   
        } 
        else if (badguys.size() > 0) 
        {
            System.out.println ("Mission failed. We'll get em next time.");
        } 
    }
}