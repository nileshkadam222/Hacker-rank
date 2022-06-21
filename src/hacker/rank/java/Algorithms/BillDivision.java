package hacker.rank.java.Algorithms;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        Result6.bonAppetit(Arrays.asList(3,10,2,9),1,7);
    }
}

class Result6 {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int bActualBill =0;
        for(int i=0;i<bill.size();i++){
            if(i != k){
                bActualBill+=bill.get(i);
            }
        }
        bActualBill = bActualBill/2;
        if(bActualBill==b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-bActualBill);
        }

    }

}

