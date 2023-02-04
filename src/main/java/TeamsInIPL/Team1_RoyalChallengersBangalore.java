package TeamsInIPL;

import Utilities.Utility;

import java.util.List;
import java.util.Map;

public class Team1_RoyalChallengersBangalore extends Utility implements TeamFinalizationProcedures {
    public void check_PlayersCount(){
        System.out.println("RCB Team Strength : " + teamMap.size());
    }
    public int check_CountOfForeignPlayers(){
        int foreignPlayerCount = 0;

        for (Map.Entry<Integer, List> entry : teamMap.entrySet())
            if(!entry.getValue().get(1).toString().equalsIgnoreCase("India")){
                foreignPlayerCount++;
            }

        System.out.println("Count Of Foreign Players is : " + foreignPlayerCount);
        return foreignPlayerCount;

    }
}
