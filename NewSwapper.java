public class NewSwapper{
    public static void swap(Number x, Number y){
        int z = x.value;
        x.value = y.value;
        y.value = z;
    }

}