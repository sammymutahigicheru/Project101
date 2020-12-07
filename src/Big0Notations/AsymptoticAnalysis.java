package Big0Notations;

public class AsymptoticAnalysis {
    private int[] theArray;
    private int itemsInArray = 0;
    private int arraySize;
    static long timeStarted;
    static long endTime;
    public AsymptoticAnalysis(int size){
        arraySize = size;
        theArray = new int[arraySize];
    }
    public static void main(String[] args) {

    }
    private void generateArray(){
        for(int i=0;i<arraySize;i++){
            theArray[i] = (int)(Math.random()*1000) + 10;
            itemsInArray = arraySize -1;
        }
    }
}
