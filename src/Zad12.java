import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę przejechanych kilometrów: ");
        double przejechaneKilometry = scanner.nextDouble();

        System.out.print("Podaj liczbę zużytych litrów paliwa: ");
        double zuzyteLitryPaliwa = scanner.nextDouble();

        double kilometryNaLitrze = przejechaneKilometry / zuzyteLitryPaliwa;

        System.out.println("Liczba kilometrów przejechanych na litrze paliwa: " + kilometryNaLitrze);

        scanner.close();
    }
}
