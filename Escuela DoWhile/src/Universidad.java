public class Universidad {
   //Atributos

    private String nombre;
    private String direccion;

    //Constructores

    public Universidad(){}

    //Getter y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Métodos Propios y de Cálculo

    public String detalleUniversidad(){
        String du = "\n" + "Universidad -> " + this.nombre + "\n" + "Direccion -> "
                + this.direccion +"\n";
        return du;
    }
}

