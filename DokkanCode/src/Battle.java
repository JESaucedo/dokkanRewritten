public class Battle {
    public void attacking(Unit player, Unit enemy, Player current)
    {
        int playerHP, playerATK, playerDEF, enemyHP, enemyATK, enemyDEF = 0;
        playerHP = player.getHP();
        playerATK = player.getATK();
        playerDEF = player.getDEF();
        enemyHP = enemy.getHP();
        enemyATK = enemy.getATK();
        enemyDEF = enemy.getDEF();
        Item bubblesMedal = new Item("Bubbles"," Common Awakening Medal", 1);

        while (playerHP != 0 && enemyHP != 0)
        {
            enemyHP = enemyHP - (playerATK - enemyDEF);
            if(enemyHP==0)
                break;
            playerHP = playerHP - (enemyATK - playerDEF);
        }
        if(enemyHP <= 0)
        {
            System.out.println("Congrats you won! Here are your rewards:");
            if(current.myMedals.contains(bubblesMedal))
            {
                for (Item e: current.myMedals
                     ) {
                    if(e.name == "Bubbles")
                    {
                        
                    }

                }

            }

        }
    }
}
