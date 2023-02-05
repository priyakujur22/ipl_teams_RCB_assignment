package TeamsInIPL;

import Utilities.Utility;

import java.util.List;
import java.util.Map;

/**
 * Stores methods for verifying the team composition for RCB in IPL.
 */

public class Team1_RoyalChallengersBangalore extends Utility implements TeamFinalizationProcedures {

    /**
     * Method to check count of players in a team.
     */
    public void check_PlayersCount(){

        System.out.println("RCB Team Strength : " + teamMap.size());
    }

    /**
     * Method to check count of foreign players in a team , which should be either 4 or less.
     */
    public int check_CountOfForeignPlayers(){

        int foreignPlayerCount = 0;

        for (Map.Entry<Integer, List> entry : teamMap.entrySet())
            if(!entry.getValue().get(1).toString().equalsIgnoreCase("India")){
                foreignPlayerCount++;
            }

        System.out.println("Count Of Foreign Players is : " + foreignPlayerCount);
        return foreignPlayerCount;

    }

    /**
     * Method to check count of wicket keeper in a team , which should be either 1 or more.
     */
    public int check_PresenceOfWicketKeeper(){
        int wicketKeeperCount = 0;
        for(Map.Entry<Integer,List> entry : teamMap.entrySet())
            if(entry.getValue().get(2).toString().equalsIgnoreCase("Wicket-Keeper")){
                wicketKeeperCount++;
                break;
            }
        return wicketKeeperCount;
    }
}
