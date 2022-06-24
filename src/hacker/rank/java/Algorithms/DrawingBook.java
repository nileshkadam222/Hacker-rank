package hacker.rank.java.Algorithms;

public class DrawingBook {
    public static void main(String[] args) {
        int i = Result9.pageCount(6, 5);
        System.out.println(i);
    }
}

class Result9 {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here
        int fromFront = p/2;
        int fromBack = (n-p)/2;

        return Math.min(fromFront,fromBack);
    }

}

