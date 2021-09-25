public class FD extends Account{

    public FD(String name, double balance){
        super(name, balance);
    }
    
    public double getInterestRate(){
        return 7.25;
    }

}