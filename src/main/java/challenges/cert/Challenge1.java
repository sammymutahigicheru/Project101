package challenges.cert;

import java.util.*;

public class Challenge1 {
    public static List<String> possibleChanges(List<String> usernames) {
        // Write your code here
        int count = 0;
        Arrays.sort(new List[]{usernames});
        Map<String,Integer> map = new HashMap<>();
        List<String> customers = new ArrayList<>();
        for (int i=0;i<usernames.size();i++){
            if (map.containsKey(usernames.get(i))){
                map.replace(usernames.get(i),map.get(i)+1);
            }
            if (usernames.get(i).compareTo(usernames.get(i+1)) == 0){
                count++;
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        for (int i=0;i<map.size();i++){
            if (map.containsKey(usernames.get(i))){
               int value =  map.get(usernames.get(i));
                if ((value / 13) > 0.05) {
                    customers.addu()
                }
            }
        }
        int count = 0;
        List<String> res = new ArrayList<>();
        for (String names : usernames) {
            char[] a = names.toCharArray();
            for (int j = 1; j < a.length; j++) {
                for (int k = 0; k < a.length - j; k++) {
                    if (a[k] >= a[k + 1]) {
                        char temp = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                        count++;
                    } else {
                        count--;
                    }
                }
            }
            if (count == 1) {
                res.add("YES");
            } else {
                res.add("NO");
            }

        }
        return res;
    }

    public static void main(String[] args) {
        List<String> s = Arrays.asList(new String[]{"superhero", "bee", "ace"});
        System.out.println(possibleChanges(s));
    }
}
