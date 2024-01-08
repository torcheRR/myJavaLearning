
public class Animal {
    private String name;

    public Animal(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: "+getName();
        //return String.format("Name: ",getName());
    }

    public void eat(){
        System.out.println("I'm eating...");
    }
    public void sounds(){
        System.out.println("Meee");
    }
}
