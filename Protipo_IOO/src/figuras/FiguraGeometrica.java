package figuras;

public abstract class FiguraGeometrica {

    private int valor;
    private String nombre;

    public FiguraGeometrica(int valor,String nombre){
            this.valor = valor;
            this.nombre =nombre;
    }

    public FiguraGeometrica(){
        this.valor = 0;
        this.nombre =null;
    }

    /*
    public FiguraGeometrica(int valor,String nombre){
        this.valor = valor;
        this.nombre = nombre;
    }*/

    public String mostrameValor(){

        return "Mostrame valor: " + valor +" Nombre del clase : " + nombre;
    }

    public void modificarValor(int valorModicado){
        this.valor =valorModicado;
    }

    public abstract void calcularArea();


}
