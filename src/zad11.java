import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość produktu: ");
        double cenaProduktu = scanner.nextDouble();

        double podatekStanowy = cenaProduktu * 0.04;
        double podatekLokalny = cenaProduktu * 0.02;
        double cenaSprzedazy = cenaProduktu + podatekStanowy + podatekLokalny;

        System.out.println("Wartość produktu: " + cenaProduktu);
        System.out.println("Podatek stanowy: " + podatekStanowy);
        System.out.println("Podatek lokalny: " + podatekLokalny);
        System.out.println("Łączna cena sprzedaży: " + cenaSprzedazy);

        scanner.close();
    }
}
