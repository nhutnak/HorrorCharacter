public class Vampire extends HorrorCharacter implements Transformable
{
    private Boolean transformed;


    public Vampire(String name, int health, Vulnerability[] vulnerabilities, Boolean transformed)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.SILVER});
        this.transformed = transformed;
    }

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

    @Override
    void flee()
    {
        if(!transformed)
        {
            System.out.println("The vampire (in bat form) flies away.");
        }
        System.out.println("The vampire (in human form) dissapeared.");
    }

    @Override
    Vulnerability[] getVulnerabilities()
    {
        return super.getVulnerabilities();
    }

    @Override
    public void transform()
    {
        transformed = !transformed;
    }
}
