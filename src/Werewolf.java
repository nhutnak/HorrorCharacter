public class Werewolf extends HorrorCharacter
{
    public Werewolf(String name, int health, Vulnerability[] vulnerabilities)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.HOLY_WATER});
    }

    @Override
    void attack()
    {
        System.out.println("The Werewolf (in human form) slaps you");
    }

    @Override
    void flee()
    {
        System.out.println("The Werewolf (in human form) turns around and runs away");
    }

    @Override
    Vulnerability[] getVulnerabilities()
    {
        return super.getVulnerabilities();
    }
}
