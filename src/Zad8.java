import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

    float LengthPomieszczenie1 = 0;
    float WidthPomieszczenie1 = 0;

        float LengthPomieszczenie2 = 0;
        float WidthPomieszczenie2 = 0;

        float LengthPomieszczenie3 = 0;
        float WidthPomieszczenie3 = 0;

        float LengthPomieszczenie4 = 0;
        float WidthPomieszczenie4 = 0;

        Scanner klawisz = new Scanner(System.in);


        System.out.println("Podaj długość pokoju nr1: ");
        LengthPomieszczenie1 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr1: ");
        WidthPomieszczenie1 = klawisz.nextInt();
        klawisz.nextLine();


        System.out.println("Podaj długość pokoju nr2: ");
        LengthPomieszczenie2 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr2: ");
        WidthPomieszczenie2 = klawisz.nextInt();
        klawisz.nextLine();


        System.out.println("Podaj długość pokoju nr3: ");
        LengthPomieszczenie3 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr3: ");
        WidthPomieszczenie3 = klawisz.nextInt();
        klawisz.nextLine();



        System.out.println("Podaj długość pokoju nr4: ");
        LengthPomieszczenie4 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr4: ");
        WidthPomieszczenie4 = klawisz.nextInt();
        klawisz.nextLine();






        float pomieszczenie1 = (LengthPomieszczenie1 * WidthPomieszczenie1);
        float pomieszczenie2 = (LengthPomieszczenie2 * WidthPomieszczenie2);
        float pomieszczenie3 = (LengthPomieszczenie3 * WidthPomieszczenie3);
        float pomieszczenie4 = (LengthPomieszczenie4 * WidthPomieszczenie4);



        System.out.println (pomieszczenie1 + " metrow kwadratowych");
        System.out.println (pomieszczenie2 + " metrow kwadratowych");
        System.out.println (pomieszczenie3 + " metrow kwadratowych");
        System.out.println (pomieszczenie4 + " metrow kwadratowych");



        float powierzchnia = ( pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4 );

        System.out.println ("mieszkanie ma " + powierzchnia + " metrów kwadratowych");

        float IloscOsob = 4;
        float PowierzchniaNaOsobe = (powierzchnia / IloscOsob);

        System.out.println ("ilość metrów kwaratowych na 1 osobę: " + PowierzchniaNaOsobe);


    }
}
