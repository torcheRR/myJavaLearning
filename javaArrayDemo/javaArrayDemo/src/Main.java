public class Main {
    public static void main(String[] args) {
/*

        String ogrenci1="Berkay";
        String ogrenci2="Yaren";
        String ogrenci3="Gökay";
        String ogrenci4="Nilay";

        String[] ogrenciler= new String[4];
        ogrenciler[0]=ogrenci1;
        ogrenciler[1]=ogrenci2;
        ogrenciler[2]=ogrenci3;
        ogrenciler[3]=ogrenci4;

 */
        
        String[] ogrenciler=new String[4];
        ogrenciler[0]="Berkay";
        ogrenciler[1]="Yaren";
        ogrenciler[2]="Gökay";
        ogrenciler[3]="Nilay";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------------------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}