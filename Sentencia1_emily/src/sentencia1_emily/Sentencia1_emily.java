package sentencia1_emily;
import java.util.Scanner;
public class Sentencia1_emily {

    public static void main(String[] args) {
        Scanner estacion= new Scanner (System.in);
        var mes= estacion.nextInt();
        var estaciones= "Estación no es disponible";
        
        
        if(mes==12||mes==1||mes==2)
        {
            estaciones="Invierno";    
        }
        else if(mes==3 ||mes==4 || mes==5){
            estaciones="Primavera";
        }
        else if(mes==6 ||mes==7 || mes==8){
            estaciones="Verano";
        }
        else if(mes==9 ||mes==10 || mes==11){
            estaciones="Otoño";
        }      
        System.out.println("La estación del año es: " + estaciones);
    
}
}
