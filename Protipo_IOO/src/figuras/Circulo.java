package figuras;

public class Circulo extends FiguraGeometrica{


    public Circulo(int valor, String nombre) {
        super(valor, nombre);
    }

    @Override
    public void calcularArea() {
        System.out.println(this.mostrameValor() + " Calcular Area Circulo" );
    }


}
