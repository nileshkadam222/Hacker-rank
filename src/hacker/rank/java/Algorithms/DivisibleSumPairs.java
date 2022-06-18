package hacker.rank.java.Algorithms;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int i = Result2.divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2));
        System.out.println(i);
    }
}

class Result2 {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int counter = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = ar.get(i) + ar.get(j);
                if(sum % k==0){
                    counter++;
                }
            }
        }
        return counter;
    }

}

