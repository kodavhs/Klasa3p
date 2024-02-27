import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        final int ciasteczkaWPudelku = 40;
        final int porcjeWpudelku= 10;
        final int kalorieNaPorcje = 300;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę zjedzonych ciasteczek: ");
        int liczbaCiasteczek = scanner.nextInt();

        int liczbaPorcjiZjedzonych = liczbaCiasteczek / (ciasteczkaWPudelku / porcjeWpudelku);
        int liczbaSkonsumowanychKalorii = liczbaPorcjiZjedzonych * kalorieNaPorcje;

        System.out.println("Liczba skonsumowanych kalorii: " + liczbaSkonsumowanychKalorii);

        scanner.close();
    }
}
