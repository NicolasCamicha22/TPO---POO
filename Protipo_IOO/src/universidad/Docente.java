package universidad;

public class Docente {

    private String nombre;
    String apellido;
    int edad;
    int legajo_docente;

    public Docente(){}

    public Docente(String nombre){
        this.nombre = nombre;
    }

    public Docente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String dameElNombreDelDocente(){

        return this.nombre;
    }
    void imprimirDatos(String edad){
        System.out.println("nombre: "+ nombre  + "apellido: " + apellido);
    }

    int dameLaEdadDelDocente(){
        return edad;
    }

}
