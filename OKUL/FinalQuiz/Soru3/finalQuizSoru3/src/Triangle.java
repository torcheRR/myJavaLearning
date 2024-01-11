public class Triangle extends TwoDimensional{

    public Triangle(double x, double y){
        setX_Y(x,y);
    }

    private double x;
    private double y;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX_Y(double x,double y) {
        this.x = x;
        this.y=y;
    }


    @Override
    public double getAlan() {
        return (getY()*getX())/2;
    }

    @Override
    public String toString() {
        return "Triangle("+getX()+","+getY()+"):\nAlan: "+getAlan();
    }
}
