import java.util.Random;

public class Motorsiklet extends Arac{
    public Motorsiklet(){
        setYakit();
    }
    private String yakit;
    Random rnd = new Random();

    public void setYakit() {
        String tur[]={"elektrik","benzin"};
        this.yakit=tur[rnd.nextInt(2)];
    }

    public String getYakit() {
        return yakit;
    }
}
