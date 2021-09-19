
public class NewSwapperTest {
    public static void main(String arr[]) {
         //Creating two objects of Number class
         Number a = new Number(10);
         Number b = new Number(20);
         System.out.println("Initial values of a & b:");
         System.out.println("a = "+a.value);
         System.out.println("b = "+b.value);
         System.out.println("Swapping the values of a & b...");
         NewSwapper.swap(a, b);
         System.out.println("Values of a & b after swapping:");
         System.out.println("a = "+a.value);
         System.out.println("b = "+b.value);
    } 
 }
 