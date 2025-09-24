public class Vampire extends HorrorCharacter
{
    public Vampire(String name, int health, Vulnerability[] vulnerabilities)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.SILVER});
    }

    @Override
    void attack()
    {
        System.out.println("The vampire (in human form) bites you.");
    }

    @Override
    void flee()
    {
        System.out.println("The vampire (in human form) dissapeared.");
    }

    @Override
    Vulnerability[] getVulnerabilities()
    {
        return super.getVulnerabilities();
    }

}
