public class Saving extends Account{

    public Saving(String name, double balance){
        super(name, balance);
    }
    
    public double getInterestRate(){
        return 3.5;
    }

}
