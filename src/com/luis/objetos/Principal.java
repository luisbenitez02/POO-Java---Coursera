package com.luis.objetos;

/**
 * Created by luisb on 5/06/2017.
 */
public class Principal {

    public static void main(String[] args){
        Telefono miTelefono = new Telefono();
        miTelefono.mostrarDatos();

        Telefono miPhone = new Telefono(8,"Lenovo",50000);
        //miPhone.marca= "Alcaltel";// puedo cambiarlo, es un riesgo de seguridad
        System.out.println("-------------------------Con get:" + miPhone.getPrecio());
        miPhone.mostrarDatos();

        miPhone.setPrecio(-260000);//cambiamos precio
        miPhone.mostrarDatos();
    }
}
