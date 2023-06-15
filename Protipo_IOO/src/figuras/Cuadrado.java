package figuras;

public class Cuadrado extends FiguraGeometrica{


    public Cuadrado(int valor, String nombre) {
        super(valor, nombre);
    }

    @Override
    public void calcularArea() {
        System.out.println(this.mostrameValor() + " Calcular Area Cuadro" );
    }

    public Cuadrado(){
        super();
    }

    public String value(){
        return null;
    }

}
