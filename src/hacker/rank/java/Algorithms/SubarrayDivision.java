package hacker.rank.java.Algorithms;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        int birthday = Result1.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2);
        //int birthday = Result1.birthday(Arrays.asList(1,1,1,1,1,1), 3, 2);
        //int birthday = Result1.birthday(Arrays.asList(4), 4, 1);
        System.out.println(birthday);
    }
}

class Result1 {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count =0;
        for(int i=0;i<=s.size()-m;i++){
            if(d== s.subList(i,i+m).stream().mapToInt(Integer::intValue).sum()){
                count++;
            }
        }
        return count;
    }

}
