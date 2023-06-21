package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private List<Sucursal> sucursales;

    public Laboratorio() {
        sucursales = new ArrayList<>();
        // Agregar lógica para cargar las sucursales desde una fuente de datos (por ejemplo, base de datos)
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void modificarSucursal(Sucursal sucursal, String nuevaDireccion, Usuario nuevoResponsableTecnico) {
        sucursal.setDireccion(nuevaDireccion);
        sucursal.setResponsableTecnico(nuevoResponsableTecnico);
        // Puedes agregar lógica adicional aquí, como validar los datos modificados
    }
}