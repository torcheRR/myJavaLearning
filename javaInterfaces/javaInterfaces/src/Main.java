public class Main {

    public static void main(String[] args) {
    //database i buradan değiştirebilirsin
    CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
    customerManager.add();

    }
}
