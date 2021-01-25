package challenges.cert;

import java.util.*;

public class Sl2 {
    public static List<String> mostActive(List<String> customers) {
        // Write your code here
        int total = customers.size();
        Map<String,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(int i=0;i<total;i++){
            if(map.containsKey(customers.get(i))){
                map.replace(customers.get(i),map.get(i)+1);
            }else{
                map.put(customers.get(i),1);
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        for (int i=0;i<map.size();i++){
            if (map.containsKey(customers.get(i))){
                int value =  map.get(customers.get(i));
                if ((value / total) > 0.05) {
                    res.add(customers.get(i));
                }
            }
        }
        Arrays.sort(new List[]{res});

        return res;

    }

    public static void main(String[] args) {

    }
}
