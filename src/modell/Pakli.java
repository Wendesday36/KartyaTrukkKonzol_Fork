package modell;

import nezet.KartyaTrukk;

public class Pakli {

    String[] pakli = new String[22];
    KartyaTrukk szoveg = new KartyaTrukk();
    public Pakli() {
        feltolt();
    }

  public  void feltolt() {
      
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int j = 1;
        for (String szin : szinek) {
            for (int a = 0; a < ertekek.length && j < pakli.length; a++) {
                pakli[j++] = szin + "_" + ertekek[a];
            }
        }

    }

  public  void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            szoveg.kiirkartya( pakli[i]);
            if (i % 3 == 0) {
                szoveg.kiir("");
            }
        }
    }

   public void kever(int oszlop) {
        // mindig középre a választott
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;
    }

  public  void ezVolt() {
        szoveg.kiir("A választott lap: " + pakli[11]);
    }

   
}
