import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        final double podatekProcent = 6.75;
        final double NapiwekProcent = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj cenę posiłku: ");
        double cenaPosilku = scanner.nextDouble();


        double podatek = cenaPosilku * (podatekProcent / 100);


        double napiwek = (cenaPosilku + podatek) * (NapiwekProcent/ 100);


        double lacznaKwota = cenaPosilku + podatek + napiwek;


        System.out.println("Cena posiłku: " + cenaPosilku);
        System.out.println("Wartość podatku: " + podatek);
        System.out.println("Wysokość napiwku: " + napiwek);
        System.out.println("Łączna kwota do zapłaty: " + lacznaKwota);

        scanner.close();
    }
}
