public class GuvenlikGorevlisi extends Idari{
    public GuvenlikGorevlisi(String isim, String soyisim, int yas, boolean ehliyet){
        setIsim(isim);
        setSoyisim(soyisim);
        setYas(yas);
        setEhliyet(ehliyet);
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(boolean ehliyet) {
        this.ehliyet = ehliyet;
    }

    private String isim;
    private String soyisim;
    private int yas;
    private boolean ehliyet;
    @Override
    public double getMaas() {
        return 17002;
    }
    @Override
    public String toString() {
        return "Güvenlik Görevlisi: "+ getIsim()+" "+ getSoyisim() + "\nYaş:"+getYas()+"\nMaaş: "+ getMaas()+ "\nEhliyet:"+ isEhliyet()+"\n";
    }
}
