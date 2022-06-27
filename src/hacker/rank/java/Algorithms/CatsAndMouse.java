package hacker.rank.java.Algorithms;

public class CatsAndMouse {

    public static void main(String[] args) {
        System.out.println(catAndMouse(4,2,3));
    }


    static String catAndMouse(int x, int y, int z) {
        int catAdiff = Math.abs(z-x);
        int catBdiff = Math.abs(z-y);
        return catAdiff==catBdiff?"Mouse C" : (catAdiff < catBdiff) ? "Cat A" :"Cat B";
    }
}
