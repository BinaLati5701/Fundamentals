package mapOfHashmatique;
import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {


    public void trackList() {
        HashMap<String, String> tracksAndLyrics = new HashMap<String, String>();
        tracksAndLyrics.put("Time to Say Goodbye", "Quando sono solo");
        tracksAndLyrics.put("Fly to Paradise", "And all she ever thinks about");
        tracksAndLyrics.put("So Many Things", "And so many things I'd forgotten");
        tracksAndLyrics.put("It's a Beautiful Day", "Un bel giorno...");

        String track = tracksAndLyrics.get("Fly to Paradise");
        System.out.println(track);


        Set<String> keys = tracksAndLyrics.keySet();
        for (String key : keys) {
//            System.out.println(key);
//            System.out.println(tracksAndLyrics.get(key));
            System.out.println("Track: " + key + " -  Lyrics: " + tracksAndLyrics.get(key));
        }
    }

}
