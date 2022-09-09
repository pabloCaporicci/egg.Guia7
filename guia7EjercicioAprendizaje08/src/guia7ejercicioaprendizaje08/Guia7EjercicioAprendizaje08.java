/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje08;

import guia7EjercicioAprendizaje08.entidades.Cadena;
import guia7ejercicioaprendizaje08.servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cadena frasePalabra = new Cadena();
     
        System.out.println("Favor Ingrese una palabra o frase...");
        //String fraseIngresada = leer.nextLine();
        String fraseIngresada = "la vida es bella";
        frasePalabra.setFrase(fraseIngresada);
        frasePalabra.setFraseLongitud(fraseIngresada.length());
     
        ServicioCadena sc = new ServicioCadena(frasePalabra.getFrase());
        System.out.println("la frase/palabra tiene " +sc.mostrarVocales() + " vocales");
        sc.invertirFrase();
        System.out.println("ingrese una letra.. se buscará las veces que esta dentro de la frase");
        String letra = "a" ;//leer.nextLine();
        sc.vecesRepetido(letra);
        System.out.println("comparemos la longitud versus una nueva frase, favor ingresar nueva frase");
        String nuevaFrase = "viva la vida"; //leer.nextLine();
        sc.compararLongitud(nuevaFrase);
        sc.unirFrases(nuevaFrase);
        System.out.println("reemplazaremos la letra a por el caracter que ingreses...");
        String reemplazo = "4";//leer.nextLine();
        sc.reemplazar(reemplazo);
        System.out.println("contaremos la aparción de la letra que ingreses...");
        String veces = "v";//leer.nextLine();
        sc.reemplazar(reemplazo);
        System.out.println("nostraremos VERDADERO O FALSO si el caracter que ingreses está dentro de Cadena");
        String estaNoEsta = "e";//leer.nextLine();
        sc.contiene(estaNoEsta);
        
        
    }
    
}
