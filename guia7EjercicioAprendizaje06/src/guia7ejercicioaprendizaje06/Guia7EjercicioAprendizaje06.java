package guia7ejercicioaprendizaje06;

import entidades.Cafetera;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cafetera cafecito = new Cafetera();
       
      cafecito.setCapacidadMaxima(37);
      cafecito.llenarCafetera();
      System.out.println(cafecito.getCapacidadActual()); 
      cafecito.agregarCafe(33);
      cafecito.servirTaza(12);
      System.out.println(cafecito.getCapacidadActual());
    }
    
}
