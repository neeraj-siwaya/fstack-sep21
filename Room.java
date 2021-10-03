public class Room {
    
    private String name;
    private Fan fan;


    public Room(String n, Fan f){
        name=n;
        fan =f;
    }
    public void display(){
        System.out.println("It is a "+name+" room.");
        //System.out.print("It has a ");
        //fan.display();
        System.out.println("It has "+fan);
    }
}
