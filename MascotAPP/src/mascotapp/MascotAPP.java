/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author PABLO
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//        Mascota m1 = new Mascota();
//        m1.apodo = "Ambar";
//        m1.nombre = "Molacchino";
//        m1.tipo = "Perro";
//        m1.edad = 8;
//        m1.raza = "Cruza";
//        m1.cola = true;
//        m1.color = "Ambar";
        /*System.out.println("ingresa el nombre...");
        Mascota m1 = new Mascota("María Ines", "Ambar", "Perro");
        //System.out.println(m1.apodo + "  " + m1.nombre + "  "+ m1.tipo);
        m1.setNombre("Molacchino Maria Ines");
        System.out.println(m1.toString());
        m1.pasear(120);
        System.out.println(m1.toString()); */
        
        ServicioMascota sm = new ServicioMascota();
        Mascota m1 = sm.crearMascota();
        System.out.println(m1.toString());
         m1.pasear(120,2);        
        
    }
    
}
