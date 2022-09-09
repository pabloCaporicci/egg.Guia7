/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje07;
import java.util.Locale;
import entidades.Persona;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(new Locale("en", "US"));
        Persona P1 = new Persona("ROQUE", 33, "H",88,1.78 );//Persona();
        Persona P2 = new Persona("CARLA", 17, "M",59,1.66 );//Persona();
        Persona P3 = new Persona("RENNE", 26, "8",70,1.70 );//Persona();
        Persona P4 = new Persona("INNES", 12, "M",43,1.58 );//Persona();
        int mayores = 0;
        int bajoPeso = 0;
        int altoPeso = 0;
        int pesoIdeal = 0;
        
        
        //P1.crearPersona();        
        System.out.println(P1);
        P1.calcularIMC();
        int IMC1 = P1.calcularIMC();
        boolean age1 = P1.mayorEdad();
        switch (IMC1){
            case 0:
                System.out.println("Su Peso es Ideal");
                pesoIdeal ++;
                break;
            case 1:
                System.out.println("Su Peso es Alto");
                altoPeso ++;
                break;
            case -1:
                System.out.println("Su Peso es Bajo");
                bajoPeso ++;
                break;
        }
        if (age1) {
            mayores ++;
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Menor de Edad");
        }
        
        System.out.println(P2);
        //P2.crearPersona();
        P2.calcularIMC();
        int IMC2 = P2.calcularIMC();
        boolean age2 = P2.mayorEdad();
        switch (IMC2){
            case 0:
                System.out.println("Su Peso es Ideal");
                pesoIdeal ++;
                break;
            case 1:
                System.out.println("Su Peso es Alto");
                altoPeso ++;
                break;
            case -1:
                System.out.println("Su Peso es Bajo");
                bajoPeso ++;
                break;
        }
        if (age2) {
            mayores ++;
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Menor de Edad");
        }
        
        System.out.println(P3);
        //P3.crearPersona();
        P3.calcularIMC();
        //System.out.println("Si la persona es mayor, se devolverá true, sino false: "+ P3.mayorEdad());
        int IMC3 = P3.calcularIMC();
        boolean age3 = P3.mayorEdad();
        switch (IMC3){
            case 0:
                System.out.println("Su Peso es Ideal");
                pesoIdeal ++;
                break;
            case 1:
                System.out.println("Su Peso es Alto");
                altoPeso ++;
                break;
            case -1:
                System.out.println("Su Peso es Bajo");
                bajoPeso ++;
                break;
        }
        if (age3) {
            mayores ++;
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Menor de Edad");
        }        
        
        System.out.println(P4);
        //P4.crearPersona();
        P4.calcularIMC();
        //System.out.println("Si la persona es mayor, se devolverá true, sino false: "+ P4.mayorEdad());
        int IMC4 = P4.calcularIMC();
        boolean age4 = P4.mayorEdad();
        switch (IMC4){
            case 0:
                System.out.println("Su Peso es Ideal");
                pesoIdeal ++;
                break;
            case 1:
                System.out.println("Su Peso es Alto");
                altoPeso ++;
                break;
            case -1:
                System.out.println("Su Peso es Bajo");
                bajoPeso ++;
                break;
        }
        if (age4) {
            mayores ++;
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Menor de Edad");
        }        
        
        System.out.println("El porcentaje de Mayores de Edad es: " +  (((float)mayores/4)*100) + "%");
        System.out.println("El porcentaje de con bajo peso es: " + (((float)bajoPeso/4)*100) + "%");
        System.out.println("El porcentaje de con alto peso es: " + (((float)altoPeso/4)*100) + "%");
        System.out.println("El porcentaje de con alto ideal es: " + (((float)pesoIdeal/4)*100) + "%");
    }
    
}
