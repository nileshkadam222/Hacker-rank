package hacker.rank.java.Algorithms;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SalesbyMatchHashSet {
    public static void main(String[] args) {
        int i = Result8.sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        System.out.println(i);
    }
}

class Result8 {

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
        HashSet<Integer> salesMap = new HashSet<>();
        AtomicInteger pairCounter = new AtomicInteger();
        ar.stream().forEach(a->{
            if(!salesMap.contains(a)){
                salesMap.add(a);
            }else{
                pairCounter.getAndIncrement();
                salesMap.remove(a);
            }
        });
        return pairCounter.get();
    }

}

