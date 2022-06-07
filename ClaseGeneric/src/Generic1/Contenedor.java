//meter dentro del contenedor una bici, una moto y una motoneta
package Generic1;

/**
 //Generic T A NIVEL CLASE
 */
public class Contenedor<T> {
private T t;//atributo T
//PARAMETRO TIPO T
//constructores, setter y getters


 public Contenedor(T t){
     this.t=t;
        
    }
    public T getT() {
        return t;
    }

 

    public void setT(T t) {
        this.t = t;
    }
   
    //impirme E generic a nivel metodo
    public <E>void mostrarCertificado (E e){
        System.out.println(" "+t+":"+e);
    }
}
