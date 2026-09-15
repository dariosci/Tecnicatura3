package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in); //Para leer la información de la consola
        //se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudianteDAO(); //Esta instancia debe hacerse una vez
        while(!salir){
            try{
                mostrarMenu();
                salir = ejecutarOpciones(consola, estudianteDao); //Este será el metodo ejecutarOpciones que devolvera un booleano
            } catch (Exception e) {
                System.out.println("Ocurrió un error al ejecutar la operación: " + e.getMessage());
            }
        } //fin while
    } //Fin main

    private static void mostrarMenu(){
        System.out.println("""
                ** SISTEMA DE ESTUDIANTES **
                1- Listar Estudiantes
                2- Buscar Estudiante
                3- Agregar Estudiante
                4- Modificar Estudiante
                5- Eliminar Estudiante
                6- Salir
                Elige una opción: 
                """);
    }// fin metodo

    //Metodo para ejecutar las opciones, va a regresar un valor booleano, ya que es el que puede modificar el valor de la variable
    //salir, si es verdadero termina el ciclo while
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 -> { //Listar Estudiantes
                System.out.println("Listado de Estudiantes...");
                //no muestra la información, solo recupera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes(); //Recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println); //Funcion lambda para imprimir la lista
            } //fin caso 1
            case 2 -> { //Buscar Estudiante
                System.out.println("Ingrese el ID del Estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if(encontrado)
                    System.out.println("Estudiante encontrado: " + estudiante);
                else
                    System.out.println("No se encontró el estudiante: " + estudiante.getIdEstudiante());
            } //fin caso 2
            case 3 -> { //Agregar Estudiante
                System.out.println("Agregar Estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crear objeto estudiante (sin id)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if(agregado)
                    System.out.println("Estudiante agregado: " + estudiante);
                else
                    System.out.println("Estudiante NO agregado: " + estudiante);
            } //fin caso 3
            case 4 -> { // Modificar Estudiante
                System.out.println("Modificar Estudiante: ");
                System.out.println("ID Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crea el objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if(modificado)
                    System.out.println("Estudiante modificado: " + estudiante);
                else
                    System.out.println("Estudiante NO modificado: " + estudiante);
            } //fin caso 4
            case 5 -> { //Eliminar Estudiante
                System.out.println("Modificar Estudiante: ");
                System.out.println("ID Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.borrarEstudiante(estudiante);
                if(eliminado)
                    System.out.println("Estudiante eliminado: " + estudiante);
                else
                    System.out.println("Estudiante NO eliminado: " + estudiante);
            } //fin caso 5
            case 6 -> { //Salir
                System.out.println("Ha salido del Sistema. Hasta pronto!");
                salir = true;
            } //fin caso 6
            default -> System.out.println("Opcion no reconocida, intente nuevamente");
        }
        return salir;
    }
} //Fin clase