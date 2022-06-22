package hacker.rank.java.Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesbyMatch {
    public static void main(String[] args) {
        int i = Result7.sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        System.out.println(i);
    }
}

class Result7 {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Double> salesMap = new HashMap<>();
        ar.stream().forEach(a->{
            if(salesMap.containsKey(a)){
                double valueCounter = salesMap.get(a);
                double ans = valueCounter+0.5;
                salesMap.put(a,valueCounter+0.5);
            }else{
                salesMap.put(a,0.5);
            }
        });
        int sum = 0;
        for(Map.Entry<Integer,Double> a:salesMap.entrySet()){
            double floerValue = Math.floor(a.getValue());
                sum +=floerValue;
        }
        return sum;
    }

}

