import java.util.ArrayList;
/**
 * Main class to demonstrate the functionality of HorrorCharacter and its subclasses.
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<HorrorCharacter> characters = new ArrayList<HorrorCharacter>();
        Vampire dracula = new Vampire("Dracula", 100, false);
        characters.add(dracula);
        Werewolf loupGarou = new Werewolf("Loup Garou", 120, false);
        characters.add(loupGarou);
        Zombie walker = new Zombie("Walker", 80);
        characters.add(walker);
        ArrayList<Transformable> transformables = new ArrayList<Transformable>();
        transformables.add(dracula);
        transformables.add(loupGarou);
        for(HorrorCharacter character : characters)
        {
            character.attack();
            character.flee();
        }
        for(Transformable transformable : transformables)
        {
            transformable.transform();
        }
        for(HorrorCharacter character : characters)
        {
            character.attack();
            character.flee();
        }


    }
}