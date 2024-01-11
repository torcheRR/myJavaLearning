public class Square extends TwoDimensional{
    public Square(double x){
        setX(x);
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    private double x;
    @Override
    public double getAlan() {
        return Math.pow(x,2);
    }

    @Override
    public String toString() {
        return "Square:("+x+"):\nAlan: "+getAlan();
    }
}
