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
        * *//*
        analysis1.linearSearchForValue(20);
        analysis2.linearSearchForValue(20);
        analysis3.linearSearchForValue(20);
        analysis4.linearSearchForValue(20);*/

        /*
        * Bubble Sort
        * O(n^2) Test
        *
        * */
        /*analysis1.bubbleSort();
        analysis2.bubbleSort();
        analysis3.bubbleSort();
        analysis4.bubbleSort();*/

        /*
        * Binary Search
        * O(Log N) test
        *
        * */
        /*analysis1.binarySearch(20);
        analysis2.binarySearch(20);
        analysis3.binarySearch(20);
        analysis4.binarySearch(20);*/
        /*
        * Quick Sort
        * O(N Log N) Test
        * O (n log n) Most sorts are at least O(N) because
    every element must be looked at, at least once.
    The bubble sort is O(N^2)
    To figure out the number of comparisons we need
    to make with the Quick Sort we first know that
    it is comparing and moving values very
    efficiently without shifting. That means values
    are compared only once. So each comparison will
    reduce the possible final sorted lists in half.
    Comparisons = log n! (Factorial of n)
    Comparisons = log n + log(n-1) + .... + log(1)
    This evaluates to n log n

        * */
        timeStarted = System.currentTimeMillis();
        analysis1.quickSort(0,analysis1.itemsInArray);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Took: "+(endTime - timeStarted));

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
    private void bubbleSort(){
        timeStarted = System.currentTimeMillis();
        for(int i=arraySize-1;i>1;i--){
            for(int j=0;j<i;j++){
                if(theArray[j] > theArray[j+1]){
                    swapValues(j,j+1);
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort Took: "+(endTime - timeStarted));
    }
    /*
    * O(Log N)
    * Binary Search
    *
    * */
    private void binarySearch(int value){
        int lowIndex = 0;
        int highIndex = arraySize -1;
        int timesThrough = 0;
        timeStarted = System.currentTimeMillis();
        while(lowIndex < highIndex){
            int middleIndex = (lowIndex + highIndex)/2;
            if(theArray[middleIndex] < value ){
                lowIndex = highIndex +1;
            }else if(theArray[middleIndex] > value){
                highIndex = middleIndex -1;
            }else{
                System.out.println("\nFound a Match for " + value
                                + " at Index " + middleIndex);

                lowIndex = highIndex + 1;
            }
            timesThrough++;

        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search took: "+(endTime - timeStarted));
        System.out.println("Times Through: "+timesThrough);
    }
    private void quickSort(int left,int right){
        if ((left - right) <= 0){
            return; //already sorted
        }
        int pivot = theArray[right];
        int pivotLocation = partitionArray(left,right,pivot);
        quickSort(left,pivotLocation -1);
        quickSort(pivotLocation +1,right);

    }

    private int partitionArray(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
        while(true){
            while (theArray[++leftPointer] < pivot);
            while (rightPointer > 0 && theArray[--rightPointer] > pivot);
            if(leftPointer >= rightPointer){
                break;
            }else{
                swapValues(leftPointer,rightPointer);
            }
        }
        swapValues(leftPointer,right);
        return leftPointer;
    }

    private void swapValues(int index1, int index2) {
        int temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }

    private void generateArray(){
        for(int i=0;i<arraySize;i++){
            theArray[i] = (int)(Math.random()*1000) + 10;
            itemsInArray = arraySize -1;
        }
    }
}
