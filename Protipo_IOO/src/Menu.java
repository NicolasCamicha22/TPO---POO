import figuras.Circulo;
import figuras.Cuadrado;
import figuras.FiguraGeometrica;

public class Menu {

    public static void main(String arg []){


        FiguraGeometrica cuadrado_1 = new Cuadrado(20,"Cuadrado");
        cuadrado_1.calcularArea();
        FiguraGeometrica circulo = new Circulo(30,"Circulo");
        circulo.calcularArea();
        FiguraGeometrica cuadrado_2 = new Cuadrado();
        cuadrado_2.calcularArea();

    }
}
