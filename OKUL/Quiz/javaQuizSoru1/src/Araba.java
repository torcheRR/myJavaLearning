import java.util.Random;
    public class Araba {
        private String model;
        private String yas;
        private String renk;
        private int hiz;
        private int mod;  // (0 1 2) 0-güvenli yolculuk 1- 140 tan hızlı değil ama uyarı vermemiz lazım 2- orospu cocu 140 tan hızlı niye gidiyon
        boolean isRenkli = false;
        private int yol;
        private int benzinMiktari;
        private String konum = "Edremit";

        Araba(){};
        Araba(String model, String yas, int hiz){
            this.model = model;
            this.yas = yas;
            this.hiz = hiz;
        }
        Random random = new Random();

        public void setYol(int yol){this.yol = yol;}
        public void setBenzinMiktari(int benzinMiktari){this.benzinMiktari = benzinMiktari;}
        public void setKonum(String konum){this.konum = konum;}

        public int getYol(){return yol;}
        public int getBenzinMiktari(){return benzinMiktari;}
        public String getKonum(){return konum;}
        public String getRenk(){return renk;}

        public void arttirBenzinMiktari(int benzinLitre){benzinMiktari+=benzinLitre;}
        public void azaltBenzinMiktari(int benzinLitre){benzinMiktari-=benzinLitre;}

        public String konumBelirle(){
            if(yol>0 && yol<=50){
                return "Edremit";
            }
            else if(yol>50 && yol <=100){
                return "Marmara";
            }
            else if(yol>100 && yol<=150){
                return "Erdek";
            }
            else if(yol>150 && yol<=200){
                return "AltıEylül";
            }
            else if(yol>200 && yol<=250){
                return "Bandırma";
            }
            else return null;
        }
        public void baslat(int saat){
            gitIleri(saat);

        }

        public void gitIleri(int saat){
            if (yol+(hiz*saat)>250){
                System.out.println("Bandırma sinirinin ilerisine geldiniz!!!");
                yol = 250;
            }

            else if(benzinMiktari>hiz*saat){
                yol += hiz * saat;
                benzinMiktari-= hiz*saat;
                System.out.println("Araciniz ileri yönde ilerledi");
            }
            else{
                System.out.println("Araciniz ileri yönde ilerleyemedi!!!");
            }

        }
        public void gitGeri(int saat){
            if(yol - (hiz*saat) < 0 ){
                System.out.println("Edremit sinirinin gerisine geldiniz!!!");
                yol = 0;
            }
            else if(benzinMiktari>hiz*saat){
                yol -= hiz * saat;
                benzinMiktari-=hiz*saat;
                System.out.println("Araciniz geri yönde ilerledi");
            }
            else {
                System.out.println("Araciniz geri yönde ilerleyemedi!!!");
            }

        }

        public void arttirHiz(){
            int[] options = {2,3,5};
            int x = random.nextInt(0,3);
            hiz = hiz * options[x];
        }

        public void azaltHiz(){
            hiz = hiz/2;
        }

        public void kontrolEtRadar(){
            if(hiz>140){
                mod = 2;
                silRenk();
            }
            else if(hiz < 140 && hiz > 100){
                mod = 1;
            }
            else if(hiz<100){
                mod = 0;
                ataRenk();
            }
            else {
                mod = 404;
            }
        }

        public void silRenk(){
            if(mod==2){
                renk = null;
                isRenkli = false;
            }
        }

        public void ataRenk(){
            String[] renkler = {"kirmizi", "mavi", "siyah", "beyaz", "gri"};
            if(mod == 0){
                renk = renkler[random.nextInt(0,5)];
                isRenkli = true;
            }
        }

        public void gosterBilgi(){
            System.out.println("model: " + model);
            System.out.println("yas: " + yas);
            System.out.println("renk " + renk);
            System.out.println("hiz: " + hiz);
            System.out.println("mod kodu: " + mod);
            System.out.println("renkli mi: " + isRenkli);
            System.out.println("alinan yol: " + yol);
            System.out.println("kalan benzin: " + benzinMiktari);
            System.out.println("mevcut konum: " + konumBelirle() );
        }

    }

