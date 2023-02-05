package Utilities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Stores all common methods which can be used across all classes.
 */

public class Utility {
    public static String teamnName;
    public static String teamLocation;
    public static Map<Integer, List> teamMap = new HashMap<Integer, List>();


    /**
     * Method to read JSON file contents.
     */
    public void jsonFileReader() {

        String playerName;
        String country;
        String role;
        List<String> playerDetails;

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src\\main\\resources\\RCB_Player_List.json"));
            JSONObject jsonObject = (JSONObject)obj;
            teamnName = (String)jsonObject.get("name");
            teamLocation = (String)jsonObject.get("location");
            JSONArray player = (JSONArray)jsonObject.get("player");

            System.out.println("Team Name: " + teamnName);
            System.out.println("Location: " + teamLocation);



            for(int i=0;i< player.size();i++){
                playerDetails = new ArrayList<String>();
                JSONObject playerObj = (JSONObject) player.get(i);

                playerName = (String)playerObj.get("name");
                country = (String)playerObj.get("country");
                role = (String)playerObj.get("role");

                playerDetails.add(playerName);
                playerDetails.add(country);
                playerDetails.add(role);

                teamMap.put(i, playerDetails);


            }

        } catch(Exception e) {
            System.out.println("Some issue in reading JSON file : " + e);
        }
    }
}
