import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        multiplier();
    }

    public static void multiplier() {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int sayi1 = 0, sayi2 = 0, sonuc = 0, cevap = 0, dongu = 0;

        System.out.println("How many times do you want to answer multiplier questions?");
        dongu = input.nextInt();
        do {
            sayi1 = r.nextInt(10);
            sayi2 = r.nextInt(10);
            sonuc = sayi2 * sayi1;
            System.out.print("How much is " + sayi1 + " * " + sayi2 + " ? =");
            cevap = input.nextInt();
            if (sonuc == cevap) {
                System.out.println("True!");
            } else {
                System.out.println("False!");
            }
            dongu--;
        } while (dongu > 0);
    }
}
