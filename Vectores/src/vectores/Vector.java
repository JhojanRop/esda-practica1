package vectores;

import java.util.Random;
import java.util.Scanner;

public class Vector {
    private int[] vector;
    static Random rnd = new Random();
    static Scanner readLine = new Scanner(System.in);
    
    public Vector(int n){
        this.vector = new int[n];
    }
    
    public int[] manualFill(){
        for (int i = 0; i < this.vector.length; i++){
            System.out.print("[" + i + "]: ");
            this.vector[i] = readLine.nextInt();
        }
        
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

    public float promedioParesEnPosicionesImpares(int [] vector) {
        int suma = 0;
        int contador =0;

        for (int i = 1; i < this.vector.length; i+=2) {
            if(vector[i] %2 == 0){
                suma += vector[i];
                contador++;
            }
        }
        
        if(contador > 0){
            return (float)suma/contador;
        } else{
            return 0;
        }
    }
}
