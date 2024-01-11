public class TEST {
    public static void main(String[] args) {
        //daire Alan
        Circle circle= new Circle(6);
        System.out.println(circle);
        System.out.println();

        //kare alan
        Square square = new Square(5);
        System.out.println(square);
        System.out.println();

        //üçgen alan
        Triangle triangle= new Triangle(3,4);
        System.out.println(triangle);
        System.out.println();

        //küre alan, hacim
        Sphere sphere= new Sphere(3);
        System.out.println(sphere);
        System.out.println();

        //küp Alan, Hacim
        Cube cube = new Cube(5);
        System.out.println(cube);
        System.out.println();

        //düzgün dörtyüzlü(piramit)
        Tetrahedron tetrahedron = new Tetrahedron(5,5);
        System.out.println(tetrahedron);
        System.out.println();
    }
}
