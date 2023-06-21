package Controlador;

import Modelo.Laboratorio;
import Modelo.Usuario;
import Vista.SucursalFormView;

public class ControladorSucursal {
    private final SucursalFormView view;
    private final Laboratorio model;

    public ControladorSucursal(SucursalFormView view, Laboratorio model) {
        this.view = view;
        this.model = model;
    }

    public void modificarSucursal(String nuevaDireccion, String nuevoResponsable) {
        Usuario nuevoResponsableTecnico = new Usuario(nuevoResponsable, "", "", "", "", 0, null, "");
        model.modificarSucursal(view.getSucursalActual(), nuevaDireccion, nuevoResponsableTecnico);
        view.showSuccessMessage("Sucursal modificada correctamente.");
    }
    public static void main(String[] args) {
        Laboratorio model = new Laboratorio();
        SucursalFormView view;
    }
}
