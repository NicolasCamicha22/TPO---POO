package pagos;

public class Menu {

    public static  void main(String [] args){

        Pagos pagosTarjeta = new PagosTarjeta(123123);
        Pagos pagosEfectivo = new PagoEfectivo();
        pagosTarjeta.pagar();
        pagosEfectivo.pagar();

    }
}
