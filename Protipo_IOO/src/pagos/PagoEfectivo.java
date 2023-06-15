package pagos;

public class PagoEfectivo implements Pagos{

    public PagoEfectivo(){

    }
    @Override
    public void pagar() {
        System.out.println("Pagar Efecto!!!");
    }
}
