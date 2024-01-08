import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add("Berkay");
        sayilar.add(28);
        sayilar.add(777);
        sayilar.set(0,"Berkay<3Yaren");

        //System.out.println(sayilar.get(0));
        //sayilar.remove(0);
        //sayilar.clear();
        for (Object i:sayilar){
            System.out.println(i);
        }


    }
}