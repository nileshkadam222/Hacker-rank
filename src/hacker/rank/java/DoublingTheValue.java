package hacker.rank.java;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class DoublingTheValue {

    public static void main(String[] args) {
        int N = 5;
        long B = 2;
        int[] a = {1,2,3,4,8};

       for(int i=0;i<N;i++){
           if(B == a[i]){
            B = B * B;
           }
       }

       System.out.println(B);
    }
}
