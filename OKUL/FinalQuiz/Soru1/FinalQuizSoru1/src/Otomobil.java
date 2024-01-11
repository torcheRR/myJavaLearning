import java.util.Random;

public class Otomobil extends Arac{
    public Otomobil(){
        setYakit();
    }
    private String yakit;
    Random rnd = new Random();

    public void setYakit() {
        String tur[]={"motorin","benzin","LPG"};
        this.yakit=tur[rnd.nextInt(3)];
    }

    public String getYakit() {
        return yakit;
    }
}
