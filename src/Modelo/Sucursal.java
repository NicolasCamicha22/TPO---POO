package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int numero;
    private String direccion;
    private Usuario responsableTecnico;

    public Sucursal(int numero, String direccion, Usuario responsableTecnico) {
        this.numero = numero;
        this.direccion = direccion;
        this.responsableTecnico = responsableTecnico;
    }

    public int getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario getResponsableTecnico() {
        return responsableTecnico;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setResponsableTecnico(Usuario responsableTecnico) {
        this.responsableTecnico = responsableTecnico;
    }
}
