public class Main {
    public static void main(String[] args) {
    System.out.println(şehirver());
    int toplam = topla(30,4);
    System.out.println(toplam);

    int topla=topla2(2,3,5,6,1,8,7,8);
    System.out.println(topla);

    }
    public static void mesaj(String mesaj){
        System.out.println(mesaj);
    }
    public static void ekle(){
        mesaj("eklendi");
    }
    public static void sil(){
        mesaj("silindi");
    }
    public static void güncelle(){
        mesaj("güncellendi");
    }
    public static String şehirver(){
        return "İstanbul";
    }
    public static int topla(int a, int b){
        return a+b;
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
