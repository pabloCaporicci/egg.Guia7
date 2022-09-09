/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package guia7ejercicioaprendizaje10;

import java.util.Arrays;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random();
            System.out.println("[ "+ arregloA[i]+" ]");
        }
        //Arrays.sort(arregloA);
        //burbuja... desde stackoverflow
        /*
        Puedes utilizar el método de ordenamiento de burbuja (Bubble sort). 
        Este método revisa y arregla el orden de cada elemento del arreglo
        comparándolo con el siguiente. El proceso se repite varias veces 
        hasta que se hayan verificado todos los elementos, 
        ya no sean necesarios más cambios y el arreglo se encuentre ordenado
        */
        int a[] = {5,3,2,7,10,1};
        for (int x = 0; x < 50; x++) {
            for (int i = 0; i < 50-x-1; i++) {
                if(arregloA[i] > arregloA[i+1]){
                    double tmp = arregloA[i+1];
                    arregloA[i+1] = arregloA[i];
                    arregloA[i] = tmp;
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            if (i<10) {
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.50;
            }
        }
        for (int i = 0; i < 50; i++) {
            if (i<20) {
                System.out.println("[ "+arregloA[i]+" ] -  ["+arregloB[i]+" ]");
            }else{
                System.out.println("[ "+arregloA[i]+" ]");
            }
        }
    }
    
}
