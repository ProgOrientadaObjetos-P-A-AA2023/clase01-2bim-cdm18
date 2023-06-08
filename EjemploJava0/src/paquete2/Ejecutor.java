/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);

        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);

        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);

        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0011", 20000);

        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);

        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 10000);

        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 25000);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        // double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);

        edf1.establecerCosto_predio();
        edf2.establecerCosto_predio();
        edf3.establecerCosto_predio();
        edf4.establecerCosto_predio();

        Vehiculo[] listaVehiculo = {v1, v2, v3, v4, v5};
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerVehiculos(listaVehiculo);
        miempresa.establecerCostosVehiculos();
        miempresa.establecerCostosTotalPagoPredio();

        miempresa.establecerCostosBienesInmuebles();
        miempresa.establecerCostoTotalBienes();

        // Imprimir el costo de los bienes inmuebles de la empresa  
        // System.out.printf("%.2f\n", miempresa.obtenerCostosBienesInmuebles());
        System.out.printf("%s\n", miempresa);
    }
}