/**
 *
 * @author emilio.carranza
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        String texto1="Hola mundo";
        System.out.println(texto1);
        System.out.println("Las letras en la posicion impar son:  " +texto1.substring(0,1) +","+ texto1.substring(2,3) +","+ texto1.substring(4,5) +","+ texto1.substring(6,7) +","+ texto1.substring(8,9));
        System.out.println("Las letras en la posicion par son:  " + texto1.substring(1,2) +","+ texto1.substring(3,4) +","+ texto1.substring(5,6) +","+ texto1.substring(7,8) +","+ texto1.substring(9,10));
        
    }
    
    

}