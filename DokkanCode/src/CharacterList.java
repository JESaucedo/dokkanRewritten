import java.util.ArrayList;

public class CharacterList {
    public ArrayList makeCharacterList(){
        ArrayList<String> requiredMedals = new ArrayList<>();
        ArrayList<String> links = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();
        Character anticipatedTelekinesisChiaotzu = new Character("Chiaotzu", "Anticipated " +
                "Telekinesis", "INT", 485,321,290,2990,2053,2413,"N",
                1,1,4,true,false,false,requiredMedals,links,categories,
                false,false);
        Character armyOfInfamyRedRibbonSoldier = new Character("Red Ribbon Soldier","Army of Infamy"
        , "TEQ",401, 280,224,2639,1858,2101,"N",1
        ,1,4,true,false,false
        ,requiredMedals,links,categories,false,false);
        Character assassinInTheShadowsYakon = new Character("Yakon", "Assassin in the Shadows"
        ,"AGL",494,354,211,2981,2260,1926,"N",1,1,4,true
        ,false,false,requiredMedals,links,categories,false,false);
        Character supremeWarriorAwakenedSuperSaiyanGoku = new Character("Super Saiyan Goku"
        ,"Supreme Warrior Awakened","AGL",2210,1898
        ,1050,13282,12136,8857,"SSR",1,1,16,true
        ,false,true,requiredMedals,links,categories
        ,true,true);
        Character theSaiyanAmoungUsGoku = new Character("Goku","The Saiyan Amoung Us", "STR"
        ,1632,1250,854,6696,6192,3361,"SR",1,1,10
        ,true,false,false,requiredMedals
        ,links,categories,true,true);
        Character steelyDeterminationGohanKid = new Character("Gohan (Kid)", "Steely Determination"
        ,"INT", 1258,691,828,5947,3269,3522,"R",1,1
        ,6,true,false,false,requiredMedals
        ,links,categories,true,true);
        ArrayList<Character> characterList = new ArrayList<Character>();
        characterList.add(anticipatedTelekinesisChiaotzu);
        characterList.add(armyOfInfamyRedRibbonSoldier);
        characterList.add(assassinInTheShadowsYakon);
        characterList.add(supremeWarriorAwakenedSuperSaiyanGoku);
        characterList.add(theSaiyanAmoungUsGoku);
        characterList.add(steelyDeterminationGohanKid);
        return characterList;

    }



}
