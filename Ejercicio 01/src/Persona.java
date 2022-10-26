
public class Persona {

    //ATRIBUTOS
    
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro mascota;
    
    //Creación de los CONSTRUCTORES (vacio y por parámetro)

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

   

    //Creación de los GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }
    
    //Creación del OVERRIDE

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", documento: " + documento + ", mascota: " + mascota + '}';
    }

  
    
    
    
    
    
}
