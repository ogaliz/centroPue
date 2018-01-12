
/**
 * Esto es un primer proyecto con BlueJ.
 * 
 * @author (Oscar G) 
 * @version (1.0)
 */
public class Equilatero{
    // instance variables - replace the example below with your own
    private int longitud_lado;
    //atributo de clase para llevar la cuenta de los triangulos creados.
    private static int total_equilater;
    /**
     * Constructor for objects of class Equilatero
     */
    public Equilatero(int l1, int l2, int l3){
        // initialise instance variables
        if (l1==l2 && l1==l3){
            this.longitud_lado=l1; 
            total_equilater++;
            System.out.println("Creado un equilatero");
        }else{
            throw new RuntimeException("ERROR: los tres lados deben ser iguales"); 
        }
    }
    //debe ser static puesto que no es responsabilidad de un triangulo en concreto, sino de la clase en general.
    public static int contador_eq(){
        return total_equilater;
    }
    
    public void mostrar(){
        // put your code here
        System.out.println("El equilatero tiene como valor de lados: "+this.longitud_lado);
    }
}
