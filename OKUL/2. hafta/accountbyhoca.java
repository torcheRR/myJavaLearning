public class Account {
    private double Balance;

    //no arg const
    public Account()
    {

    }
    
    //no arg const
    public Account(double Balance1)
    {
        this.Balance=Balance1;
    }
    public void setBalance(double Balance){
        if(Balance>0)
        this.Balance=Balance;
    }

    public double getBalance(){
        return this.Balance;
    }

    public void displayAccount(){
        System.out.printIn("Balance:"+getBalance());
    }

    public static void main(String[] args){
        Account accountObj1=new Account();
        accountObj1.displayAccount();
        accountObj1.setBalance(120);
        System.out.println("Balance" +accountObj1.getBalance());

        System.out.printf("Balance:%f",124.540000);

//Account accountObj2=new Account(-100);
//Account.displayAccount();

    }
}

// ÖDEV:

// student diye class oluştur

// bu öğrenciye ait 5 adet özellik ekle:

// ad 
// soyad
// bölümü
// cinsiyeti
// okul no'student