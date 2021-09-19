public class X {
    private static int x;
    private int y;
    
    static {
        x = 5;
    }
    public X(int a){
        y=a;
    }
    public static void main(String arr[]){
        X one = new X(10);
        X two = new X(20);
    }
}
