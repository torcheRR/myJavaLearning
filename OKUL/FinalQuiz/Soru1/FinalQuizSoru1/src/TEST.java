public class TEST {
    public static void main(String[] args) {
        Docent docent = new Docent("Berkay","Öcer",20,true);
        ArastirmaGorevlisi arastirmaGorevlisi = new ArastirmaGorevlisi("Yaren","ÖCER",21,true);
        DoktorOgretimUyesi doktorOgretimUyesi = new DoktorOgretimUyesi("Nilay","Öcer",1,true);
        Prof prof = new Prof("Tuncay","Öcer",45,true);
        Sekreter sekreter = new Sekreter("Nuray","Öcer",43,true);
        GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("Gökay", "Öcer",12,false);


        Calisan[] calisanlar = new Calisan[]{arastirmaGorevlisi, docent, doktorOgretimUyesi, prof,
                sekreter, guvenlikGorevlisi};
        Calisan[] var8 = calisanlar;
        int var9 = calisanlar.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            Calisan calisan = var8[var10];
            System.out.println(calisan);
        }
    }
}
