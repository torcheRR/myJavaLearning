public class EmpTest {
    public static void main(String[] args) {
        Employee embOpj= new Employee(14);
        System.out.println("Salary: "+ embOpj.getSalary());

        Programmer programmerObj=new Programmer(124,7);
        programmerObj.setSalary(500);

        System.out.println("Salary: "+ programmerObj.getSalary());
    }
}
