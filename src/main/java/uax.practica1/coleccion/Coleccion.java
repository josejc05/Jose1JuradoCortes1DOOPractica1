package uax.practica1.coleccion;

import uax.practica1.elementos.Moneda;
import uax.practica1.elementos.Sello;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    // Aquí guardo todas las monedas
    private List<Moneda> monedas;
    // Aquí guardo todos los sellos
    private List<Sello> sellos;

    // Constructor para inicializar las listas
    public Coleccion() {
        this.monedas = new ArrayList<>();
        this.sellos = new ArrayList<>();
    }

    // Metodo para añadir una moneda a la colección
    public void anadirMoneda(Moneda moneda) {
        monedas.add(moneda);
    }

    // Metodo para añadir un sello a la colección
    public void anadirSello(Sello sello) {
        sellos.add(sello);
    }

    // Metodo para mostrar todas las monedas
    public List<Moneda> mostrarMonedas() {
        return monedas;
    }

    // Metodo para mostrar todos los sellos
    public List<Sello> mostrarSellos() {
        return sellos;
    }

    // Metodo para obtener el precio total de la colección
    public double obtenerPrecioTotal() {
        double total = 0;
        // Sumo el precio de todas las monedas
        for (Moneda moneda : monedas) {
            total += moneda.getPrecio();
        }
        // Sumo el precio de todos los sellos
        for (Sello sello : sellos) {
            total += sello.getPrecio();
        }
        return total;
    }

    // Metodo para obtener la rareza media de la colección
    public double obtenerRarezaMedia() {
        double totalRareza = 0;
        int totalElementos = monedas.size() + sellos.size();
        // Sumo la rareza de todas las monedas
        for (Moneda moneda : monedas) {
            totalRareza += moneda.getRareza();
        }
        // Sumo la rareza de todos los sellos
        for (Sello sello : sellos) {
            totalRareza += sello.getRareza();
        }
        // Calculo la media de rareza
        return totalElementos > 0 ? totalRareza / totalElementos : 0;
    }
}