package challenges.recursionandbacktracking;

/*
* The Fibonacci Sequence

The Fibonacci sequence appears in nature all around us, in the arrangement of seeds in a sunflower and the spiral of a nautilus for example.

The Fibonacci sequence begins with  and  as its first and second terms. After these first two elements, each subsequent element is equal to the sum of the previous two elements.

Programmatically:
*
* */
class Fibonacci {
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return  fibonacci(n-1) + fibonacci(n-2);
    }
}
