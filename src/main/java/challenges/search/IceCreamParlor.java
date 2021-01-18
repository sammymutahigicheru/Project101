package challenges.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
*Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool their money to buy ice cream. On any given day, the parlor offers a line of flavors. Each flavor has a cost associated with it.

Given the value of  and the  of each flavor for  trips to the Ice Cream Parlor, help Sunny and Johnny choose two distinct flavors such that they spend their entire pool of money during each visit. ID numbers are the 1- based index number associated with a . For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.

For example, there are  flavors having . Together they have  to spend. They would purchase flavor ID's  and  for a cost of . Use  based indexing for your response.
*
*
* */
public class IceCreamParlor {
    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] indexes = new int[2];
        for (int j=0;j<cost.length;j++){
            int target = money - cost[j];
            if (map.containsKey(target)){
                indexes[0] = map.get(target);
                indexes[1] = target;
                break;
            }
            map.put(cost[j],j+1);
        }
        System.out.println(indexes[0]);
    }

    public static void main(String[] args) {
        int[] cost = {1 ,4 ,5 ,3 ,2};
        whatFlavors(cost,4);
    }
}
