package uax.practica1.elementos;

import uax.practica1.enums.EstadoConservacionMoneda;

public class Moneda extends ElementoColeccionable {
    // Aquí guardo la composición de la moneda
    private String composicion;
    // Aquí guardo el peso de la moneda
    private double peso;
    // Aquí guardo el diámetro de la moneda
    private double diametro;
    // Aquí guardo el grosor de la moneda
    private double grosor;
    // Aquí guardo el estado de conservación de la moneda
    private EstadoConservacionMoneda estadoConservacion;

    // Constructor para inicializar todos los atributos de la moneda
    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, double rareza, double precio,
                  String composicion, double peso, double diametro, double grosor, EstadoConservacionMoneda estadoConservacion) {
        // Llamo al constructor de la clase padre
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    // Metodo para obtener la composición de la moneda
    public String getComposicion() {
        return composicion;
    }

    // Metodo para obtener el peso de la moneda
    public double getPeso() {
        return peso;
    }

    // Metodo para obtener el diámetro de la moneda
    public double getDiametro() {
        return diametro;
    }

    // Metodo para obtener el grosor de la moneda
    public double getGrosor() {
        return grosor;
    }

    // Metodo para obtener el estado de conservación de la moneda
    public EstadoConservacionMoneda getEstadoConservacion() {
        return estadoConservacion;
    }
}