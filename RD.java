public class RD extends Account{

    public RD(String name, double balance){
        super(name, balance);
    }
    
    public double getInterestRate(){
        return 5;
    }

}