import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę ulubionego miasta: ");
        String nazwaMiasta = scanner.nextLine();


        int liczbaZnakow = nazwaMiasta.length();


        String wielkieLitery = nazwaMiasta.toUpperCase();


        String maleLitery = nazwaMiasta.toLowerCase();


        char pierwszyZnak = nazwaMiasta.charAt(0);


        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZnakow);
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + wielkieLitery);
        System.out.println("Nazwa miasta zapisana małymi literami: " + maleLitery);
        System.out.println("Pierwszy znak nazwy miasta: " + pierwszyZnak);

        scanner.close();
    }
}
