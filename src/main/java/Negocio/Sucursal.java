/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.Vector;

/**
 *
 * @author nicol
 */
public class Sucursal {

    private String nroSucursal;
    private String direccion;
    private String responsableTecnico;

    public Sucursal(String nroSucursal, String direccion, String responsableTecnico) {
        this.nroSucursal = nroSucursal;
        this.direccion = direccion;
        this.responsableTecnico = responsableTecnico;
    }

    public String getNroSucursal() {
        return nroSucursal;
    }

    public void setNroSucursal(String nroSucursal) {
        this.nroSucursal = nroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getResponsableTecnico() {
        return responsableTecnico;
    }

    public void setResponsableTecnico(String responsableTecnico) {
        this.responsableTecnico = responsableTecnico;
    }

    public boolean sosLaSucursal(String sucursalABuscar) {
        if (nroSucursal.equalsIgnoreCase(sucursalABuscar)) {
            return true;
        } else {
            return false;
        }
    }

    public Vector<String> getVectorPaciente() {
        Vector<String> datos = new Vector<String>();

        datos.add(nroSucursal);
        datos.add(direccion + "");
        datos.add(responsableTecnico + "");

        return datos;
    }
    
     public SucursalView getView() {
        return (new SucursalView(nroSucursal, direccion, responsableTecnico));
    }
}
