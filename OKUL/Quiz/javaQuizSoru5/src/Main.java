import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //TANIMLAMALAR
        Random rnd = new Random();

        //RASTGELE SEÇİLECEK SAYILARIMIZ
        int[] sayilar = new int[]{1, 3, 5, 7, 9};

        //EN SON TÜM SAYILARIN ÇIKACAĞI DİZİ
        int[] sayilarimiz = new int[6];

        //İLK ÇARPIM İŞLEMİNİN GERÇEKLEŞECEĞİ DİZİ
        int[] kucuksayi = new int[3];

        //İKİNCİ ÇARPIM İŞLEMLERİNİN GERÇEKLEŞECEĞİ DİZİ
        int[] buyuksayi = new int[3];

        /*
        EN KUCUK VE EN BUYUK SAYILARIN BULUNABİLMESİ İÇİN İF'LERİN İÇERİSİNDE KULLANABİLECEĞİM
        BİR BAŞLANGIÇ DEĞERİ OLMASI İÇİN TANIMLADIĞIM SAYILAR
        */
        int enkucuk = 10, enbuyuk = 1;

//ÇARPIM İŞLEMİ 3 KERE TEKRARLANACAĞI VE DİZİNİN İNDEXİ 0 DAN BAŞLADIĞI İÇİN = i 0 DAN 3 OLANA KADAR
        for (int i = 0; i < 3; i++) {
            //SAYILAR İNDEXİNDEN RASTGELE BİR DEĞER SEÇİYOR
            int secilen = rnd.nextInt(sayilar.length);
            //BU RASTGELE DEĞERİ SAYILAR DİZİSİNDEN ÇAĞIRIP kucuksayi DİZİSİNİN İLK İNDEXİNE YAZIYOR
            kucuksayi[i] = sayilar[secilen];
            //HOCA 1 LE ÇAPRILMASINI İSTEDİĞİ İÇİN 'SÖZDE' ÇARPIM İŞLEMİ YAPTIRDIM (SADECE YAZI)
            System.out.println("1x" + kucuksayi[i] + "=" + kucuksayi[i]);
            //TÜM SAYILARIMIZIN CIKACAĞI SAYILARIMIZ DİZİSİNE BU İLK 3 SAYIYI YAZDIRDIM
            sayilarimiz[i] = kucuksayi[i];

            //EN KUCUK SAYIYI BULABİLMEK İÇİN OLUŞTURULMUŞ BİR İF DEĞERİ
            //ENKUCUK DEGERİNİ kucuksayi DİZİSİNİN EN KUCUK ELEMANINA EŞİTLİYOR
            if (kucuksayi[i] < enkucuk) {
                enkucuk = kucuksayi[i];
            }
        }

        //BİR SATIR BOŞLUK :)
        System.out.println();

//BUNU TANIMLAMA SEBEBİM TÜM SAYILARIMIZIN YAZILDIĞI DİZİNİN İLK ÜÇ YANİ = 0 , 1 , 2. İNDEXLERİNE
//TANIMLAMAYI YUKARDA YAPTIM KALAN İNDEXLERİ 3 , 4 , 5. İNDEXLERİ
        int sayilarimizindevami = 3;

        //3 KERE ÇARPIM İSTENDİĞİ VE DİZİ İNDEXİ 0 DAN BAŞLADIĞI İÇİN= i 0 DAN 3 E KADAR
        for (int i = 0; i < 3; i++) {
            //YENİ CARPIMLARIM 3 6 9 LA YAPILMASI İSTENDİĞİ İÇİN BÖYLE BİR FOR DÖNGÜSÜ
            for (int j = 3; j < 10; j *= 3) {
                //BURDA i ve j YE DİKKAT ANLAMAZSAN SOR!!!
                buyuksayi[i] = kucuksayi[i] * j;
            }
            //KUCUKSAYİ * (3,6,9)(HANGİSİYSE SIRASIYLA)= BUYUKSAYI
            System.out.println(kucuksayi[i] + "x" + 3 * (i + 1) + "=" + buyuksayi[i]);
//AZ ONCE TÜM SAYILARIN TOPLANACAĞI YERDE KULLANMAK İÇİN TANIMLADIĞIM 3 DEĞERİNİ BURDA KULLANDIM
            sayilarimiz[sayilarimizindevami] = buyuksayi[i];
            //INDEX SIRASIYLA 3 4 5 OLARAK DEVAM ETSİN DİYE HER DÖNGÜDE 1 ARTTIR DEDİM
            sayilarimizindevami++;

            //EN BUYUK DEGERI BULMAK İÇİN TANIMLANAN İF
            if (enbuyuk < buyuksayi[i]) {
                enbuyuk = buyuksayi[i];
            }
        }

        //sayılarımızın çıktısı=
        System.out.print("Sayılarımız: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(sayilarimiz[i] + " ");
        }
        System.out.println();

        //en küçük sayi=
        System.out.println("En küçük sayı: " + enkucuk);

        //en büyük sayi=
        System.out.println("En büyük sayı: " + enbuyuk);


    }
}
