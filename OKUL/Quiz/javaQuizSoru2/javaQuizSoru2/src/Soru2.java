import java.util.Random;

public class Soru2 {
    public static void main(String[] args) {
        //tanımlamalar
        int[] dizi1 = new int[3];
        int[] dizi2= new int[3];
        int[][] dizi3= new int[3][3];
        int[] number= new int[]{1,5,4,3,7};

        Random rnd=new Random();

        //dizi1 in number değerlerinden rastgele tanımlanması
        for(int i=0; i< dizi1.length;i++){
            dizi1[i]=number[rnd.nextInt(number.length)];
        }
        //dizi2 nin number değerlerinden rastgele tanımlanması
        for(int j=0;j< dizi2.length;j++){
            dizi2[j]=number[rnd.nextInt(number.length)];
        }
        //1. dizi çıktısı
        System.out.println("1. Array is:");
        for (int i=0;i< dizi1.length;i++){
            System.out.println(dizi1[i]);
        }
        //2. dizi çıktısı
        System.out.println("2. Array is: ");
        for (int i=0;i< dizi2.length;i++){
            System.out.println(dizi2[i]);
        }
        //3. yani yeni dizinin tanımlaması
        for(int i = 0; i<dizi3.length;i++){
            dizi3[i][0]=dizi1[i];
            dizi3[i][1]=dizi2[i];
            dizi3[i][2]=dizi1[i]*dizi2[i];
        }
        //3. dizinin çıktısı
        System.out.println("3. Array is: ");
        for(int i=0;i<dizi3.length;i++){
            for(int j=0;j< dizi3.length;j++){
                System.out.print(dizi3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
