/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.*;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccion;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        empresa = DatoTrabajo.obtenerEmpresa();
        direccion = DatoTrabajo.obtenerDireccionEmpresa();
        
        System.out.println("-------------------------------------------------");
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Promedio: %.2f\n"
                + "Empresa: %s\n"
                + "Direccion de la Empresa: %s\n",
                nombre,
                apellidoRetornado,
                ciudad,
                promedio,
                empresa,
                direccion);
        System.out.println("-------------------------------------------------");
    }
    
}
