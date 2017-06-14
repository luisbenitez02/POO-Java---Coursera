package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 */
public class Smartphone extends Telefono implements IDevolucion{

    private String tipoSim;

    public Smartphone(int id, double precio, String marca, String modelo, String tipoSim) {
        super(id, precio, marca, modelo);
        this.tipoSim = tipoSim;
    }

    public String getTipoSim() {
        return tipoSim;
    }

    public void setTipoSim(String tipoSim) {
        tipoSim = tipoSim;
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion SmartPhone OK");
    }
}
