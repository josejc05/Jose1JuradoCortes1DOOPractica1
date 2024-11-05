package uax.practica1.elementos;

public abstract class ElementoColeccionable {
    // Aquí guardo el país del elemento
    private String pais;
    // Aquí guardo la autoridad gobernante del elemento
    private String autoridadGobernante;
    // Aquí guardo el año del elemento
    private int annus;
    // Aquí guardo el valor del elemento
    private double valor;
    // Aquí guardo la unidad monetaria del elemento
    private String unidadMonetaria;
    // Aquí guardo la rareza del elemento
    private double rareza;
    // Aquí guardo el precio del elemento
    private double precio;

    // Constructor para inicializar todos los atributos
    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, double rareza, double precio) {
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }

    // Metodo para obtener el país
    public String getPais() {
        return pais;
    }

    // Metodo para establecer el país
    public void setPais(String pais) {
        this.pais = pais;
    }

    // Metodo para obtener la autoridad gobernante
    public String getAutoridadGobernante() {
        return autoridadGobernante;
    }

    // Metodo para establecer la autoridad gobernante
    public void setAutoridadGobernante(String autoridadGobernante) {
        this.autoridadGobernante = autoridadGobernante;
    }

    // Metodo para obtener el año
    public int getAnnus() {
        return annus;
    }

    // Metodo para establecer el año
    public void setAnnus(int annus) {
        this.annus = annus;
    }

    // Metodo para obtener el valor
    public double getValor() {
        return valor;
    }

    // Metodo para establecer el valor
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Metodo para obtener la unidad monetaria
    public String getUnidadMonetaria() {
        return unidadMonetaria;
    }

    // Metodo para establecer la unidad monetaria
    public void setUnidadMonetaria(String unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }

    // Metodo para obtener la rareza
    public double getRareza() {
        return rareza;
    }

    // Metodo para establecer la rareza
    public void setRareza(double rareza) {
        this.rareza = rareza;
    }

    // Metodo para obtener el precio
    public double getPrecio() {
        return precio;
    }

    // Metodo para establecer el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}