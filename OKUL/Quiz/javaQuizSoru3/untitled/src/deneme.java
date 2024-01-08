import java.util.Scanner;

public class deneme {

    public static int faktoriyel(int i){
        int sonuc=1;
        for(int j=1;j<=i;j++){
            sonuc*=j;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayi1,sayi2,toplam=0;

        System.out.println("2 sayi gir");
        sayi1=input.nextDouble();
        sayi2=input.nextDouble();


        for (int i=1;sayi1<=sayi2;i++){
            toplam = toplam +(faktoriyel(i)/sayi1);
            System.out.print(i+"!"+"/"+sayi1+"+");
            sayi1++;
        }


        System.out.println();
        System.out.println("hesap: "+toplam);
    }
}
