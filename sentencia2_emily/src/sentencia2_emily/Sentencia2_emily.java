package sentencia2_emily;

import java.util.Scanner;

public class Sentencia2_emily {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Por favor ingrese el mes del año en numero: ");
        var mes= sc.nextInt();
        var estaciones= "EStación no es disponible";
        
        switch (mes){
            case 1: 
            case 2:
            case 12:
                estaciones="Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estaciones="Prmavera";
                break;
            
            case 6:
            case 7:
            case 8:
                estaciones="Verano";
                break;
                
            case 9:
            case 10:
            case 11:
                estaciones="Otoño";
                break;
        }
        System.out.print("La estación del año es: " + estaciones);
        
    }
    
}
