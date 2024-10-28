package model;

public class Moto extends Vehiculo {
    private String tipoCaballete; // Lateral o central

    public Moto(String tipoCaballete, String patente, String color, String marca, String modelo, short anio) {
        super(patente, color, marca, modelo, anio);
        this.tipoCaballete = tipoCaballete;
    }

    public String getTipoCaballete() {
        return tipoCaballete;
    }

    public void setTipoCaballete(String tipoCaballete) {
        this.tipoCaballete = tipoCaballete;
    }

    @Override
    public String tipoCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
