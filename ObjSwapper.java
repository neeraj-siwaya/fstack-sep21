// To demonstrate the 3rd use of this keyword
public class ObjSwapper {
    int x, y;

    public ObjSwapper(int x, int y){
        this.x  = x;
        this.y = y;
    }
    public ObjSwapper swap(){
        int z =x;
        x = y;
        y = z;
        return this;
    }
    public ObjSwapper display() {
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        return this; // to facilitate method chaining
    }
    public static void main(String arr[]){
        /*
        ObjSwapper obj = new ObjSwapper(4,5);
        obj.display();
        obj.swap();
        obj.display();
        obj.display().swap().display(); // Method calls are chained
        */
        new ObjSwapper(10,20).display().swap().display(); //Constructor and method calls are chained.
        // Execution of above statement proves that constructor returns the invoking object ie.
        // implicit return type of each constructor is its class. In other words each 
        // constructor returns "this".
    }
}
