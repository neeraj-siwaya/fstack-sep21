public class AggregationTest {
    public static void main(String arr[]){

        Room r1 = new Room("Living", new Fan("Usha","Ceiling"));
        Room r2 = new Room("Study", new Fan("Crompton","Table"));
        System.out.println("Details of room one...");
        r1.display();
        System.out.println("Details of room two...");
        r2.display();
    }
}
