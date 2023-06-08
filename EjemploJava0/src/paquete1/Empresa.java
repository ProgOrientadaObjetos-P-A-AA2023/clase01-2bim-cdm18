/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos; // tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;

    private double costoTotalBienes;
    private double costoTotalPagoPredio;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculo[] v) {
        vehiculos = v;
    }

    public void establecerCostosBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }

        costoBienesInmuebles = suma;
    }

    public void establecerCostosVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }

        costoVehiculos = suma;
    }

    public void establecerCostosTotalPagoPredio() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + edificios[i].obtenerCostoPredio();
        }

        costoTotalPagoPredio = suma;
    }

    public void establecerCostoTotalBienes() {
        costoTotalBienes = obtenerCostosVehiculos() + obtenerCostosBienesInmuebles();
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostosBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostosTotalPagoPredio() {
        return costoTotalPagoPredio;
    }

    public double obtenerCostosVehiculos() {
        return costoVehiculos;
    }

    public double obtenerCostosTotalBienes() {
        return costoTotalBienes;
    }

    @Override
    public String toString() {
        /*
        Empresa de Hojas
        Lista de Edificios
        1. EDIFICIO CENTRAL (20000)
        2. EDIFICIO NORTE (30000)
        3. EDIFICIO SUR (10000)
        4. EDIFICIO SECUNDARIO (5000)
        Total de inmuebles: 65000
        
        Lista de Vehiculos
        1. Auto, LBB0011 (10000)
        2. Camioneta, LCB0011 (20000)
        3. Auto, LBD0012 (6000)
        4. Camioneta, LCC0011 (10000)
        5. Camioneta, LDC0011 (25000)
        Total de inmuebles: 71000
        
        Total bienes: 136000
         */

        String reporte = String.format("%s\nLista de Edificio\n",
                obtenerNombre());
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s (%.2f) (%.2f)\n",
                    reporte,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto(),
                    edificios[i].obtenerCostoPredio());
        }

        reporte = String.format("%sTotal de inmuebles: %.2f\n",
                reporte,
                costoBienesInmuebles);

        reporte = String.format("%sTotal del pago del Predio: %.2f\n",
                reporte,
                costoTotalPagoPredio);
        reporte = String.format("%s\nLista de Vehiculos\n",
                reporte);

        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s , %s  (%.2f)\n",
                    reporte,
                    i + 1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }
        reporte = String.format("\n%sTotal Vehiculos: %.2f\n",
                reporte,
                obtenerCostosVehiculos());
        reporte = String.format("\n%sTotal Bienes: %.2f",
                reporte,
                obtenerCostosTotalBienes());
        return reporte;
    }
}
