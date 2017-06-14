package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 */
public class PlayeraPersonalizada extends Ropa {

    private String custom_text;

    public PlayeraPersonalizada(int id, double precio, String talla, String color, String custom_text) {
        super(id, precio, talla, color);
        this.custom_text = custom_text;
    }

    public String getCustom_text() {
        return custom_text;
    }

    public void setCustom_text(String custom_text) {
        this.custom_text = custom_text;
    }
}
