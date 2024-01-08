import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String, String>();
        sozluk.put("Baba","Dad");
        sozluk.put("Anne","Mother");
        sozluk.put("Aşk","Yaren<3");
        System.out.println(sozluk.size());
        System.out.println(sozluk.get("Aşk"));

        for (String item: sozluk.keySet()){
            System.out.println("Eleman: "+ item+" -> Değer: "+sozluk.get(item));
        }

        sozluk.clear();
        System.out.println(sozluk.get("Aşk"));




    }
}