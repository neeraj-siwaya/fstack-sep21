//To demonstrate the first use of this keyword

public class AB {
    private int a,b;

    public AB(int a, int b) {
        this.a=a;
        this.b=b;
    }
    /*
    public void display(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    */
    // Can we define display() as follows?
    public void display(){
        System.out.println("a="+this.a);
        System.out.println("b="+this.b);
    }
    public static void main(String arr[]){
        AB x = new AB(4,5);
        x.display();
    }
}
