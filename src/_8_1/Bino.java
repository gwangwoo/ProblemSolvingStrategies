package _8_1;

public class Bino {
    public static void main(String[] args) {
        int bino = bino(8, 4);
        System.out.println("bino = " + bino);
    }

    static int bino(int n, int r) {
        if(r == 0 || n == r) return 1;
        if(n == 2 && r == 1) System.out.println("here");
        return bino(n-1, r-1) + bino(n-1, r);
    }
}
