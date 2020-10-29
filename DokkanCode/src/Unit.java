import java.util.ArrayList;

public class Unit {
    String characterName;
    String subCharacterName;
    String type;
    int hp;
    int atk;
    int def;
    int maxHP;
    int maxATK;
    int maxDEF;
    int hpIncrease;
    int atkIncrease;
    int defIncrease;
    int maxLevel;
    String rarity;
    int level;
    int superATKLevel;
    int teamCost;
    boolean canBeAwakened;
    boolean isAwakened;
    boolean canBeDokkanAwakened;
    ArrayList<String> requiredMedals; //needs a class so like ArrayList<Medal> or something
    ArrayList<String> links;
    ArrayList<String> categories;
    boolean hasPassiveSkill;
    boolean hasLeaderSkill;

    public Unit(String characterName, String subCharacterName, String type, int hp, int atk, int def, int maxHP, int maxATK, int maxDEF, String rarity, int level, int superATKLevel, int teamCost, boolean canBeAwakened, boolean isAwakened, boolean canBeDokkanAwakened, ArrayList<String> requiredMedals, ArrayList<String> links, ArrayList<String> categories, boolean hasPassiveSkill, boolean hasLeaderSkill) {
        this.characterName = characterName;
        this.subCharacterName = subCharacterName;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.maxHP = maxHP;
        this.maxATK = maxATK;
        this.maxDEF = maxDEF;
        this.rarity = rarity;
        this.level = level;
        this.superATKLevel = superATKLevel;
        this.teamCost = teamCost;
        this.canBeAwakened = canBeAwakened;
        this.isAwakened = isAwakened;
        this.canBeDokkanAwakened = canBeDokkanAwakened;
        this.requiredMedals = requiredMedals;
        this.links = links;
        this.categories = categories;
        this.hasPassiveSkill = hasPassiveSkill;
        this.hasLeaderSkill = hasLeaderSkill;

    }
    public void setMaxLevel(int level)
    {
        maxLevel = level;
    }
    public int getHPIncrease()
    {
        return hpIncrease;

    }
    public void calculateHPIncrease()
    {
        hpIncrease = (maxHP - hp) / maxLevel;
    }
    public int getATKIncrease()
    {
        return atkIncrease;

    }
    public void calculateATKIncrease()
    {
        atkIncrease = (maxATK - atk) / maxLevel;
    }
    public int getDEFIncrease()
    {
        return hpIncrease;

    }
    public void calculateDEFIncrease()
    {
        defIncrease = (maxDEF - def) / maxLevel;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxATK() {
        return maxATK;
    }

    public void setMaxATK(int maxATK) {
        this.maxATK = maxATK;
    }

    public int getMaxDEF() {
        return maxDEF;
    }

    public void setMaxDEF(int maxDEF) {
        this.maxDEF = maxDEF;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getSubCharacterName() {
        return subCharacterName;
    }

    public void setSubCharacterName(String subCharacterName) {
        this.subCharacterName = subCharacterName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getATK() {
        return atk;
    }

    public void setATK(int atk) {
        this.atk = atk;
    }

    public int getDEF() {
        return def;
    }

    public void setDEF(int def) {
        this.def = def;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSuperATKLevel() {
        return superATKLevel;
    }

    public void setSuperATKLevel(int superATKLevel) {
        this.superATKLevel = superATKLevel;
    }

    public int getTeamCost() {
        return teamCost;
    }

    public void setTeamCost(int teamCost) {
        this.teamCost = teamCost;
    }

    public boolean isCanBeAwakened() {
        return canBeAwakened;
    }

    public void setCanBeAwakened(boolean canBeAwakened) {
        this.canBeAwakened = canBeAwakened;
    }

    public boolean isAwakened() {
        return isAwakened;
    }

    public void setAwakened(boolean awakened) {
        isAwakened = awakened;
    }

    public boolean isCanBeDokkanAwakened() {
        return canBeDokkanAwakened;
    }

    public void setCanBeDokkanAwakened(boolean canBeDokkanAwakened) {
        this.canBeDokkanAwakened = canBeDokkanAwakened;
    }

    public ArrayList<String> getRequiredMedals() {
        return requiredMedals;
    }

    public void setRequiredMedals(ArrayList<String> requiredMedals) {
        this.requiredMedals = requiredMedals;
    }

    public ArrayList<String> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<String> links) {
        this.links = links;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public boolean isHasPassiveSkill() {
        return hasPassiveSkill;
    }

    public void setHasPassiveSkill(boolean hasPassiveSkill) {
        this.hasPassiveSkill = hasPassiveSkill;
    }

    public boolean isHasLeaderSkill() {
        return hasLeaderSkill;
    }

    public void setHasLeaderSkill(boolean hasLeaderSkill) {
        this.hasLeaderSkill = hasLeaderSkill;
    }

    @Override
    public String toString() {
        String leaderSkill = "";
        String passiveSkill = "";
        if (hasLeaderSkill == false)
                leaderSkill = "None";
        if(hasPassiveSkill == false)
            passiveSkill = "None";

        return "Name: [" +subCharacterName +
                "] " + characterName +
                "\nType: " +
                type +
                "\nHP: " + hp +
                "\nATK: " + atk +
                "\nDef: " + def +
                "\nRarity: " + rarity +
                "\nLevel: " + level +
                "\nSuperATKLevel: " + superATKLevel +
                "\nTeam Cost: " + teamCost +
                "\nRequiredMedals: " + requiredMedals +
                "\nLinks: " + links +
                "\nCategories: " + categories +
                "\nPassive Skill: " + passiveSkill +
                "\nLeader Skill: " + leaderSkill;
    }
}
