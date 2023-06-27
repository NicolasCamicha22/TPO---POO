/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Negocio.Paciente;
import Negocio.PacienteView;
import Negocio.Peticion;
import Negocio.PeticionView;
import Negocio.Practica;
import Negocio.PracticaView;
import Negocio.Sucursal;
import Negocio.SucursalView;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class SisLAB {

    private final ArrayList<Paciente> listaPacientes;
    private final ArrayList<Sucursal> listaSucursales;
    private final ArrayList<Peticion> listaPeticiones;
    private final ArrayList<Practica> listaPracticas;
    private static SisLAB instancia;

    private SisLAB() {
        super();
        this.listaPacientes = new ArrayList<Paciente>();
        this.listaSucursales = new ArrayList<Sucursal>();
        this.listaPeticiones = new ArrayList<Peticion>();
        this.listaPracticas = new ArrayList<Practica>();
        cargaInicial();
    }

    private void cargaInicial() { //datos hardcodeados
        darDeAltaPaciente("42323", "nicolas", "moron 777", "mailito@gmail.com", "masculino", 22);
        darDeAltaPaciente("33443284","Luciano Arias","Pedraza 2566","lucho@uade.com","M",35);
        darDeAltaPaciente("32456232","Marcelo Reynoso","Santa Fe 66","marcelo@yahoo.com","M",43);
        darDeAltaPaciente("16546789","Emilse Giovanetti","Brasil 1234","emilseo@gmail.com","F",74);
        darDeAltaPaciente("21654765","Josefina Constanzo","Maimaira 564","rollinga@uade.com","F",19);
        darDeAltaPaciente("23511334","Johan Veneco","Alberdi 56","Johan@veneco.vz","M",48);
  
        altaSucursal("2322", "callefalsa 123", "Carlos");
        altaPeticion("111", "Tomas", "11113", "4/05/2023", "4", "25/3/2022");
        altaPractica("22","Analisis de sangre","A","43","208",24,"sin problemas");
    }

    public static SisLAB getInstancia() {
        if (instancia == null) {
            instancia = new SisLAB();
        }
        return instancia;
    }

    // Metodos del negocio
    // ****************************************************** 
    // ******************************************************
    // Crear Paciente
    public void darDeAltaPaciente(String dni, String nombre, String domicilio, String mail, String sexo, int edad) {
        Paciente paciente = new Paciente(dni, nombre, domicilio, mail, sexo, edad);
        listaPacientes.add(paciente);
    }

    // Eliminar Paciente
    public void BorrarPaciente(String dni) {
        Paciente ExistePaciente = buscarPaciente(dni);
        if (ExistePaciente != null) {
            listaPacientes.remove(ExistePaciente);

        }

    }

    // Buscar Paciente
    public Paciente buscarPaciente(String dni) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            Paciente aux = listaPacientes.get(i);
            if (aux.sosElPaciente(dni)) {

                return aux;
            }
        }

        return null;
    }
    
    //Listar Pacientes
    public Paciente listarPacientes(){
        
        for(int i = 0; i < listaPacientes.size(); i++){
            Paciente  paciente = listaPacientes.get(i);
            System.out.println(paciente.getNombre());
        }
        return null;
    }
       

    public PacienteView buscarPacienteView(String dni) {
        Paciente paciente = buscarPaciente(dni);
        if (paciente != null) {
            return paciente.getView();
        }
        return null;
    }
    
    //Modificar Paciente

    public void ModificarPaciente(String dni, String nombre, String domicilio, String mail, String sexo, int edad) {

        Paciente ExistePaciente = buscarPaciente(dni);
        if (ExistePaciente != null) {
            ExistePaciente.setDni(dni);
            ExistePaciente.setNombre(nombre);
            ExistePaciente.setDomicilio(domicilio);
            ExistePaciente.setMail(mail);
            ExistePaciente.setSexo(sexo);
            ExistePaciente.setEdad(edad);
        }

    }

    //Sucursales
    //Crear sucursales
    public void altaSucursal(String nroSucursal, String direccion, String responsableTecnico) {
        Sucursal sucursal = new Sucursal(nroSucursal, direccion, responsableTecnico);
        listaSucursales.add(sucursal);
    }

    // Buscar sucursal
    public Sucursal buscarSucursal(String nroSucursal) {
        for (int i = 0; i < listaSucursales.size(); i++) {
            Sucursal aux = listaSucursales.get(i);
            if (aux.sosLaSucursal(nroSucursal)) {

                return aux;
            }
        }

        return null;
    }

    public SucursalView buscarSucursalView(String nroSucursal) {
        Sucursal sucursal = buscarSucursal(nroSucursal);
        if (sucursal != null) {
            return sucursal.getView();
        }
        return null;
    }

    // Eliminar Sucursal
    public void BorrarSucursal(String nroSucursal) {
        Sucursal ExisteSucursal = buscarSucursal(nroSucursal);
        if (ExisteSucursal != null) {
            listaSucursales.remove(ExisteSucursal);

        }

    }

    //Modificar Sucursal
    public void ModificarSucursal(String nroSucursal, String direccion, String responsableTecnico) {

        Sucursal ExisteSucursal = buscarSucursal(nroSucursal);
        if (ExisteSucursal != null) {
            ExisteSucursal.setNroSucursal(nroSucursal);
            ExisteSucursal.setDireccion(direccion);
            ExisteSucursal.setResponsableTecnico(responsableTecnico);

        }

    }

    // Peticiones
    // Alta de peticion
    public void altaPeticion(String nroPeticion, String paciente, String obraSocial, String fechaDeCarga, String practicasAsociadas, String fechaEstimadaEntrega) {
        Peticion peticion = new Peticion(nroPeticion, paciente, obraSocial, fechaDeCarga, practicasAsociadas, fechaEstimadaEntrega);
        listaPeticiones.add(peticion);
    }

    // Buscar peticion
    public Peticion buscarPeticion(String nroPeticion) {
        for (int i = 0; i < listaPeticiones.size(); i++) {
            Peticion aux = listaPeticiones.get(i);
            if (aux.sosLaPeticion(nroPeticion)) {

                return aux;
            }
        }

        return null;
    }
    
    public PeticionView buscarPeticionView(String nroPeticion) {
        Peticion peticion = buscarPeticion(nroPeticion);
        if (peticion != null) {
            return peticion.getView();
        }
        return null;
    }
    // Eliminar peticion
    
    public void BorrarPeticion(String nroPeticion) {
        Sucursal ExistePeticion = buscarSucursal(nroPeticion);
        if (ExistePeticion != null) {
            listaPeticiones.remove(ExistePeticion);

        }

    }
    
    // Practicas
    
    // Alta de practicas
    public void altaPractica(String codigoPractica, String nombrePractica, String grupo, String valorCritico, String valorReservado, int cantHoras, String estado) {
        Practica practica = new Practica( codigoPractica,  nombrePractica,  grupo,  valorCritico,  valorReservado,  cantHoras,  estado);
        listaPracticas.add(practica);
    }

    // Buscar practicas
    public Practica buscarPractica(String nroPractica) {
        for (int i = 0; i < listaPracticas.size(); i++) {
            Practica aux = listaPracticas.get(i);
            if (aux.sosLaPractica(nroPractica)) {

                return aux;
            }
        }

        return null;
    }
    
    public PracticaView buscarPracticaView(String nroPractica) {
        Practica practica = buscarPractica(nroPractica);
        if (practica != null) {
            return practica.getView();
        }
        return null;
    }
    // Eliminar practicas
    
    public void BorrarPractica(String nroPractica) {
        Practica ExistePractica = buscarPractica(nroPractica);
        if (ExistePractica != null) {
            listaPeticiones.remove(ExistePractica);

        }

    }
    

    
}
