import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Summoning {
    ArrayList summoningCharacters = new CharacterList().makeCharacterList();
    ArrayList normalCharacters = new ArrayList();
    ArrayList rareCharacters = new ArrayList();
    ArrayList superRareCharacters = new ArrayList();
    ArrayList superSuperRareCharacters = new ArrayList();
    public void sortCharacter()
    {
        //int i = 0
        for (Object e:summoningCharacters) {
            Character checkChar = (Character)e;
            if (checkChar.rarity == "N")
            {
                normalCharacters.add(checkChar);
            }
            if(checkChar.rarity=="R")
            {
                rareCharacters.add(checkChar);
            }
            if(checkChar.rarity=="SR")
            {
                superRareCharacters.add(checkChar);
            }
            if(checkChar.rarity=="SSR")
            {
                superSuperRareCharacters.add(checkChar);
            }
            
        }

    }

    public Character makeSummonNumber()
    {
        int range = 100;
        int summonNumber = (int) (Math.random() * range);
        Scanner pausing = new Scanner(System.in);
        if (summonNumber<22)
        {
            //this means they pulled a normal
            range = normalCharacters.size();
            summonNumber = (int) (Math.random() * range);

            Character summonedCharacter = (Character) normalCharacters.get(summonNumber);
            summonedCharacter.setMaxLevel(20);
            summonedCharacter.calculateHPIncrease();
            summonedCharacter.calculateATKIncrease();
            summonedCharacter.calculateDEFIncrease();
            System.out.println("Congrats! You pulled ["+ summonedCharacter.subCharacterName + "] "+ summonedCharacter.characterName + "!");
            pausing.nextLine();
            return summonedCharacter;
        }
        if(summonNumber>=22 && summonNumber<67)
        {
            //get Rare
            range = rareCharacters.size();
            summonNumber = (int) (Math.random() * range);

            Character summonedCharacter = (Character) rareCharacters.get(summonNumber);
            summonedCharacter.setMaxLevel(40);
            summonedCharacter.calculateHPIncrease();
            summonedCharacter.calculateATKIncrease();
            summonedCharacter.calculateDEFIncrease();
            System.out.println("Congrats! You pulled ["+ summonedCharacter.subCharacterName + "] "+ summonedCharacter.characterName + "!");
            pausing.nextLine();
            return summonedCharacter;
        }
        if(summonNumber>=67 && summonNumber<98)
        {
            //get SuperRare
            range = superRareCharacters.size();
            summonNumber = (int) (Math.random() * range);

            Character summonedCharacter = (Character) superRareCharacters.get(summonNumber);
            summonedCharacter.setMaxLevel(60);
            summonedCharacter.calculateHPIncrease();
            summonedCharacter.calculateATKIncrease();
            summonedCharacter.calculateDEFIncrease();
            System.out.println("Congrats! You pulled ["+ summonedCharacter.subCharacterName + "] "+ summonedCharacter.characterName + "!");
            pausing.nextLine();
            return summonedCharacter;
        }
        if(summonNumber>=98)
        {
            //get SuperSuperRare
            range = superSuperRareCharacters.size();
            summonNumber = (int) (Math.random() * range);

            Character summonedCharacter = (Character) superSuperRareCharacters.get(summonNumber);
            summonedCharacter.setMaxLevel(80);
            summonedCharacter.calculateHPIncrease();
            summonedCharacter.calculateATKIncrease();
            summonedCharacter.calculateDEFIncrease();
            System.out.println("Congrats! You pulled ["+ summonedCharacter.subCharacterName + "] "+ summonedCharacter.characterName + "!");
            pausing.nextLine();
            return summonedCharacter;
        }
        return null;

    }


}
