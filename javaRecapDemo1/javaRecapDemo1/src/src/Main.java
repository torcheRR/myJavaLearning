public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = 0;
        if (enBuyuk < sayi1) {
            enBuyuk = sayi1;
        }

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı= " + enBuyuk);
    }
}