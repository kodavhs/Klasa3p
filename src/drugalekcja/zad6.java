package drugalekcja;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wprowadz liczbe sekund");
        int sekundy = scanner.nextInt();

        if(sekundy >= 60 && sekundy <3600){
            int minuty = sekundy/60;
            int sek = sekundy - minuty*60;
            System.out.println(sekundy + " sekund to "+ minuty +" minut i "+ sek +" sekund.");
        }
        else if(sekundy >= 3600 && sekundy <86400){
            int godziny = sekundy/3600;
            int minuty = (sekundy - godziny*3600)/60;
            int sek = (sekundy - godziny*3600) - minuty*60;
            System.out.println(sekundy + " sekund to "+ godziny + " godzin, "+ minuty +" minut i "+ sek +" sekund.");
        }
        else if(sekundy >=86400){
            int dni = sekundy/86400;
            int godziny = (sekundy-dni*86400)/3600;
            int minuty = ((sekundy-dni*86400) - godziny*3600)/60;
            int sek = (((sekundy-dni*86400) - godziny*3600)) - minuty*60;
            System.out.println(sekundy + " sekund to "+ dni + " dni, " + godziny + " godzin, "+ minuty +" minut i "+ sek +" sekund.");
        }
    }
}
