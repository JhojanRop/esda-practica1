package vectores;

public class Main {
    public static void main(String[] args) {
        Vector array = new Vector(5);
        
        int[] numbers = array.getVector();
        
        for (int num : numbers){
            System.out.println(num);
        }
    }
}
