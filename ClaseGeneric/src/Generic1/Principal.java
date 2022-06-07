/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic1;

/**
 *
 * @author sroa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Contenedor<T>
        Contenedor <Bici> c1 = new Contenedor<>(new Bici("bici"));
        Contenedor <Moto> c2 = new Contenedor<>(new Moto("moto"));
        Contenedor<Motoneta> c3 = new Contenedor<>(new Motoneta("motoneta"));
        Contenedor<String> c4 = new Contenedor<>(new String("Java"));
      
        
        
        //c1 apunta a contenedor que tiene bici
        Bici bici = c1.getT();
        Motoneta m= c3.getT();
        System.out.println(""+bici.getNombre());
        System.out.println(""+m.getNombre());
        
        //probando el <E>
        System.out.println("GENERIC <E>");
          c2.mostrarCertificado(new Integer(5));
        
        
        
    }
    
}
