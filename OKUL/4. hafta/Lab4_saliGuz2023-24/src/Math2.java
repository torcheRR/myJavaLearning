import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner deger = new Scanner(System.in);
        int aDeger = deger.nextInt();
        int bDeger = deger.nextInt();

        while (true) {
            Scanner secim = new Scanner(System.in);
            System.out.println("Max:1, Min:2, Average:3, Absolute:4, Power:5, Exit:6");

            switch (secim.nextInt()) {
                case 1:
                    System.out.println("Max: " + findMax(aDeger, bDeger));
                    break;
                case 2:
                    System.out.println("Min: "+findMin(aDeger, bDeger));
                    break;
                case 3:
                    System.out.println("Average: "+average(aDeger,bDeger));
                    break;
                case 4:
                    System.out.println(mutlakDeger(aDeger,bDeger));
                    break;
                case 5:
                    System.out.println(power(aDeger,bDeger));
                    break;
                case 6:
                    return ;



            }

        }
    }

    public static int findMax(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public static int findMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int average(int a, int b) {
        return (a + b) / 2;
    }

    public static String mutlakDeger(int a,int b){

        if(a<0||b<0){
            if (a<0) {
                a = a * -1;
            }if(b<0) {
                b = b * -1;
            }
                String x=("Absolute Values: "+a+" "+b);
                return x;

        }else{
            String y=("Absolute Values: "+a+" "+b);
            return y;
        }
    }

    static int power(int a,int b){
        int sonuc=1;
        for(int i=1;i<=b;i++){
            sonuc=sonuc*a;
        }
        return sonuc;
    }



}

