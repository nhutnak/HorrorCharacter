import java.util.Arrays;

/**
 * Abstract class representing a character in a horror game.
 * Each character has a name, health points, and an array of vulnerabilities.
 * The class provides methods for attacking and fleeing, as well as a method to retrieve vulnerabilities.
 */
public abstract class HorrorCharacter
{

    private String name;
    private int health;
    Vulnerability[] vulnerabilities;
    /**
     * Constructor for HorrorCharacter class
     * @param name
     * @param health
     * @param vulnerabilities
     */
    public HorrorCharacter(String name, int health, Vulnerability[] vulnerabilities)
    {
        this.name = name;
        this.health = health;
        this.vulnerabilities = vulnerabilities;
    }
    /**
     * Abstract method for attacking. To be implemented by subclasses.
     */
    void attack(){}
    /**
     * Abstract method for fleeing. To be implemented by subclasses.
     */
    void flee(){}
    /**
     * Returns the array of vulnerabilities for the character.
     * @return Vulnerability[]
     */
    Vulnerability[] getVulnerabilities() {return vulnerabilities;}
    @Override
    public String toString()
    {
        return
                "name='" + name+
                ", health=" + health +
                ", vulnerabilities=" + Arrays.toString(vulnerabilities);
    }
}
