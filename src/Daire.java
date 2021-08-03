import java.lang.constant.Constable;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi=3.14,cevre,alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = inp.nextInt();

        cevre = (2* pi * r);
        alan = (pi * r * r);

        System.out.println("Dairenin çevresi:" + cevre);
        System.out.print("Dairenin alanı :" + alan);
    }
}
