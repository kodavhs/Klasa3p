import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        final double SZKLANKI_CUKRU = 1.5;
        final double SZKLANKI_MASLA = 1.0;
        final double SZKLANKI_MAKI = 2.75;
        final int ILOSC_CIASTECZEK = 48;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj oczekiwaną liczbę ciasteczek: ");
        int oczekiwanaLiczbaCiasteczek = scanner.nextInt();


        double wspolczynnikProporcji = (double) oczekiwanaLiczbaCiasteczek / ILOSC_CIASTECZEK;

        double iloscCukru = SZKLANKI_CUKRU * wspolczynnikProporcji;
        double iloscMasla = SZKLANKI_MASLA * wspolczynnikProporcji;
        double iloscMaki = SZKLANKI_MAKI * wspolczynnikProporcji;


        System.out.println("Do upieczenia " + oczekiwanaLiczbaCiasteczek + " ciasteczek potrzeba:");
        System.out.println("Cukru: " + iloscCukru + " szklanki");
        System.out.println("Masła: " + iloscMasla + " szklanki");
        System.out.println("Mąki: " + iloscMaki + " szklanki");

        scanner.close();
    }
}

