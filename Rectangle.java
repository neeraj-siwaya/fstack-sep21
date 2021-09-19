public class Rectangle extends Common{

    public Rectangle(int l, int b){
        super(l,b); // Parent class constructor is inovked
    }
    //Additonal behaviour is defiend
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2*(length * breadth);
    }
}