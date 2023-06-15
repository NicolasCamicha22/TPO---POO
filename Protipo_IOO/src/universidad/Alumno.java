package universidad;

public class Alumno {

    String nombre;
    String apellido;
    int edad;
    int legajo_alumno;

    void imprimirDatos(String edad){
        System.out.println("nombre: "+ nombre  + "apellido: " + apellido);
    }

    int dameLaDelDocente(){
        return edad;
    }
}
