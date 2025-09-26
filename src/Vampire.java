/**
 * Vampire class that extends HorrorCharacter and implements Transformable interface
 * A vampire can transform between human and bat form
 * A vampire has vulnerabilities to sunlight and silver
 */

public class Vampire extends HorrorCharacter implements Transformable
{
    private Boolean transformed;

    /**
     * Constructor for Vampire class
     * @param name
     * @param health
     * @param vulnerabilities
     * @param transformed
     */
    public Vampire(String name, int health, Vulnerability[] vulnerabilities, Boolean transformed)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.SILVER});
        this.transformed = transformed;
    }
    /**
     * If the vampire is not transformed, it bites you.
     * If the vampire is transformed, it swoops down and scratches you.
     */
    @Override
    void attack()
    {
        if(!transformed)
        {
            System.out.println("The vampire (in human form) bites you.");
        }
        else
        {
            System.out.println("The vampire (in bat form) swoops down and scratches you.");
        }
    }
    /**
     * If the vampire is not transformed, it flies away.
     * If the vampire is transformed, it disappears.
     */
    @Override
    void flee()
    {
        if (transformed)
        {
            System.out.println("The vampire (in bat form) flies away.");
        } else
        {
            System.out.println("The vampire (in human form) dissapeared.");
        }
    }

    /**
     * Transforms the vampire from human to bat form or vice versa.
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
