package Colegio;

public class Estudiante extends Persona {
    
    //ATRIBUTOS
    
    private int codigoEstudiante;
    private float notaFinal;
    
    //CONSTRUCTOR

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiate, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiate;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+ getNombre());
        System.out.println("El apellido es: "+ getApellido());
        System.out.println("La edad es: "+getEdad());
        System.out.println("El codio del estudiante es: "+ codigoEstudiante);
        System.out.println("La nota final es: "+ notaFinal);
        
    }
    
    
    
}
