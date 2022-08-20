package com.mycompany.calculadora.vista;

import com.mycompany.calculadora.controlador.CalculadoraController;
import com.mycompany.calculadora.controlador.Operacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraConsola implements CalculadoraVista {

    private CalculadoraController controller;
    private String numeroUno;
    private String numeroDos;
    private String resultado;

    private void menuPrincipal() {

        try ( var input = new BufferedReader(new InputStreamReader(System.in))) {
            var mainLoop = true;
            while (mainLoop) {

                System.out.println("CALCULADORA MANUAL");
                System.out.println("puede realizar las operaciones matematicas");
                System.out.println("Seleccione '+': Suma");
                System.out.println("Seleccione '-': Resta");
                System.out.println("Seleccione '*': Multiplicacion");
                System.out.println("Seleccione '/': Divisón");
                System.out.println("Seleccione '%': Modulo");
                System.out.println("Seleccione '.': Salir");
                System.out.println("Ingrese el simbolo de la operación que deseas realizar: ");

                var opcion = input.readLine();

                switch (opcion) {
                    case "+":
                        controller.setOperacion(Operacion.SUMA);
                        break;

                    case "-":
                        controller.setOperacion(Operacion.RESTA);
                        break;

                    case "*":
                        controller.setOperacion(Operacion.MULTIPLICACION);
                        break;

                    case "/":
                        controller.setOperacion(Operacion.DIVISION);
                        break;

                    case "%":
                        controller.setOperacion(Operacion.MODULO);
                        break;

                    case ".":
                        System.out.println("Hasta la vista baby");
                        mainLoop = false;
                        continue;

                    default:
                        System.err.println("La opcion" + opcion + "no es valida!!!");
                        System.out.println("Presione 'Enter' para continuar");
                        input.readLine();
                        continue;
                }

                System.out.println("Ingrese el primer numero: ");
                numeroUno = input.readLine();
                System.out.println("Ingrese el segundo numero: ");
                numeroDos = input.readLine();

                controller.actionPerformed(null);
                System.out.println("Presione 'Enter para continuar");
                input.readLine();

            }
        } catch (IOException ex) {

            System.err.println("Error en la aplicacion" + ex.getLocalizedMessage());
        }
    }

    @Override
    public String getNumeroUno() {
        return numeroUno;
    }

    @Override
    public String getNumeroDos() {
        return numeroDos;
    }
    
    @Override
    public void setResultado(String resultado){
        System.out.println("El resultado es: " + resultado);
    }
    
    @Override
    public void iniciar(CalculadoraController controller){
        this.controller= controller;
        menuPrincipal();
    }
    
    @Override
    public void mostrarException(Exception ex){
        System.err.println("Exception" + ex.getMessage());
    }

}
