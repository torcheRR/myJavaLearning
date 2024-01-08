import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        int total = 0;
        int gradecounter = 1;
        Scanner s = new Scanner(System.in);
        while(gradecounter<=10){
            System.out.println("Bir Not Girin: ");
        total+=s.nextInt();
        gradecounter++;
        }
        System.out.println("Toplam Kişi Sayısı: "+ (gradecounter-1));
        System.out.println("Sınıf Ortalaması: "+ total/(gradecounter-1));
    }
}