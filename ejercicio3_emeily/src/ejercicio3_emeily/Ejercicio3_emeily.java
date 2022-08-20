package ejercicio3_emeily;

import java.util.Scanner;

public class Ejercicio3_emeily {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el sueldo: ");
        float sueldo= sc.nextFloat();
        
        System.out.print("Digite el primer gasto: ");
        float gasto1= sc.nextFloat();
        sueldo -=gasto1;
        System.out.println("Su nuevo saldo es: "+ sueldo);
        
        System.out.print("Digite el segundo gasto: ");
        float gasto2= sc.nextFloat();
        sueldo -=gasto2;
        System.out.println("Su nuevo saldo es: "+ sueldo);
        
        System.out.print("Digite el tercer gasto: ");
        float gasto3= sc.nextFloat();
        sueldo -=gasto3;
        System.out.println("Su saldo final es: "+ sueldo);
        
    }
    
}
