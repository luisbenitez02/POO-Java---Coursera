package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 *
 * Vamos a revisar los coneptos de herencia y polimorfismo
 */
public class Principal {

    public static void main(String[] args){

        //creo objetos de las clases playera, jeans y calcetines que son hijas de la clase Ropa

        Playera playera = new Playera(1,299.5,"M","Red","Slim");

        Jeans jean = new Jeans(2,399,"30","Azul claro","Amplio",'F');

        Calcetin calcetin = new Calcetin(3,10,"10-12","negro");

        PlayeraPersonalizada micamisa = new PlayeraPersonalizada(4,399.2,"L","Azul", "@pepito");

        Smartphone nokia6 = new Smartphone(6,299.99,"Nokia","N6","Nano");

        //creado el objeto vamos a usar sus metodos

        playera.mostrarDatos("Playera Roja");
        jean.mostrarDatos("Jeans Women");
        calcetin.mostrarDatos("Calcetin lindo");
        micamisa.mostrarDatos("Playera para pepito");


        playera.hacerDevolucion();
        jean.hacerDevolucion();
    }

}
