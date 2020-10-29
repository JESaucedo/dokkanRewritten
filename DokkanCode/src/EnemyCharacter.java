import java.util.ArrayList;

public class EnemyCharacter extends Unit{
    ArrayList<String> requiredMedals = new ArrayList<>();
    ArrayList<String> links = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();
    public Unit enemy = new Unit("Red Ribbon Soldier","Army of Infamy"
            , "TEQ",401, 280,224,2639,1858,2101,"N",1
            ,1,4,true,false,false
            ,requiredMedals,links,categories,false,false);

    public EnemyCharacter(String characterName, String subCharacterName, String type, int hp, int atk, int def, int maxHP, int maxATK, int maxDEF, String rarity, int level, int superATKLevel, int teamCost, boolean canBeAwakened, boolean isAwakened, boolean canBeDokkanAwakened, ArrayList<String> requiredMedals, ArrayList<String> links, ArrayList<String> categories, boolean hasPassiveSkill, boolean hasLeaderSkill) {
        super(characterName, subCharacterName, type, hp, atk, def, maxHP, maxATK, maxDEF, rarity, level, superATKLevel, teamCost, canBeAwakened, isAwakened, canBeDokkanAwakened, requiredMedals, links, categories, hasPassiveSkill, hasLeaderSkill);
    }
}
