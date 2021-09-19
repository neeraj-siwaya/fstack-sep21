class A {
    public A() {
        System.out.println("Object of A is created.");
    }
    static {
        System.out.println("A is loaded.");
    }
    
}

class B {
    static {
        System.out.println("B is loaded.");
    }
    public static void display() {
        System.out.println("display() of B is invoked.");
    }
}

class C {
    public static int value;
    static {
        System.out.println("C is loaded.");
        value =10;
    }
}
public class D {
    
    public static void main(String arr[]) {
        System.out.println("Invoking display() of B...");
        B.display();
        System.out.println("Creating object of A...");
        A x = new A();
        System.out.println("C.value is "+C.value);
        System.out.println("Creating another object of A...");
        A y = new A();
    }
    static {
        System.out.println("D is loaded.");
        
    }
}
