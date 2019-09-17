
// Dette er en class der kan reade integer inputs mellem 0 og 100 og så gange den med 2, 4 eller 8.
// Den er lavet for at teste 'if' og 'switch'.

import java.util.Scanner;

public class IfThenElse {
    public static void main(String[] args) {

        // Deklarer scanner klasse.
        Scanner scanner = new Scanner(System.in);

        // User prompt.
        System.out.println("Skriv et tal mellem 0 og 100:");
        int input = scanner.nextInt();

        // Første 'if' således at tallet ikke er udenfor intervallet.
        // Skriv: 'Ugyldigt tal' hvis det er udenfor intervallet.
        if (input > 0 && input < 100) {
            System.out.println("Hvad vil du gange med? (1: gang med 2, 2: gang med 4, 3: gang med 8)");
            int operation = scanner.nextInt();

            // Anden 'if' så man kun har 3 valg.
            // Skriv: 'Ugyldigt tal' hvis det er udenfor intervallet.
            if (operation > 0 && operation <= 3) {

                // Switch for at vælge den rigtige operation.
                switch (operation) {
                    case 1:
                        System.out.println("Resultatet er: " + input * 2);
                        break;
                    case 2:
                        System.out.println("Resultatet er: " + input * 4);
                        break;
                    case 3:
                        System.out.println("Resultatet er: " + input * 8);
                }
            }
            else
                System.out.println("Ugyldigt tal");

        }
        else
            System.out.println("Ugyldigt Tal");

    }
}
