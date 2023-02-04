package Utilities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utility {
    public static Map<Integer, List> teamMap = new HashMap<Integer, List>();

    public void jsonFileReader() {
        String playerName;
        String country;
        String role;
        List<String> playerDetails;

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src\\main\\resources\\RCB_Player_List.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            String location = (String)jsonObject.get("location");
            JSONArray player = (JSONArray)jsonObject.get("player");

            System.out.println("Team Name: " + name);
            System.out.println("Location: " + location);



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
            e.printStackTrace();
        }
    }
}
