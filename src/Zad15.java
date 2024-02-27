import java.util.Scanner;

public class Zad15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj cenę detaliczną płytki: ");
            double cenaDetaliczna = scanner.nextDouble();

            double zysk = cenaDetaliczna * 0.4;

            System.out.println("Zysk ze sprzedaży: " + zysk);

            scanner.close();
        }
}
