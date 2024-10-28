package model;

public abstract class Vehiculo {
    private String patente;
    private String color;
    private String marca;
    private String modelo;
    private short anio;

    public Vehiculo(String patente, String color, String marca, String modelo, short anio) {
        this.patente = patente;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract String tipoCombustible();
    
}
