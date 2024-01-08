import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Math mathObj=new Math();
//        mathObj.findMax();
//        mathObj.findMin();

        Scanner input=new Scanner(System.in);
        System.out.print("Enter two number: ");
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();
        mathObj.findMax(firstNumber,secondNumber);
        mathObj.findMin(firstNumber,secondNumber);
        mathObj.kuvvetAl(firstNumber,secondNumber);

        mathObj.mutlakDeger(firstNumber);
        mathObj.mutlakDeger(secondNumber);
    }

    public void findMax(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();

        if(firstNumber<secondNumber){
            System.out.println("Max: "+secondNumber);
        }else {
            System.out.println("Max: "+firstNumber);
        }
    }

    public void findMax(int firstNumber,int secondNumber){
        if(firstNumber<secondNumber){
            System.out.println("Max: "+secondNumber);
        }else {
            System.out.println("Max: "+firstNumber);
        }
    }

    public void findMin(){
        Scanner input=new Scanner(System.in);
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();
        if(firstNumber<secondNumber){
            System.out.println("Min: "+firstNumber);
        }else{
            System.out.println("Min: "+secondNumber);
        }
    }

    public void findMin(int firstNumber, int secondNumber){
        if(firstNumber<secondNumber){
            System.out.println("Min: "+firstNumber);
        }else{
            System.out.println("Min: "+secondNumber);
        }

    }
    public static void kuvvetAl(int firstNumber, int secondNumber){
        System.out.println(firstNumber+"^"+secondNumber+"="+power(firstNumber,secondNumber));
    }
    static int power(int a,int b){
        int sonuc=1;
        for(int i=1;i<=b;i++){
            sonuc=sonuc*a;
        }
        return sonuc;
    }



    public void mutlakDeger(int a){

        if(a<0){
            System.out.println(a=a*-1);
        }else{
            System.out.println(a);
        }
    }

}
