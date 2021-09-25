public class AccountTest{

    public static void main(String arr[]){
        System.out.println("Creating some accounts...");
        Saving one = new Saving("Amit", 10000);
        Current two = new Current("XYZ Copr.", 1000000);
        RD three = new RD("Ravi", 25000);
        FD four = new FD("Sachin", 250000);
        System.out.println("Statement of account one...");
        one.display();
        System.out.println("Statement of account two...");
        two.display();
        System.out.println("Statement of account three...");
        three.display();
        System.out.println("Statement of account four...");
        four.display();

    }
}