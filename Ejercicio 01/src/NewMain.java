
/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
 * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Servicio s1 = new Servicio();

        int opcion;
  
            do{
      
            System.out.println("Bienvenido al centro de adopción de perritos");
            System.out.println("Para cargar una persona, presione 1");
            System.out.println("Para ver el listado de personas, presione 2");
            System.out.println("Para cargar un perrito, presione 3");
            System.out.println("Para ver el listado de perritos, presione 4");
            System.out.println("Par relizar el proceso de adopción, presione 5");
            System.out.println("Para salir, presione 6");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    s1.crearPersona();
                    break;
                case 2:
                    s1.listaPostulantes();
                    break;
                case 3:
                    s1.crearPerro();
                    break;
                case 4:
                    s1.listaPerritos();
                    break;
                case 5:
                    s1.procesoAdopcion();
                    break;
            }

        } while (opcion != 6);
        
    }

}
