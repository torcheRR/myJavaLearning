import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İzmir");
        sehirler.add("Ankara");
        sehirler.add("Giresun");
        sehirler.add("İstanbul");

        sehirler.remove("Ankara");

        Collections.sort(sehirler);

        for (String sehir: sehirler){
            System.out.println(sehir);
        }

    }
}