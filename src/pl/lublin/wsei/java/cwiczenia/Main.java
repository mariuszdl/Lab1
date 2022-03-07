package pl.lublin.wsei.java.cwiczenia;

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
    }
}
