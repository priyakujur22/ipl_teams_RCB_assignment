package TestPackage;

import TeamsInIPL.Team1_RoyalChallengersBangalore;
import Utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TeamVerification extends Utility {
    Team1_RoyalChallengersBangalore team_RCB = new Team1_RoyalChallengersBangalore();


    @BeforeClass
    public void readJSONFile(){
        jsonFileReader();
    }

    @Test
    public void checkCountOfForeignPlayers(){
        team_RCB.check_PlayersCount();
        int count = team_RCB.check_CountOfForeignPlayers();

        if(count == 4 || count < 4 ){

            Assert.assertTrue(count<=4,"Team composition is correctly defined with maximum foreign player count as : " + count);
            System.out.println("Team composition is correctly defined with maximum foreign player count as : " + count);
        }else{
            Assert.assertFalse(count>4,"Please change the team composition. Maximum number of foreign players allowed is 4 or less than 4. " );
            System.out.println("Please change the team composition. Maximum number of foreign players allowed is 4 or less than 4. " );
        }
    }

}
