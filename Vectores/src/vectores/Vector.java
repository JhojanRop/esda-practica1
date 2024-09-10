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

    public int[] ascendinSort(int[] vector){
        int tempo;
        for (int i = 0; i < vector.length; i++) {
            for (int k = 0; k < vector.length - 1; k++) {
                if (vector[k] > vector[k + 1]) {
                    tempo = vector[k];
                    vector[k] = vector[k + 1];
                    vector[k + 1] = tempo;
                }
            }
        }
        
        return vector;
    }

    public int contarElementoMayorQuePromedio(int[] vector){
        double suma=0;
            for (int num : vector) {
                suma += num;
            }
            
        double promedio = suma/this.vector.length;
        int contador =0;
            for (int num : vector){
                if(num > promedio){
                    contador ++;
                }
            }
        return contador;
    }
    
    public int[] eliminarElemento(int[] vector, int elemento){
        int indice = -1;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == elemento){
                indice = i;
                break;
            }
        }

        if (indice == -1){
            System.out.println("El número [" + elemento + "] no está en el el vector");
            return vector;
        }

        int[] nuevoVector = new int[vector.length - 1];
        for (int i = 0, j = 0; i < vector.length; i++) {
            if (i != indice) {
                nuevoVector[j++] = vector[i];
            }
        }
            
        return nuevoVector;
    }
}
