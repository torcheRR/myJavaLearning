import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r= new Random();
        generate2Matrix(r);

        yaziTura(r);
        heart();

    }

public static void heart(){
        for(int i=0; i<10; i++){
            System.out.println("<3");
        }
}
    public static void generate2Matrix(Random r){

        for (int i = 0; i < 10; i++) {
            System.out.print("<3" + " ");
        }


        for (int a = 0; a < 2; a++) {
            System.out.println();
            System.out.println("My Matrix");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("<3" + " ");
                }
                System.out.println();

            }
        }
    }


    public static void yaziTura(Random r){
        int yazi = 0;
        int tura = 0;
        String para[] = new String[]{"yazi", "tura"};
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Yazı tura oynanıyor!!");
            String sonuc = para[r.nextInt(2)];
            if (sonuc == "yazi") {
                System.out.println("Sonuç : " + sonuc);
                yazi++;
            } else {
                System.out.println("Sonuç : " + sonuc);
                tura++;
            }
        }
        System.out.println("Bu oyunda Toplamda: ");
        System.out.println(yazi + "/10 oranında yazı");
        System.out.print(tura + "/10 oranında tura geldi!");
    }
}