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
    
    public int[] obtenerMultiplosDeCuatro(int[]vector){
    int contador = 0;
    for (int num : vector){
        if (num % 4 == 0){
            contador ++;
        }
    }
    
    int[] multiplos = new int[contador];
        int indice = 0;

        for (int num : vector) {
            if (num % 4 == 0){
                multiplos[indice++] = num;
            }
        }
        
        return multiplos;
    }
}
