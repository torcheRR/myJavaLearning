public class Main {
    public static void main(String[] args) {
    sayiBulmaca(2);
    sayiBulmaca(5);
    sayiBulmaca(6);
    }

    public static void sayiBulmaca(int aranacak){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        boolean varMi=false;
        for (int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesaj("Sayı Mevcuttur:",aranacak);
        }else{
            degil(aranacak);
        }
    }

    public static void mesaj(String mesaj1, int aranacak){
        System.out.println(mesaj1+" "+aranacak);
    }

    public static void degil(int aranacak){
        System.out.println("Sayı Mevcut Değildir: "+aranacak);
    }
}
