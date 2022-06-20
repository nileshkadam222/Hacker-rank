package hacker.rank.java.Algorithms;

public class DayoftheProgrammer {
    public static void main(String[] args) {
        String s4 = Result5.dayOfProgrammer(1800);
        System.out.println(s4);

        String s = Result5.dayOfProgrammer(2017);
        System.out.println(s);

        String s1 = Result5.dayOfProgrammer(2016);
        System.out.println(s1);

        String s2 = Result5.dayOfProgrammer(2100);
        System.out.println(s2);
    }
}

class Result5 {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        if (year < 1918) {
            return year%4==0 ? "12.09."+year : "13.09."+year;
        } else if (year == 1918) {
            return "26.09."+year;
        } else {
            return (year % 4 == 0 && year % 100 != 0)|| year%400 == 0 ? "12.09."+year : "13.09."+year;
        }
    }
}