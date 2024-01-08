public class Programmer extends Employee{

    private float salary;

    public Programmer(float salary,int bonus){
        super(salary);
        setBonus(bonus);
    }

    public int getBonus(){
        return bonus;
    }

    public void setBonus(int bonus){
        this.bonus=bonus;
    }



    private int bonus;
}
