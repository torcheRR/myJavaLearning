public class Main {
    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();

        System.out.println("Hesap: "+accountManager.getBalance());

        accountManager.deposit(100);
        System.out.println("Hesap: "+accountManager.getBalance());

        try {
            accountManager.withdraw(90);
        }

        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: "+accountManager.getBalance());



        try {
            accountManager.withdraw(20);
        }

        catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: "+ accountManager.getBalance());
    }
}