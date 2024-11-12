package HashingQuestion;

import java.util.HashMap;

public class FindIternaryFromTickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start + "->");
            // assign new start
            start = tickets.get(start);
        }
        System.out.println(start);

    }

    private static String getStart(HashMap<String, String> tickets) {
        //prepare reverse map to match tickets map key with reverse map key
        HashMap<String, String> reverseMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }
        // check if reverse map contains tickets map key , if not contains then it is
        // start point
        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}
