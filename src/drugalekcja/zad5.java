package drugalekcja;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj mase obiektu");
        double masa = scanner.nextDouble();

    double ciezar = masa * 9.8;

    if(ciezar>1000){
        System.out.print("obiekt zbyt ciezki");
    } else if (ciezar<10){
        System.out.print("obiekt zbyt lekki");
    } else{
        System.out.println("ciezar wynosi " + ciezar + " niutonow");
    }




    }

}
