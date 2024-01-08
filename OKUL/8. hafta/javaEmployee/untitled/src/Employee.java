public class Employee {
    private float salary;

    public Employee(float salary){
        setSalary(salary);
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary=salary>0?salary:0;
    }
}
