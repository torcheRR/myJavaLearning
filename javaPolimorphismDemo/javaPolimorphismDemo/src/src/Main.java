public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();
    }
}