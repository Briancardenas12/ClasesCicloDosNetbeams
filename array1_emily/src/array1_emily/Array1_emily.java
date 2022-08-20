package array1_emily;
public class Array1_emily {

    public static void main(String[] args) {
        String utiles[]={"Lapiceros", "Cuadernos", "Marcadores", "Colores"};
        double precios[]={2.5, 10.6, 3.7, 8.9};
        
        System.out.println("Listas de productos con sus precios: ");
        //Acá con el .length, no es necesario conocer cual es el final del array, ya que siempre va hasta el final
        for(int i=0; i<utiles.length; i++){
            System.out.println(utiles[i]+" = "+precios[i]);
        }
    }
    
}
