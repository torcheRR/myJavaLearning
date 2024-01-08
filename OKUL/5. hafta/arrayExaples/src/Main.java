import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array=new int[3];
        Random r=new Random();
        Scanner input14=new Scanner(System.in);
        displayArray(array);
        System.out.println();

        fillArray(array,input14);

        System.out.println();
        displayArray(array);
        System.out.println();
        fillArrayRandomNumber(array,r);
        System.out.println();
        displayArray(array);
    }

    public static void displayArray(int[] array1){
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }


    public static void fillArray(int[] array, Scanner input1){
        for(int i=0;i<array.length;i++){
            System.out.print("Enter "+(i+1)+". element of an array ");
            array[i]=input1.nextInt();
        }
    }


    public static void fillArrayRandomNumber(int[] myarray, Random r){
        for (int i=0;i<myarray.length;i++){
            myarray[i]=r.nextInt(-2,24);
        }
    }



}
