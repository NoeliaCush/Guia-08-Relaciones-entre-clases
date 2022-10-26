
import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    ArrayList<Perro> Perros = new ArrayList();
    ArrayList<Persona> Personas = new ArrayList();

    String ingresarPersona;
    String ingresarPerro;

    //Cargamos los datos de la persona que quiere adoptar
    public void crearPersona() {

        do {
            System.out.println("Por favor responda a las siguientes preguntas para rellenar el formulario de postulación de adopción:");
            System.out.println("¿Cuál es su nombre completo?");
            String nombre = leer.next();
            String apellido = leer.next();
            System.out.println("¿Cuántos años tiene?");
            int edad = leer.nextInt();
            System.out.println("¿Cuál es su número de documento?");
            int documento = leer.nextInt();

            Personas.add(new Persona(nombre, apellido, edad, documento));

            System.out.println("¿Desea ingresar otra persona? S/N");
            ingresarPersona = leer.next();

        } while (ingresarPersona.equalsIgnoreCase("S"));

    }

    //Mostrar la lista de personas que desean adoptar
    public void listaPostulantes() {
        for (Persona aux : Personas) {
            System.out.println(aux);
        }
    }

    //Cargamos los datos del perrito en tránsito para adoptar
    public void crearPerro() {

        do {
            System.out.println("Por favor completar los datos del perrito que se encuentra buscando un hogar");
            System.out.println("Nombre:");
            String nombre = leer.next();
            System.out.println("Raza:");
            String raza = leer.next();
            System.out.println("Edad:");
            int edad = leer.nextInt();
            System.out.println("Tamaño");
            String tamanio = leer.next();

            Perros.add(new Perro(nombre, raza, edad, tamanio));
            System.out.println("¿Desea ingresar otro perrito?");
            ingresarPerro = leer.next();
        } while (ingresarPerro.equalsIgnoreCase("S"));

    }

    //Mostrar la lista de perros para adoptar
    public void listaPerritos() {
        for (Perro aux : Perros) {
            System.out.println(aux);
        }
    }

    //Se le asigna a cada Persona un Perro -> Proceso de adopción
    public void procesoAdopcion() {
        System.out.println("Por favor, ingrese el nombre del postulante");
        String nombre = leer.next();
        String nombrePerrito;

        for (Persona aux : Personas) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¡La persona ha sido encontrada en la lista de postulantes! Por favor, indique el nombre del perrito que desea adoptar ");
                nombrePerrito = leer.next();
                for (Perro aux2 : Perros) {
                    if (aux2.getNombre().equalsIgnoreCase(nombrePerrito)) {
                        System.out.println("¡El nombre del perrito ha sido encontrado! *Se procede a realizar la adopción*");
                        aux.setMascota(aux2);
                    }
                }

            }
        }

    }
}

