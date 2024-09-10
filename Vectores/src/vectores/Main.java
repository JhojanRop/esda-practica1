package vectores;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner readLine = new Scanner(System.in);
        int n;
        
        System.out.println("========================");
        System.out.println("  Práctica de vectores  ");
        System.out.println("========================\n");
        
        while(true){
            System.out.print("Ingrese el tamaño del vector: ");
            n = readLine.nextInt();
            if(n > 0) break;
            
            System.out.println("Ingrese un tamaño válido");
        }
        
        Vector vector = new Vector(n);
        int[] numeros;
        int[] numerosOrdenados;
        
        byte option;
        System.out.println("\n-----------------------------");
        System.out.println("¿Cómo desea llenar el vector?");
        System.out.println("  1. Manual");
        System.out.println("  2. Aleatorio");
        while(true){
            System.out.print("> "); option = readLine.nextByte();
            if(option == 1 || option == 2) break;
            System.out.println("Ingrese una opción válida");
        }
        
        System.out.println("-----------------------------");
        if(option == 1){
            vector.manualFill();
        }else{
            System.out.println("Establezca el rango:");
            System.out.print("Desde: "); int min = readLine.nextInt();
            System.out.print("Hasta: "); int max = readLine.nextInt();
            vector.randomFill(min, max);
        }
        
        
        numeros = vector.getVector();
        numerosOrdenados = vector.ascendinSort(numeros.clone());
        
        System.out.println("-----------------------------");
        System.out.println("Vector original | Vector ordenado");
        for(int i=0; i < numeros.length; i++){
            System.out.print("       ");
            System.out.print(numeros[i]);
            String espacio = (numeros[i] >= 10) ? "       |        " : "        |        ";
            System.out.print(espacio);
            System.out.print(numerosOrdenados[i]);
            System.out.println("");
        }
        
        int[] newSortedVector = null;
        
        while(true){
            System.out.println("\n-----------------------------");
            System.out.println("¿Qué desea hacer?");
            System.out.println("  1. Mostrar los números múltiplos de 4");
            System.out.println("  2. Mostrar el promedio de los elementos pares en posiciones impares");
            System.out.println("  3. Mostrar los números pares mayores al promedio");
            System.out.println("  4. Eliminar un número");
            System.out.println("  5. Ver vector ordenado");
            System.out.println("  6. Salir");
            byte menuOption;
            while(true){
                System.out.print("> "); menuOption = readLine.nextByte();
                if(option > 0 && option <= 6) break;
                System.out.println("Ingrese una acción válida");
            }
            if(menuOption == 6) break;

            System.out.println("-----------------------------");
            switch(menuOption){
                case 1 -> {
                    int[] fourMultiplies = vector.obtenerMultiplosDeCuatro(numerosOrdenados);
                    for (int multiplie : fourMultiplies) System.out.print(multiplie + " | ");
                }
                case 2 -> System.out.println(vector.promedioParesEnPosicionesImpares(numerosOrdenados));
                case 3 -> System.out.println(vector.contarElementoMayorQuePromedio(numerosOrdenados));
                case 4 -> {
                    System.out.print("Numero: "); int deleteN = readLine.nextInt();
                    System.out.println("-----------------------------");
                    System.out.println("Nuevo vector:");
                    if(newSortedVector == null){
                        newSortedVector = vector.eliminarElemento(numerosOrdenados, deleteN);
                        if(newSortedVector.length == numerosOrdenados.length) newSortedVector = null;
                    } else{
                        int[] tempVector = vector.eliminarElemento(numerosOrdenados, deleteN);
                        for (int i=0; i < newSortedVector.length; i++) newSortedVector[i] = tempVector[i]; 
                        if(tempVector.length == numerosOrdenados.length) newSortedVector = null;
                    }
                    
                    if(newSortedVector != null){
                        for (int num : newSortedVector) System.out.println(num);
                    }else{
                        for (int num : numerosOrdenados) System.out.println(num);
                    }
                }
                case 5 -> {
                    if(newSortedVector != null){
                        for (int num : newSortedVector) System.out.println(num);
                    }else{
                        for (int num : numerosOrdenados) System.out.println(num);
                    }
                }               
            }
        }
    }
}
