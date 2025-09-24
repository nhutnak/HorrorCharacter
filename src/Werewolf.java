public class Werewolf extends HorrorCharacter implements Transformable
{
    private Boolean transformed;
    public Werewolf(String name, int health, Vulnerability[] vulnerabilities, Boolean transformed)
    {
        super(name, health, vulnerabilities = new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.HOLY_WATER});
        this.transformed = transformed;
    }

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
