
package Metodo;

public class Operacion {
    
    //ATRIBUTOS
    
    float suma, resta, multi, div;
    
    //METODOS
    
    public void suma(float num1, float num2){
        
        suma = num1 + num2;        
    }
    
    public void resta(float num1, float num2){
        
        resta = num1 - num2;        
    }
    
    public void multiplicar(float num1, float num2){
        
        multi = num1 * num2;        
    }
    
    public void dividir(float num1, float num2){
        
        div = num1 / num2;
        
    }
    
    public void mostrarDatos(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La muliplicacion es: " + multi);
        System.out.println("La division es: " + div);
    }
    
    
}

