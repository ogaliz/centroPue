/**
 * Write a description of class Programa here.
 * 
 * @author (Oscar G) 
 * @version (1.0)
 */
public class Programa{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    
        Equilatero eq1 = new Equilatero(5,5,5);
        eq1.mostrar();
        Equilatero eq2 = new Equilatero(7,7,7);
        eq2.mostrar();
        
        
        int total= Equilatero.contador_eq();
        System.out.println("Total triangulos: " + total);
    }
}
