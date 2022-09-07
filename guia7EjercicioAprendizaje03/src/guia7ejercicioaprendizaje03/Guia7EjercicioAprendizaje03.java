/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje03;

import entidades.Operacion;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        
        op1.crearOperacion();
        
        System.out.println("La suma es  "+ op1.sumar());
        System.out.println("La resta es "+ op1.restar());
        if (op1.multiplicar()==0) {
            System.out.println("Ha ingresado valor 0,... No válido");
        }else{
            System.out.println("La multiplicacion es... "+ op1.multiplicar());
        }
        if (op1.dividir()==0) {
            System.out.println("Ha ingresado valor 0,... No válido");
        }else{
            System.out.println("La división es... "+ op1.dividir());
        }        
    }
    
}
