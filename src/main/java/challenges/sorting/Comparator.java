package challenges.sorting;

class Player{
    String name;
    int score;
}

public class Comparator {

    public static int compare(Player a,Player b){
        if (a.score == b.score){
           return a.name.compareTo(b.name);
        }
        return b.score - a.score;
    }
}
