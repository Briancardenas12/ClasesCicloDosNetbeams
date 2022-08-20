
package Metodo;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        float numero1= Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero 1: "));
        float numero2= Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero 2: "));
        
        Operacion operacion1= new Operacion();
        
        operacion1.suma(numero1, numero2);
        operacion1.resta(numero1, numero2);
        operacion1.multiplicar(numero1, numero2);
        operacion1.dividir(numero1, numero2);
        
        operacion1.mostrarDatos();
    }
    
}
