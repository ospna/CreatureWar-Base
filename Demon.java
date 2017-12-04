/**
 * Subclass of Creature and the Superclass for the demon branch. 
 * These demons represent the demonic creatures so they do 50 extra damage.
 *
 * @author Giovanny Ospina
 * @version 12.01.2017
 */
public class Demon extends Creature
{
    private static final int MAX_DEMON_HP = 25;
    private static final int MIN_DEMON_HP = 8;
    private static final int MAX_DEMON_STR = 18;
    private static final int MIN_DEMON_STR = 5;

    /**
     * Constructor for objects of class Demon
     */

    public Demon()
    {
        super
        (
        Randomizer.nextInt(MAX_DEMON_HP - MIN_DEMON_HP) + MIN_DEMON_HP,
        Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR) + MIN_DEMON_STR
        );
    }
    
    /**
     * Constructor for Demon subclasses
     */
    public Demon(int hp, int str)
    {
        super(hp, str);
    }

    /**
     * Override Creature's damage method to allow the demon to deal 50 extra damage with attack.
     * @return dam the total damage 
     */

    public int damage()
    {
        int dam;
        int roll;
        roll = Randomizer.nextInt(5);
        
        if (roll == 1)
        {
            dam = super.damage(); 
            dam = dam + 50;
        }
        else
        {
            dam = super.damage();
        }
        
        return dam;
    }
}