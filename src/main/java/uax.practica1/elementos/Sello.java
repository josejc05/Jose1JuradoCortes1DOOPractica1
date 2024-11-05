package uax.practica1.elementos;

import uax.practica1.enums.EstadoConservacionSello;

public class Sello extends ElementoColeccionable {
    // Aquí guardo la altura del sello
    private double altura;
    // Aquí guardo la anchura del sello
    private double anchura;
    // Aquí guardo la imagen del sello
    private String imagen;
    // Aquí guardo el estado de conservación del sello
    private EstadoConservacionSello estadoConservacion;

    // Constructor para inicializar todos los atributos del sello
    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, double rareza, double precio,
                 double altura, double anchura, String imagen, EstadoConservacionSello estadoConservacion) {
        // Llamo al constructor de la clase padre
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }

    // Metodo para obtener la altura del sello
    public double getAltura() {
        return altura;
    }

    // Metodo para obtener la anchura del sello
    public double getAnchura() {
        return anchura;
    }

    // Metodo para obtener la imagen del sello
    public String getImagen() {
        return imagen;
    }

    // Metodo para obtener el estado de conservación del sello
    public EstadoConservacionSello getEstadoConservacion() {
        return estadoConservacion;
    }
}