public class Sphere extends ThreeDimensioanal{

    public Sphere(double r){
        setR(r);
    }


    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getHacim() {
        return (4*(Math.PI*Math.pow(getR(),3))/3);
    }

    @Override
    public double getAlan() {
        return 4*Math.PI*Math.pow(getR(),2);
    }

    @Override
    public String toString() {
        return "Sphere("+getR()+"):\nAlan: "+getAlan()+"\nHacim: "+getHacim();
    }
}
