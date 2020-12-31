package challenges.HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
*You are given  queries. Each query is of the form two integers described below:
- 1x : Insert x in your data structure.
-  2y : Delete one occurence of y from your data structure, if present.
- 3z : Check if any integer is present whose frequency is exactly z. If yes, print 1 else 0.

The queries are given in the form of a 2-D array  of size  where  contains the operation, and  contains the data element. For example, you are given array
*
* */
public class FrequencyQueries {
    static List<Integer> freqQuery(List<List<Integer>> queries){
        ArrayList<Integer> res = new ArrayList<>(); //will hold res 0 and 1
        HashMap<Integer, Integer> hashMap = new HashMap<>();  //helps with the lookup
        for (int i=0;i<queries.size();i++){
            ArrayList<Integer> ls = (ArrayList<Integer>) queries.get(i); //convert item to arraylist
            //- 1x : Insert x in your data structure.simply means index(0) == 1
            if (ls.get(0) == 1){
                if (hashMap.containsKey(ls.get(1))){
                    hashMap.replace(ls.get(1),hashMap.get(ls.get(1))+1);
                }else {
                    hashMap.put(ls.get(1),1);
                }
            }else if (ls.get(0) == 2) //- 2y : Delete one occurence of y from your data structure, if present.
            {
                if (hashMap.containsKey(ls.get(1))){
                    if (hashMap.get(ls.get(1)) == 1){
                        hashMap.remove(ls.get(1));
                    }else{
                        hashMap.replace(ls.get(1),hashMap.get(ls.get(1)) - 1);
                    }
                }
            }else //- 3z : Check if any integer is present whose frequency is exactly z. If yes, print 1 else 0.
                {

            }
        }
        return res;
    }
}
