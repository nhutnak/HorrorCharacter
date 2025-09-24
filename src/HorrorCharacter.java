public abstract class HorrorCharacter
{
    private String name;
    private int health;
    Vulnerability[] vulnerabilities;

    public HorrorCharacter(String name, int health, Vulnerability[] vulnerabilities)
    {
        this.name = name;
        this.health = health;
        this.vulnerabilities = vulnerabilities;
    }

    void attack(){}
    void flee(){}
    Vulnerability[] getVulnerabilities() {return null;}

}
