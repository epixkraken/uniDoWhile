public class Estudiante {
    //Atributos
    private String nombre;
    private int edad;
    private String carrera;

    //Constructor

    public Estudiante(){};

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    //Metodo

    public String detalleEstudiante(){
        String de = "Nombre: " + this.nombre + "\n" + "Edad: " + this.edad + "\n"
                + "Carrera: " + this.carrera + "\n";
        return de;
    }

}
