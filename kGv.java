import java.util.Scanner;
public class kGv {
    public static void main(String[] args) {
        /* Eingabe der Zahlen */
        int ersteZahl = eingabe();
        int zweiteZahl = eingabe();
        int kgv = verarbeitung(ersteZahl, zweiteZahl);
        ausgabe(kgv);
    }
        /* Der Benutzer gibt die Zahlen ein */
    private static int eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hurensohn gib zahl: ");
        return scanner.nextInt();

    }
        /* Bedingungen der Zahlenverhältnise überprüfen */
    private static int verarbeitung(int ersteZahl, int zweiteZahl) {
        if (ersteZahl < 0 || zweiteZahl < 0)
            return -1;
        if (ersteZahl == zweiteZahl)
            return ersteZahl;
        if (ersteZahl == 1)
            return zweiteZahl;
        if (zweiteZahl == 1)
            return ersteZahl;

        /* Ausrechnen des kGv */
        int ersteZahl1 = ersteZahl, zweiteZahl1 = zweiteZahl;
        while (ersteZahl != zweiteZahl) {
            if (ersteZahl < zweiteZahl)
                ersteZahl += ersteZahl1;
            else
                zweiteZahl += zweiteZahl1;
        }

        return ersteZahl;
    }
        /* Ausgabe des kGv */
    private static void ausgabe(int kgv) {
        System.out.println("Das kleinste gemeinsame Vielfache ist " + kgv);

    }


}