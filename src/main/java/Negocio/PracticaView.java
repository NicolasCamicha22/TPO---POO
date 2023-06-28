/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author nicol
 */
public class PracticaView {
     private String codigoPractica;
        private String nombrePractica;
        private String grupo;
        private String valorCritico;
        private String valorReservado;
        private String cantHoras;
        private String estado;
        

        public PracticaView(String codigoPractica, String nombrePractica, String grupo, String valorCritico, String valorReservado, String cantHoras, String estado) {
            this.codigoPractica = codigoPractica;
            this.nombrePractica = nombrePractica;
            this.grupo = grupo;
            this.valorCritico = valorCritico;
            this.valorReservado = valorReservado;
            this.cantHoras = cantHoras;
            this.estado = estado;
        }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getNombrePractica() {
        return nombrePractica;
    }

    public void setNombrePractica(String nombrePractica) {
        this.nombrePractica = nombrePractica;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getValorCritico() {
        return valorCritico;
    }

    public void setValorCritico(String valorCritico) {
        this.valorCritico = valorCritico;
    }

    public String getValorReservado() {
        return valorReservado;
    }

    public void setValorReservado(String valorReservado) {
        this.valorReservado = valorReservado;
    }

    public String getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(String cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
