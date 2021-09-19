public class Cuboid extends Common{

    // additional attribute is defined
        int height;
    
        public Cuboid(int l, int b, int h){
            super(l,b); // Parent class constructor is inovked
            height = h;
        }
    //Additonal behaviour is defiend
    public void display(){
            super.display(); // Super class method is invoked.
            System.out.println("height: "+height);
        }
     public int volume(){
         return length * breadth * height;
     }   
    }