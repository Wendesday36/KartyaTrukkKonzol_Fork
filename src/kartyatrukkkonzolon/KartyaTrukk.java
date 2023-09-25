package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        KartyaTrukk jatek = new KartyaTrukk();
        jatek.inditas();

    }

    private void inditas() {
        Pakli pakli = new Pakli();

        //feltolt();
        for (int i = 0; i < 3; i++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);

            //kever(oszlop);
        }
        pakli.ezVolt();
        //ezVolt();

    }

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
}
