public class Circle extends TwoDimensional{
    private double r;
    public Circle(double r){
        setR(r);
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getAlan() {
        return Math.PI*Math.pow(getR(),2);
    }

    @Override
    public String toString() {
        return "Circle("+getR()+"):\nAlan:"+getAlan();
    }



}
