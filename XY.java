// To demonstrate the second usecase of this keyword
public class XY {
    private int x, y;
    public XY(){
        this(2,3);
        System.out.println("In default constructor.");
       
    }
    public XY(int x){
        this(x,3);
        System.out.println("In one parameterized constructor.");
    }
    public XY(int x, int y){
        System.out.println("In two parameterized constructor.");
        this.x=x;
        this.y=y;
    }
    public void display() {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public static void main(String arr[]){
        XY a = new XY();
        a.display();
        XY b = new XY(10);
        b.display();
        XY c = new XY(20,30);
        c.display();
    }
}
