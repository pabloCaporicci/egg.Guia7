package guia7ejercicioaprendizaje08.servicios;

public class ServicioCadena {

    private final String contenidoCadena;

    public ServicioCadena(String contenidoCadena) {
        this.contenidoCadena = contenidoCadena;
    }
    
    
    public int mostrarVocales() {
        int contadorVocales = 0;
        for (int i = 0; i < contenidoCadena.length(); i++) {
            if (("a").equalsIgnoreCase(contenidoCadena.substring(i,i+1)) || ("e").equalsIgnoreCase(contenidoCadena.substring(i,i+1)) 
             || ("i").equalsIgnoreCase(contenidoCadena.substring(i,i+1)) || ("o").equalsIgnoreCase(contenidoCadena.substring(i,i+1))
             || ("u").equalsIgnoreCase(contenidoCadena.substring(i,i+1)) ) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }
    
    public void invertirFrase(){
        String fraseInvertida = "";
        for (int i = contenidoCadena.length(); i > 0; i--) {
            fraseInvertida = fraseInvertida.concat(contenidoCadena.substring(i-1,i));
        }
        System.out.println("Se ha invertido la frase.. entonces..");
        System.out.println(fraseInvertida);
    }
    
    public void vecesRepetido(String letra){
                int contadorLetra = 0;
        for (int i = 0; i < contenidoCadena.length(); i++) {
            if ((letra).equalsIgnoreCase(contenidoCadena.substring(i,i+1)) ) {
                contadorLetra++;
            }
        }
        System.out.println("la letra: "+letra+" aparece "+ contadorLetra +" veces.");
    }
    
    public void compararLongitud(String frase){
        System.out.println("la longido de la Clase Cadena es: "+ contenidoCadena.length()+", versus el contenido de la nueva frase que es de: " + frase.length());
    }
    
    public void unirFrases(String frase){
        frase = contenidoCadena + " " +frase ;
        System.out.println("la union de ambras frase resulta: "+ frase);
    }
    
    public void reemplazar(String letra) {
        String reemplazada = contenidoCadena.replace("a", letra);
        System.out.println(reemplazada);
    }
    
    public void contiene(String letra) {
        if (contenidoCadena.contains(letra)){
            System.out.println("VERDADERO");
        }else{
            System.out.println("FALSO");
        }
    }
  }

