/**
 * EJEMPLO CON 3 ARRAY
 */
package Generic2;
//importacion para utilizar el generic
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author sroa
 */
public class Principal2 {
     public static void main(String[] args) {
         
         Integer[] intArray ={1,2,3,4,5};
         Double [] doubleArray= {1.1,2.2,3.3,4.4};
         Character[] charArray={'H','E','L','L','O'};
         
         show(intArray);
         show(doubleArray);
         show(charArray);
         //llamo a mi metodo de principal sin inicializarlo porque es estatico
     }
     
     /**
      * DEFINIR GENERIC A NIVEL METODO
     **/
    private static <T> void show(T[] inputArray){
        //iteracion del Array
        for(T elemento: inputArray){
            System.out.println("Elemento"+elemento);
            
        }
        
        
    
} 
}
