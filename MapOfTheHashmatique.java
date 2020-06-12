import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public void retrieveSongData(){
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Desert Rose", "Where is this Desert Rose?");
        songMap.put("Scars", "How I do not like these Scars!");
        songMap.put("Cool Beans", "Wow, I love these Cool Beans!!");
        songMap.put("Whoa", "Whoa, Whoa, Whoa, Whoa");

        String single = songMap.get("Cool Beans");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}