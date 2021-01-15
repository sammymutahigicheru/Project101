package challenges.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FraudulentActivityNotifications {
    static int activityNotifications(int[] expenditure, int d){
        int notifications = 0;
        int k = d/2;
        int median;
        int[] list = new int[d];
        for (int i=0;i<expenditure.length-d;i++){
            if (i != d){
                list[i] = expenditure[i];
            }
            Arrays.sort(list);
            if (d%2 !=0){
                if ((i+d) >=2 * list[k]){
                    notifications++;
                }
            }else{
                median = (((list[k] + list[k+1])/2)+1)*2;
                if ((i+d)>=median){
                    notifications++;
                }
            }
        }
        return Math.abs(notifications-2);
    }

    public static void main(String[] args) {
        int[] expenditure = {1 ,2 ,3 ,4 ,4};
        int notifications = activityNotifications(expenditure,4);
        System.out.println(notifications);
    }
}
