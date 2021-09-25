public class Current extends Account{

    public Current(String name, double balance){
        super(name, balance);
    }
    
    public double getInterestRate(){
        return 1;
    }

}