package hacker.rank.java.Algorithms;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        int i = Result4.migratoryBirds(Arrays.asList(1, 1, 2, 2,2, 3, 3,3,4,4,4));
        System.out.println(i);
    }
}

class Result4 {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer,Integer> hp = new HashMap<>();

                arr.stream().forEach(p->{
                    if(hp.containsKey(p)){
                        hp.put(p,(hp.get(p)+1));
                    }else {
                        hp.put(p,1);
                    }
                });

                int maxCount =0,res=-1;
                for(Map.Entry<Integer,Integer> entry : hp.entrySet()){
                    if (maxCount < entry.getValue())
                    {
                        res = entry.getKey();
                        maxCount = entry.getValue();
                    }
                }
            return res;
    }

}

