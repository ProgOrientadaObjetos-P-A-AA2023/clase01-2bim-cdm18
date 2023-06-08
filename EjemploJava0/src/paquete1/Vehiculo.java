package paquete1;

public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String t, String m, double v) {
        tipo = t;
        matricula = m;
        valor = v;
    }

    public void establecerTipo(String T) {
        tipo = T;
    }

    public void establecerMatricula(String m) {
        matricula = m;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }
}