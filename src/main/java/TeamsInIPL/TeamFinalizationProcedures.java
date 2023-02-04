package TeamsInIPL;

public interface TeamFinalizationProcedures {
    default void check_PlayersCount(){}
    default int check_CountOfForeignPlayers(){
        return 0;
    }
    default int check_PresenceOfWicketKeeper(){
        return 0;
    }

}
