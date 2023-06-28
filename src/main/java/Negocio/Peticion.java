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
public class Peticion {

    private String nroPeticion;
    private String nroSucursal;
    private String paciente;
    private String obraSocial;
    private String fechaDeCarga;
    private String practicasAsociadas;
    private String fechaEstimadaEntrega;

    public Peticion(String nroPeticion, String nroSucursal, String paciente, String obraSocial, String fechaDeCarga, String practicasAsociadas, String fechaEstimadaEntrega) {
        this.nroPeticion = nroPeticion;
        this.nroSucursal = nroSucursal;
        this.paciente = paciente;
        this.obraSocial = obraSocial;
        this.fechaDeCarga = fechaDeCarga;
        this.practicasAsociadas = practicasAsociadas;
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    public String getNroPeticion() {
        return nroPeticion;
    }

    public void setNroPeticion(String nroPeticion) {
        this.nroPeticion = nroPeticion;
    }

    public String getNroSucursal() {
        return nroSucursal;
    }

    public void setNroSucursal(String nroSucursal) {
        this.nroSucursal = nroSucursal;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(String fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public String getPracticasAsociadas() {
        return practicasAsociadas;
    }

    public void setPracticasAsociadas(String practicasAsociadas) {
        this.practicasAsociadas = practicasAsociadas;
    }

    public String getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(String fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    public boolean sosLaPeticion(String nroPeticionABuscar) {
        if (nroPeticion.equalsIgnoreCase(nroPeticionABuscar)) {
            return true;
        } else {
            return false;
        }
    }

    public Vector<String> getVectorPaciente() {
        Vector<String> datos = new Vector<String>();

        datos.add(nroPeticion);
        datos.add(nroSucursal);
        datos.add(paciente + "");
        datos.add(obraSocial + "");
        datos.add(fechaDeCarga + "");
        datos.add(practicasAsociadas + "");
        datos.add(fechaEstimadaEntrega + "");

        return datos;
    }

    public PeticionView getView() {
        return (new PeticionView(nroPeticion,nroSucursal, paciente, obraSocial, fechaDeCarga, practicasAsociadas, fechaEstimadaEntrega));
    }

}
