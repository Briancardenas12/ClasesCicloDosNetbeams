package ciclos2_emily;
public class Ciclos2_emily {
    public static void main(String[] args) {
        int contador=0;
        for(int i=0; i<=10000; i+=20){
            if (i%20==0){
                contador++;
            }
            
        }
     System.out.println("La cantidad de multiplos de 20 son: "+ contador);
    }
}
