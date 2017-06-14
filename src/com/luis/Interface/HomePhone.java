package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 */
public class HomePhone extends Telefono implements IDevolucion{

    private boolean alambrico;

    public HomePhone(int id, double precio, String marca, String modelo, boolean alambrico) {
        super(id, precio, marca, modelo);
        this.alambrico = alambrico;
    }

    public boolean isAlambrico() {
        return alambrico;
    }

    public void setAlambrico(boolean alambrico) {
        this.alambrico = alambrico;
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion Telefono OK");
    }
}
