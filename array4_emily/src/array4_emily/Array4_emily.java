package array4_emily;
public class Array4_emily {

    public static void main(String[] args) {
        
        int numeros[]= new int[100];
        
        int suma=0;
        double media;
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=numeros[i]+1;
            suma+= numeros[i];
        
        }
        System.out.println("La suma de lso valores de 1 a 100 es: " + suma);
        media=(double)suma/numeros.length;
        System.out.println("La media de los valores es: "+ media);
        
    }
    
}
