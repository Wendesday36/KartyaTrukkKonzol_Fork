package kartyatrukkkonzolon;

import kartyatrukkkonzolon.Pakli;
import java.util.Scanner;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    int oszlop;

    public KartyaTrukk() {
        int oszlop = sc.nextInt();
    }

    private  int melyik(int oszlop) {
        boolean jo;

        do {
            System.out.print("melyik oszlop (1-3): ");

            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
}
