import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int years=year.nextInt();

        if(years%4==0 && years%100!=0 || years%400==0){
            System.out.println(years+" artık bir yıldır." );
        }
        else{
            System.out.println(years + " artık bir yıl değildir");
        }
    }
}