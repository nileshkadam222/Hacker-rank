package hacker.rank.java;

import com.sun.javafx.logging.JFRInputEvent;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double payment = sc.nextDouble();
        sc.close();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat usInstance = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaInstance = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat  chinaInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceInstance = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("US: " + usInstance.format(payment));
        System.out.println("India: " + indiaInstance.format(payment));
        System.out.println("China: " + chinaInstance.format(payment));
        System.out.println("France: " + franceInstance.format(payment));
    }


}
