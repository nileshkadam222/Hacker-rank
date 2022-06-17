package hacker.rank.java.Algorithms;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MariaBasketball {
    public static void main(String[] args) {
        List<Integer> integers = Result.breakingRecords(Arrays.asList(10,5,20,20,4,5,2,25,1));;
        integers.forEach(System.out::println);
    }

}

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> highestScore = new ArrayList<>();
        List<Integer> lowestScore = new ArrayList<>();
        AtomicInteger highestCount = new AtomicInteger();
        AtomicInteger lowestCount = new AtomicInteger();

        scores.stream().forEach(a->{
            if(highestScore.isEmpty())
                highestScore.add(a);
            if(lowestScore.isEmpty())
                lowestScore.add(a);

            if(a > highestScore.get(highestScore.size()-1)){
                highestCount.getAndIncrement();
                highestScore.add(a);
            }
            if(a < lowestScore.get(lowestScore.size()-1)){
                lowestCount.getAndIncrement();
                lowestScore.add(a);
            }
        });

        return Arrays.asList(highestCount.get(),lowestCount.get());
    }


}
