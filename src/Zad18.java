public class Zad18{
    public static void main(String[] args) {
        int iloscAkcji = 600;
        double cenaAkcji = 21.77;
        double prowizjaProcent = 2.0;

        double kwotaZaAkcje = iloscAkcji * cenaAkcji;

        double prowizja = (kwotaZaAkcje * prowizjaProcent) / 100;

        double lacznaKwota = kwotaZaAkcje + prowizja;

        System.out.println("Kwota zapłacona za same akcje (bez prowizji): " + kwotaZaAkcje + " zł");
        System.out.println("Wysokość prowizji: " + prowizja + " zł");
        System.out.println("Łączna zapłacona kwota (cena akcji plus prowizja): " + lacznaKwota + " zł");
    }
}

