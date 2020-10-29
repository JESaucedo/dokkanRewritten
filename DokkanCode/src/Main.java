import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[]args)
    {
        ArrayList<Character> myCharacterList = new ArrayList<>();
        Player currentPlayer = new Player();
        //PreGame game = new PreGame();
        Summoning summon = new Summoning();
        Training training = new Training();
        int userChoice = 0;
        //System.out.println(game.anticipatedTelekinesisChiaotzu);
        summon.sortCharacter();
        int i = 0;
        Scanner userInput = new Scanner(System.in);

        boolean running = true;
        while (running)
        {
            System.out.println("Welcome to Free Summons for DBZ Dokkan Battle");
            System.out.println("What would you like to do?\n1.Team List\n2.Check Specific Card Stats\n3.Training\n4.Summoning\n5.Exit");
            userChoice = userInput.nextInt();
            switch(userChoice){
                case 1:i = 1;
                if(currentPlayer.myCharacterList.size() == 0)
                    System.out.println("You have no characters to display");
                else {
                    System.out.println("Here is your character list");
                    for (Unit e : currentPlayer.myCharacterList) {

                        System.out.println(i + ". [" + e.subCharacterName + "] " + e.characterName);
                        i++;
                    }
                }
                break;
                case 2://i = 1;
                    if(currentPlayer.myCharacterList.size() == 0) {
                        System.out.println("You have no characters to display");
                        break;
                    }
                    else {
                        boolean keepLookingAtCards = true;
                        while(keepLookingAtCards)
                        {
                            i = 1;
                            for (Unit e : currentPlayer.myCharacterList) {
                                //System.out.println("Here is your character list");
                                System.out.println(i + ". [" + e.subCharacterName + "] " + e.characterName);
                                i++;

                            }
                            System.out.println("What character would you like to check");
                            userChoice = userInput.nextInt();
                            System.out.println(currentPlayer.myCharacterList.get(userChoice-1));
                            System.out.println("Enter 0 if you want to see another card or enter 1 if you are finished");
                            if(userInput.nextInt()!=0)
                            {
                                keepLookingAtCards = false;
                                break;
                            }
                        }
                        break;

                        //System.out.println("What character would you like to check");
                    }

                case 3:i=1;
                int firstCardChoice = 0;
                    System.out.println("What character would you like to train");
                    for (Unit e : currentPlayer.myCharacterList) {
                        //System.out.println("Here is your character list");
                        System.out.println(i + ". [" + e.subCharacterName + "] " + e.characterName);
                        i++;
                    }

                    firstCardChoice = userInput.nextInt() - 1;
                    Unit mainCard = currentPlayer.myCharacterList.get(firstCardChoice);
                    System.out.println("What character would you like to use for training");
                    i=1;
                    for (Unit e : currentPlayer.myCharacterList) {
                        //System.out.println("Here is your character list");
                        if(i==firstCardChoice+1)
                        {
                            System.out.println(i + ". In use");
                            i++;

                        }
                        else {
                            System.out.println(i + ". [" + e.subCharacterName + "] " + e.characterName);
                            i++;
                        }
                    }
                    userChoice = userInput.nextInt() - 1;
                    Unit burnCard = currentPlayer.myCharacterList.get(userChoice);
                    if(userChoice == firstCardChoice)
                    {
                        System.out.println("You can't pick the same card");
                    }
                    else
                    {

                        training.train(mainCard,burnCard);
                        currentPlayer.myCharacterList.remove(userChoice);
                    }

                    break;
                case 4:i=0;
                    while (i<10) {
                        currentPlayer.myCharacterList.add(summon.makeSummonNumber());
                        i++;
                    }
                    break;
                default:
                    running = false;

                    break;


        }



        }
        //training.train(myCharacterList.get());
    }
}
