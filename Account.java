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
}
