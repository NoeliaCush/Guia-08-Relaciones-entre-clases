public class Perro {

    //ATRIBUTOS
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    
    //Cración de los CONSTRUCTORES (vacio y por parámetro)

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    //Creación de los GETTER & SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    //Creación del OVERRIDE

    @Override
    public String toString() {
        return "Perro{" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamanio: " + tamanio + '}';
    }

}
