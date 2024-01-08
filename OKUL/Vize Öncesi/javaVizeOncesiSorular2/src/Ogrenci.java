public class Ogrenci {
    String isim, soyisim, cinsiyet, id;

    public String getCinsiyet() {
        return cinsiyet;
    }

    public String getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    //BUNLARIN HERBİRİNİ TEK TEK YAZMAK YERİNE HEPSİ TEK BİR YERDE DE TOPLANABİLİR

    public void setOgrenci(String isim, String soyisim, String cinsiyet, String id){
        this.cinsiyet=cinsiyet;
        this.soyisim=soyisim;
        this.isim=isim;
        this.id=id;
    }

    //AYNI ŞEKİLDE HEPSİ TEK SEFERDE DE ÇAĞIRILABİLİR (HEPSİNİN GETLERİNİN TANIMLI OLMASI GEREKİYOR AMA :,) )

    public void getOgrenci(){
        System.out.println("ID: "+getId()+"\nİsim: "+getIsim()+"\nSoyisim: "+getSoyisim()+"\nCinsiyet: "+getCinsiyet());
    }
}
