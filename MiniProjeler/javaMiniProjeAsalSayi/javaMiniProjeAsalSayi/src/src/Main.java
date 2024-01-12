public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int number = 4;
        int remainder = number % 2;
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Sayı Asal Değildir.");
        } else if (number < 1) {
            System.out.println("Geçersiz Sayı!");
        } else {
            for(int i = 2; i < number; ++i) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println("Sayı asaldır.");
            } else {
                System.out.println("Sayı asal değildir.");
            }

        }
    }
}
