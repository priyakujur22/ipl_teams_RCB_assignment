package TeamsInIPL;
/**
 * Stores all the common check methods which all teams in IPL should satisfy according to protocols defined, for team structure.
 */

public interface TeamFinalizationProcedures {
    default void check_PlayersCount(){}
    default int check_CountOfForeignPlayers(){
        return 0;
    }
    default int check_PresenceOfWicketKeeper(){
        return 0;
    }

}
