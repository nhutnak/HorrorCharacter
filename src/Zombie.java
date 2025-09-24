public class Zombie extends HorrorCharacter
{
    public Zombie(String name, int health, Vulnerability[] vulnerabilities)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.FIRE});
    }

    @Override
    void attack()
    {
        System.out.println("The zombie bites you");
    }

    @Override
    void flee()
    {
        System.out.println("The zombie runs away.");
    }

    @Override
    Vulnerability[] getVulnerabilities()
    {
        return super.getVulnerabilities();
    }
}
