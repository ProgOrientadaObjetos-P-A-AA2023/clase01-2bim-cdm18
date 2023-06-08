/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        System.out.println("-----------MATRICULACION EN LINEA------------");
        System.out.println("Ingrese 1 para crear un Estudiante a Distancia");
        System.out.println("Ingrese 2 para crear un Estudiante a Presencial");
        System.out.print("--> ");
        int opcion = entrada.nextInt();

        entrada.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("");

                System.out.println("Ingrese nombres");
                String nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                int edad = entrada.nextInt();
                System.out.println("Ingrese número de asignaturas");
                int asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura");
                double costoAsignatura = entrada.nextDouble();
                EstudianteDistancia estudianteD = new EstudianteDistancia();

                estudianteD.establecerNombresEstudiante(nombres);
                estudianteD.establecerApellidoEstudiante(apellidos);
                estudianteD.establecerEdadEstudiante(edad);
                estudianteD.establecerIdentificacionEstudiante(identificacion);
                estudianteD.establecerNumeroAsginaturas(asignaturas);
                estudianteD.establecerCostoAsignatura(costoAsignatura);
                estudianteD.calcularMatriculaDistancia();

                System.out.printf("%s\n", estudianteD);
                break;

            case 2:
                System.out.print("");

                System.out.println("Ingrese nombres");
                nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                edad = entrada.nextInt();
                System.out.println("Ingrese número de creditos de la carrera");
                int creditos = entrada.nextInt();
                System.out.println("Ingrese costo de los creditos de la carrera");
                double costoCreditos = entrada.nextDouble();
                EstudiantePresencial estudianteP = new EstudiantePresencial();

                estudianteP.establecerNombresEstudiante(nombres);
                estudianteP.establecerApellidoEstudiante(apellidos);
                estudianteP.establecerEdadEstudiante(edad);
                estudianteP.establecerIdentificacionEstudiante(identificacion);
                estudianteP.establecerNumeroCreditos(creditos);
                estudianteP.establecerCostoCredito(costoCreditos);
                estudianteP.calcularMatriculaPresencial();

                System.out.printf("%s\n", estudianteP);
                break;

            default:
                System.out.println("Por favor ingrese una opcion correcta");
                break;
        }
    }
}
