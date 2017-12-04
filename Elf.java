/**
 * Subclass of Creature. These elfs represent magical creatures so 
 * they do two times the damage.
 *
 * @author Giovanny Ospina
 * @version 12.01.2017
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */

    public Elf()
    {
        super
        (
        Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP) + MIN_ELF_HP,
        Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR) + MIN_ELF_STR
        );
    }

    /**
     * Override Creature's damage method to allow the elf to apply twice the damage with their magic attack
     * @return dam the total damage 
     */

    public int damage()
    {
        int dam;
        int roll;
        roll = Randomizer.nextInt(10);
        
        if (roll == 1)
        {
            dam = super.damage(); 
            dam = dam * 2;
        }
        else
        {
            dam = super.damage();
        }
        
        return dam;
    }
}