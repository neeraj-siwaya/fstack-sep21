public class Fan{

    private String brand;
    private String type;

    public Fan(String b, String t){
        brand = b;
        type =t;
    }

    public String toString(){
        return type+" fan of "+brand;
    }
}