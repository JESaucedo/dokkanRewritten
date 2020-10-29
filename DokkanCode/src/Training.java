public class Training {
    public void train(Unit firstChar, Unit secondChar){
        if(firstChar.getRarity() == "N" && firstChar.getLevel() == 20 && firstChar.getSuperATKLevel()==10)
        {
            System.out.println("The card is already maxed out");
        }
        else if((firstChar.subCharacterName == secondChar.subCharacterName) && (firstChar.characterName== secondChar.characterName))
        {
            firstChar.setSuperATKLevel(firstChar.getSuperATKLevel() + secondChar.getSuperATKLevel());
            firstChar.setLevel(firstChar.getLevel()+ secondChar.getLevel());
            firstChar.setHP(firstChar.getHP()+firstChar.getHPIncrease());
            firstChar.setATK(firstChar.getATK()+firstChar.getATKIncrease());
            firstChar.setDEF(firstChar.getDEF()+firstChar.getDEFIncrease());

        }
        else
        {
            firstChar.setLevel(firstChar.getLevel()+ secondChar.getLevel());
            firstChar.setHP(firstChar.getHP()+firstChar.getHPIncrease());
            firstChar.setATK(firstChar.getATK()+firstChar.getATKIncrease());
            firstChar.setDEF(firstChar.getDEF()+firstChar.getDEFIncrease());
        }
    }
}
