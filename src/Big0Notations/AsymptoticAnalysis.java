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
        //add item
        AsymptoticAnalysis analysis = new AsymptoticAnalysis(10);
        analysis.addItem(5);
        //create several objects while generating the array
        AsymptoticAnalysis analysis1 = new AsymptoticAnalysis(100000);
        analysis1.generateArray();
        AsymptoticAnalysis analysis2 = new AsymptoticAnalysis(200000);
        analysis2.generateArray();
        AsymptoticAnalysis analysis3 = new AsymptoticAnalysis(300000);
        analysis3.generateArray();
        AsymptoticAnalysis analysis4 = new AsymptoticAnalysis(400000);
        analysis4.generateArray();

        /*
        * Linear Search
        * O(n) Test
        * */
        analysis1.linearSearchForValue(20);
        analysis2.linearSearchForValue(20);
        analysis3.linearSearchForValue(20);
        analysis4.linearSearchForValue(20);

        /*
        * Bubble Sort
        * O(n^2) Test
        *
        * */

    }
    //O(1)
    //adding an item at a specific index in the array,
    //does not depend on the amount of data
    //execute the same even as the number of items grow in the array
    private void addItem(int newItem){
        theArray[itemsInArray++] = newItem;
    }
    //O(n)
    //Linear search
    //it is proportional to the amount of data in the array
    private void linearSearchForValue(int value){
       boolean valueInTheArray = false;
       String indexWithValue = " ";
       timeStarted = System.currentTimeMillis();
       for(int i=0;i<arraySize;i++){
           if(theArray[i] == value){
               valueInTheArray = true;
               indexWithValue += i + " ";
           }
       }
       System.out.println("Value Found: "+valueInTheArray);
       endTime = System.currentTimeMillis();
       System.out.println("Linear Search Took: "+(endTime - timeStarted));
    }
    /*
    * O(n^2)
    * Bubble Sort
    *
    * */
    private void generateArray(){
        for(int i=0;i<arraySize;i++){
            theArray[i] = (int)(Math.random()*1000) + 10;
            itemsInArray = arraySize -1;
        }
    }
}
