package pl.lublin.wsei.java.cwiczenia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    /**
     * komentarz
     * javadoc
     *
     * @param args argumenty pobrane z wiersza poleceń
     */

    public static void main(String[] args) {

        // komentarz jednolinijkowy

        /*
            komentarz
            wielolinijkowy
         */

        System.out.println("Hello Java world\n");

        System.out.println("Print bez znaczników końca linii:");
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");

        System.out.println("\n\nPrintln:");
        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        System.out.println("\nPrint z użyciem znaczników końca linii:");
        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");


        // ----------------------------------------------------------------
        System.out.println("\nWypisywanie wartości zmiennych za pomocą printf:");
        int a = 3;
        double b = 4.21;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);

        // ----------------------------------------------------------------
        System.out.println("\nNazwaliśmy to \"witaminą B3\"");

        // ----------------------------------------------------------------
        System.out.println("\nTabelka funkcji sin:");

        System.out.printf("\nalfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10) {
            System.out.printf("%d\t\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }

        // ----------------------------------------------------------------
        System.out.println("\nTabelka logarytmów o podstawie 2 oraz akumulowana suma kolejnych poteg liczby 2:");
        System.out.printf("\narg\t\tlog2(arg)\tsum(arg)\n");

        int arg = 1, sum = 0;
        double log;

        do {
            log = Math.log(arg) / Math.log(2);
            sum += arg;
            System.out.printf("%d\t\t\t%.0f\t\t\t%d\n", arg, log, sum);
            arg *= 2;
        } while (arg < 20);

        // ----------------------------------------------------------------
        System.out.println("\nPobieranie informacji przy użyciu obiektów klasy Scanner:\n");
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Podaj pierwszą liczbę: ");
        num1 = input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        num2 = input.nextInt();

        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

        // ----------------------------------------------------------------
        System.out.println("\nPobieranie danych od użytkownika z wykorzystaniem pętli do while");
        System.out.println("(pętla kończy działanie, kiedy jako którykolwiek z argumentów zostanie podane 0):\n");

        Scanner inp = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            n1 = inp.nextInt();
            if (n1 == 0) break;
            System.out.print("Podaj drugą liczbę: ");
            n2 = inp.nextInt();
            if (n2 == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", n1, n2, n1 + n2);
        } while (true);

        // ----------------------------------------------------------------
        System.out.println("\nWyświetlanie postaci dwójkowej oraz szesnastkowej:\n");
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Podaj liczbę: ");
        x = in.nextInt();
        String bin = leftPad(Integer.toBinaryString(x), '0', 8);
        String hex = leftPad(Integer.toHexString(x).toUpperCase(Locale.ROOT), '0', 4);
        System.out.printf("DEC = %d, BIN = %s, HEX = %s", x, bin, hex);

        // ----------------------------------------------------------------
    }

    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++) {
            res = aChar + res;
        }
        return res;
    }
}
