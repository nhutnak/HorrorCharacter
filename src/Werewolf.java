/**
 * Represents a Werewolf character in a horror-themed game.
 * Inherits from HorrorCharacter and implements Transformable interface.
 * A werewolf can transform between human and wolf forms, affecting its attack and flee behaviors.
 */

public class Werewolf extends HorrorCharacter implements Transformable
{
    private Boolean transformed;
    /**
     * Constructor for Werewolf class
     * @param name
     * @param health
     * @param vulnerabilities
     * @param transformed
     */
    public Werewolf(String name, int health, Vulnerability[] vulnerabilities, Boolean transformed)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.HOLY_WATER});
        this.transformed = transformed;
    }
    /**
     * If the werewolf is not transformed, it slaps you.
     * If the werewolf is transformed, it slashes you.
     */
    @Override
    void attack()
    {
        if(!transformed)
        {
            System.out.println("The Werewolf (in human form) slaps you");
        }
        else
        {
            System.out.println("The Werewolf (in wolf form) slashes you");
        }
    }
    /**
     * If the werewolf is not transformed, it turns around and runs away.
     * If the werewolf is transformed, it runs away on all fours.
     */
    @Override
    void flee()
    {
        if(!transformed)
        {
            System.out.println("The Werewolf (in human form) turns around and runs away");
        }
        else
        {
            System.out.println("The Werewolf (in wolf form) runs away on all fours");
        }
    }

    /**
     * Transforms the werewolf from human to wolf form or vice versa.
     */
    @Override
    public void transform()
    {
        transformed = !transformed;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", transformed=" + transformed;
    }
}
