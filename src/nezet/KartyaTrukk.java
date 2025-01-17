package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        KartyaTrukk jatek = new KartyaTrukk();
        jatek.inditas();

    }

    public void inditas() {
        Pakli pakli = new Pakli();

        for (int i = 0; i < 3; i++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);

        }
        pakli.ezVolt();

    }

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            kiir("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

    public static void kiirkartya(String pakli) {
        System.out.printf("%-8s", pakli);

    }

    public static void kiir(String szoveg) {
        System.out.print(szoveg);

    }
}
