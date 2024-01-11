public class Tetrahedron extends ThreeDimensioanal{

    public Tetrahedron(double a,double h){
        setA_H(a,h);
    }

    private double a;
    private double h;

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
    }

    public void setA_H(double a,double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getAlan() {
        return getA()*(getA()+Math.sqrt(Math.pow(getA(),2)+4*(Math.pow(getH(),2))));
    }

    @Override
    public double getHacim() {
        return (Math.pow(getA(),2)*h)/3;
    }

    @Override
    public String toString() {
        return "Tetrahedron("+getA()+"):\n"+"Alan: "+getAlan()+"\nHacim: "+getHacim();
    }
}
