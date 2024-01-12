public class TEST {
    public static void main(String[] args) {

        //daire Alan
        Circle circle= new Circle(6);

        //kare alan
        Square square = new Square(5);

        //üçgen alan
        Triangle triangle= new Triangle(3,4);

        //küre alan, hacim
        Sphere sphere= new Sphere(3);

        //küp Alan, Hacim
        Cube cube = new Cube(5);

        //düzgün dörtyüzlü(piramit)
        Tetrahedron tetrahedron = new Tetrahedron(5,5);

        Shape[] shape= new Shape[]{circle,square,triangle,sphere,cube,tetrahedron};

        for (Shape shape1 : shape){
            if (shape1 instanceof ThreeDimensioanal){
                System.out.println("3 Boyutlu bir şekil:");
                System.out.println(shape1);
            }
            else{
                System.out.println("2 Boyutlu bir şekil:");
                System.out.println(shape1);
            }
            System.out.println();
        }

    }

}
