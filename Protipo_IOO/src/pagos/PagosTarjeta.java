package pagos;

public class PagosTarjeta implements Pagos{

    private int numeroTarejta;

    public PagosTarjeta(int numerTarjeta){
        this.numeroTarejta=numerTarjeta;
    }

    @Override
    public void pagar() {
        System.out.println("Pagar con tarjeta y su numero es :" + this.numeroTarejta);
    }
}
