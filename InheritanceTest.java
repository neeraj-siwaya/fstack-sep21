
public class InheritanceTest{
    public static void main(String arr[]){
        System.out.println("Creating Rectangle object r...");
        Rectangle r = new Rectangle(4,5);
         System.out.println("Creating Cuboid object c...");
        Cuboid c = new Cuboid(10, 20, 30);
        System.out.println("Dimension of Rectangle");
        r.display();
         System.out.println("Dimension of Cuboid");
        c.display();
        System.out.println("Area of Rectangle is: "+r.area());
        System.out.println("Volume of Cuboid is: "+c.volume());
    }
} 