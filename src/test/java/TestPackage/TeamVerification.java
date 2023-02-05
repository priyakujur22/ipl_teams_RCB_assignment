package TestPackage;

import TeamsInIPL.Team1_RoyalChallengersBangalore;
import Utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created By Priya Kujur
 * Date : 05.02.2023
 *
 * Test Class which executes major checks for team structure, as per protocols defined for any team to play in IPL.
 */

public class TeamVerification extends Utility {
    Team1_RoyalChallengersBangalore team_RCB = new Team1_RoyalChallengersBangalore();


    @BeforeClass
    public void readJSONFile(){
        jsonFileReader();
    }


    /**
     * Test method which executes check for count of foreign players in any IPL team.
     */
    @Test
    public void checkCountOfForeignPlayers(){
        team_RCB.check_PlayersCount();
        int count = team_RCB.check_CountOfForeignPlayers();

        if(count == 4 || count < 4 ){

            Assert.assertTrue(count<=4,teamnName+ " Team composition is correctly defined with maximum foreign player count as : " + count);
            System.out.println(teamnName + " Team composition is correctly defined with maximum foreign player count as : " + count);
            System.out.println();
        }else{
            Assert.assertFalse(count>4,"Please change the " + teamnName + " team composition. Maximum number of foreign players allowed is 4 or less than 4. " );
            System.out.println("Please change the " + teamnName + "  team composition. Maximum number of foreign players allowed is 4 or less than 4. " );
        }
    }


    /**
     * Test method which executes check for count of wicket keeper in any IPL team.
     */
    @Test
    public void checkPresenceOfWicketKeeper(){
        int count = team_RCB.check_PresenceOfWicketKeeper();
        if(count>0){
            Assert.assertTrue(count>0,teamnName + " Team composition is correctly defined with minimum one wicket keeper. Count of wicket keeper in RCB team is : " + count);
            System.out.println(teamnName + " Team composition is correctly defined with minimum one wicket keeper. Count of wicket keeper in RCB team is : " + count);
        }else{
            Assert.assertFalse(count==0,"Please add atleast one wicket keeper to the current  " + teamnName + " team composition");
            System.out.println("Please add atleast one wicket keeper to the current  " + teamnName + " team composition");
        }

    }

}
