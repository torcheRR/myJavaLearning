public class Main {
    public static void main(String[] args) {

        Araba araba = new Araba("Qashqai", "1",50);
        araba.setBenzinMiktari(0);
        araba.baslat(3);
        araba.arttirBenzinMiktari(500);
        araba.baslat(3);
        System.out.println(araba.getBenzinMiktari() + " litre yakitiniz kaldi!");
        araba.gitIleri(1);
        araba.gitGeri(2);
        System.out.println(araba.getBenzinMiktari() + " litre yakitiniz kaldi!");
        araba.arttirHiz();
        araba.gitGeri(2);
        araba.kontrolEtRadar();
        if(araba.isRenkli){
            System.out.println("aracin yeni rengi: " + araba.getRenk());
        }
        else{
            System.out.println("araciniz renksiz!");
        }
        araba.azaltHiz();
        araba.gitIleri(1);
        System.out.println();
        araba.gosterBilgi();


    }
}