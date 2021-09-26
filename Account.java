abstract class Account{

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name=name;
        this.balance=balance;
    }
    // To make sure that each account has interest rate
    public abstract double getInterestRate();

    // To generate statement of all accounts in a standard format
    public final void display(){
        System.out.println("AccountName: "+name);
        System.out.println("Account Type: "+this.getClass().getName()); // Feature of parent
        System.out.println("Balance: "+balance);
        System.out.println("Interest Rate: "+this.getInterestRate()); // Feature of children
    }

    // To credit interest to all accounts
    public static void creditInterest(Account account){
        double ir = account.getInterestRate(); // dynamic binding
        double qir = ir/4; // quarterly interest rate is calculated.
        double amount = (account.balance * qir )/ 100;
        account.balance += amount;
    }
   
}
