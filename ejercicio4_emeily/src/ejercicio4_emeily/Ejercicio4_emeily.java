package ejercicio4_emeily;
import java.util.Scanner;

public class Ejercicio4_emeily {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        float x= sc.nextFloat();
        
        x=((7*(3*x+2))-(5*((4*x-3))-1))/4;
        System.out.println("El valor de x es: " + x);
        
        
        
        
    }
    
}
