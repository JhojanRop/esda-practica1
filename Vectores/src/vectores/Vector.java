package vectores;

import java.util.Random;

public class Vector {
    Random rnd = new Random();
    
    public static int[] create(int n){
        return new int[n];
    }
    
    public static int[] manualFill(int[] vector){
        return vector;
    }
    
    public static int[] randomFill(int[] vector, int minRange, int maxRange){
        return vector;
    }
}
