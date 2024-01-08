public class Goat extends Animal{
    public Goat(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("I'm eating goat food.");
    }
    @Override
    public void sounds(){
        System.out.println("Meee");
    }
}
