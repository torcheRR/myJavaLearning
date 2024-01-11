public class Cube extends ThreeDimensioanal{

    public Cube(double x){
        setX(x);
    }

    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getHacim() {
        return Math.pow(getX(),3);
    }

    @Override
    public double getAlan() {
        return 6*(Math.pow(getX(),2));
    }

    @Override
    public String toString() {
        return "Cube("+getX()+") \nAlan:"+ getAlan() +"\nHacim:"+getHacim();
    }
}
