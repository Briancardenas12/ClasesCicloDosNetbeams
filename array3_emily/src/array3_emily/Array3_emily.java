package array3_emily;
import javax.swing.JOptionPane;
public class Array3_emily {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Digite el tamaño del arreglo: ");
        int numeros[]=new int[Integer.parseInt(texto)];
        rellenarAletorioArray(numeros, 0,9);
        mostrarArray(numeros);
        
        
    }
    
    public static void rellenarAletorioArray(int arreglo[], int a, int b){
        for(int i= 0; i<arreglo.length; i++){
            arreglo[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    
    public static void mostrarArray(int arreglo[]){
        
        for(int i=0; i<arreglo.length; i++){
            System.out.println("En el indice" + i+ " se encuentra el número: "+ arreglo[i]);
            
            
        }
        
        
    }
    
}

