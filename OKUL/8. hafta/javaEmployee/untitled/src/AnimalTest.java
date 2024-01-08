public class AnimalTest {
    public static void main(String[] args) {
        Animal animal=new Animal("Unknown");
        Goat goat=new Goat("Dağ keçisi");

        System.out.println(goat.toString());

        goat.eat();
        goat.sounds();

    }
}
