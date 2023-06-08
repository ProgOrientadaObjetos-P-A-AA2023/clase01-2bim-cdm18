/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Edificio {

    private String nombre;
    private double costo;
    private double costo_predio;

    public Edificio(String m) {
        nombre = m;
    }

    public void establecerCosto_predio() {
        costo_predio = costo * 0.002;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerCostos(double m) {
        costo = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCosto() {
        return costo;
    }

    public double obtenerCostoPredio() {
        return costo_predio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Edificio de nombre %s\n"
                + "\tEl costo del edificio es: %.2f",
                nombre,
                obtenerCosto());
        return cadena;
    }
}