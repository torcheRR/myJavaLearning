import java.util.Scanner;

public class siniflarKullanimi {
    public void displayMessage(){
        System.out.println("Kitaba Hoş Geldiniz!");
    }

    public void displayMessage2(String kelime){
        System.out.println(kelime);
    }

    //static bir fonksiyon oluştursaydık direkt olarak kullanabilirdik!
    //örneğin
    public static void displayMessage3(){
        System.out.print("Merhaba ");
    }
    public static void main(String[] args) {

        siniflarKullanimi siniflarKullanimi= new siniflarKullanimi();
        Scanner input =new Scanner(System.in);

        System.out.println("İsmin ne?");
        String kelime=input.nextLine();
        displayMessage3();
        siniflarKullanimi.displayMessage2(kelime+"!");
    }
}
