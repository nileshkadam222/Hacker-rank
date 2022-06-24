package hacker.rank.java.Algorithms;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(Result10.countingValleys(8,"UDDDUDUU"));
    }
}

class Result10 {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int alt =0,valley=0;
        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            if(direction=='U'){
                alt++;
                if(alt==0){
                    valley++;
                }
            }else {
                alt--;
            }
        }
        return valley;
    }

}
