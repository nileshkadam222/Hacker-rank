package hacker.rank.java.Algorithms;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards = {4},drives={5};
        int b=5;
        System.out.println(getMoneySpent(keyboards,drives,b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        AtomicInteger maxUnderB = new AtomicInteger();
        Arrays.stream(keyboards).forEach(keyboard ->{
            Arrays.stream(drives).forEach(drive->{
                int sum = keyboard+drive;
                if(sum<=b && sum > maxUnderB.get()){
                    maxUnderB.set(sum);
                }
            });
        });
        if (maxUnderB.get()==0){
            return -1;
        }
        return maxUnderB.get();
    }
}
