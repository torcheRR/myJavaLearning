public class Main {
    public static void main(String[] args) {

        int[] Matris1 = new int[]{1, 2};
        int[] Matris2 = new int[]{3, 5};

        System.out.println("Matris1 : ["+Matris1[0]+" "+Matris1[1]+"]");

        System.out.println("Matris2 : ["+Matris2[0]+" "+Matris2[1]+"]");


        System.out.println();


        System.out.println("Matris1 Transpoz:");
        for (int i = 0; i < Matris1.length; i++) {
            System.out.println(Matris1[i]);
        }
        System.out.println("Matris2 Transpoz:");
        for (int i = 0; i < Matris2.length; i++) {
            System.out.println(Matris2[i]);
        }
        System.out.println("Matrislerin Toplamı:");
        for (int i = 0; i < Matris2.length; i++) {
            System.out.println((Matris1[i] + Matris2[i]));
        }
        System.out.println("Matrislerin Çıkarımı:");
        for (int i = 0; i < Matris2.length; i++) {
            System.out.println((Matris1[i] - Matris2[i]));
        }
    }
}