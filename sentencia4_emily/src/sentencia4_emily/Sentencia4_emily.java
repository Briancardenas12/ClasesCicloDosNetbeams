package sentencia4_emily;
import java.util.Scanner;
public class Sentencia4_emily {
    public static void main(String[] args) {
        Scanner articulos = new Scanner (System.in);
        System.out.println("Por favor ingrese el nombre del cliente: ");
        String nombre= articulos.nextLine();
        System.out.println("Por favor ingrese la cantidad de articulos: ");
        int cantidad= articulos.nextInt();
        
        if(cantidad >0 && cantidad <5){
            System.out.println("El cliente: "+ nombre+ "Compro: "+ cantidad+ " articulos y debe pagar en efectivo");   
            }
        else if(cantidad >=5 && cantidad <12){
                System.out.println("El cliente: " + nombre+ "compro : "+ cantidad+ " articulos y debe pagar en tarjeta");
                }
        else if(cantidad >11){
                System.out.println("El cliente: " + nombre+ "compro: "+ cantidad+ " articulos y debe pagar en cheque");
        }
        else{
            System.out.println("Ha digitado una cantidad invalida");
        }
    }         
        
}
    
