package model;

public class Auto extends Vehiculo {
    private short cantidadPuertas;
    
    public Auto(String patente, String color, String marca, String modelo, short anio, short cantidadPuertas) {
        super(patente, color, marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public short getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(short cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String tipoCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
