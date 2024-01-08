import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 2 sayı giriniz: ");

        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sonuc = 0;

        for (double i = 1; sayi1 <= sayi2; i++) {
            sonuc += faktoriyel(i) / sayi1;
            System.out.print(i + "!/" + sayi1 + "+");
            sayi1++;
        }

        System.out.println("= "+sonuc);
    }

    public static double faktoriyel(double i) {

        double sonuc = 1;

        for (int j = 1; j <= i; j++) {
            sonuc *= j;
        }

        return sonuc;
    }
}