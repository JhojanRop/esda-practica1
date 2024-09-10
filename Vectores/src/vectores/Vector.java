package vectores;

import java.util.Random;

public class Vector {
    private int[] vector;
    static Random rnd = new Random();
    
    public Vector(int n){
        this.vector = new int[n];
    }
    
    public int[] manualFill(int[] vector){
        return vector;
    }
    
    public int[] randomFill(int minRange, int maxRange){
        int vectorLenght = this.vector.length;
        for (int i=0; i < vectorLenght; i++) vector[i] = rnd.nextInt(minRange, maxRange);
        return vector;
    }
    
    public int[] getVector(){
        return this.vector;
    }
}
