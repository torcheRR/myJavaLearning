import java.util.Scanner;
public class Soru4 {
    public static void main(String[] args) {
        int[] dizi1=new int[3];
        int[] dizi2=new int[3];
        int[] dizi3=new int[3];
        int[][] dizi4 = new int[3][3];
        Scanner scr =new Scanner(System.in);

        System.out.print("Lütfen 1. Dizinin Üç Elemanını Giriniz: ");
        for(int i =0;i< dizi1.length;i++){
            dizi1[i]=scr.nextInt();
        }
        System.out.println("1. Dizi Oluşturuldu!");
        //
        System.out.print("Lütfen 2. Dizinin Üç Elemanını Giriniz: ");
        for(int i =0;i< dizi2.length;i++){
            dizi2[i]=scr.nextInt();
        }
        System.out.println("2. Dizi Oluşturuldu!");
        //
        System.out.print("Lütfen 3. Dizinini Üç Elemanını Giriniz: ");
        for(int i =0;i< dizi3.length;i++){
            dizi3[i]=scr.nextInt();
        }
        System.out.println("3. Dizi Oluşturuldu!");
        //
        System.out.println("3x3'lük Yeni Bir Matris Oluşturuldu!");
        //
        for (int i=0;i<dizi1.length;i++){
                dizi4[0][i]=dizi1[i];
                dizi4[1][i]=dizi2[i];
                dizi4[2][i]=dizi3[i];
        }
        for (int i=0;i< dizi4.length;i++){
            for (int j=0;j< dizi4.length;j++){
                System.out.print(dizi4[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrisin Değişen Sonuçları");
        for (int i=0;i< dizi4.length;i++){
            for (int j=0;j< dizi4.length;j++){
                if (i==0&&(j==0||j==2)){
                    dizi4[i][j]*=dizi4[i][j];
                    System.out.print(dizi4[i][j]+" ");
                }
                else if (i==1&&j==1){
                    dizi4[i][j]*=dizi4[i][j];
                    System.out.print(dizi4[i][j]+" ");
                }
                else if (i==2&&(j==0||j==2)){
                    dizi4[i][j]*=dizi4[i][j];
                    System.out.print(dizi4[i][j]+" ");
                }
                else {
                    System.out.print(dizi4[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Yeni Bir Matris Daha Oluşturuldu!");
    }
}