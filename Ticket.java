
public class Ticket {
    
    // Instance member
    private int number, value;
    // class member
    private static int counter, total;

    // class initizer
    static {
            counter = 0;
            total = 0;
    }
    //Object initializer
    public Ticket(int amount){
        value = amount;
        counter++;
        total = total + value;
        number = counter;
        System.out.println("Ticket "+number+" of Rs. "+value+" is sold.");
    }
    // Object Behaviour
    public void display()
    {
        System.out.println("It is ticket number "+ number +" of Rs. "+value);
    }
    // class Behaviour
    public static void summary() {
        System.out.println(counter+" tickets of Rs. "+total + " are sold.");
    }
    public static void main(String arr[]) {
        System.out.println("Selling some tickets...");
        Ticket t1 = new Ticket(100);
        Ticket t2 = new Ticket(200);
        System.out.println("Details of tickets...");
        t1.display();
        t2.display();
        System.out.println("Summary of tickets...");
        Ticket.summary();
    }
}
