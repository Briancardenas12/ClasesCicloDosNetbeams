package ejercicio1_emily;

import java.util.Scanner;

public class Ejercicio1_emily {
    public static void main(String[] args) 
    {
        Scanner cs =new Scanner(System.in);
        float base;
        float altura;
        
        System.out.println("Ingrese el valor de la base: ");
        base= cs.nextFloat();
        System.out.println("Ingrese el valor de la altura: ");
        altura= cs.nextFloat();
        
        float area= ((base * altura)/2);
        
        System.out.println("El area del triangulo es: " + area);
    }
    
}
