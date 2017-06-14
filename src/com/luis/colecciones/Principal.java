package com.luis.colecciones;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by luisb on 13/06/2017.
 */
public class Principal {

    public static void main(String[] args){

        ArrayList<String> androids_v = new ArrayList<String>();
        androids_v.add("Cupcake");//agrego elementos con add
        androids_v.add("Donut");
        androids_v.add("Eclair");
        androids_v.add("Froyo");
        androids_v.add("Gingerbread");
        androids_v.add("HoneyComb");
        androids_v.add("IceCremSadwitch");
        androids_v.add("Jelly Bean");
        androids_v.add("Kit Kat");
        androids_v.add("Lollipop");
        androids_v.add("Froyo");
        androids_v.add("Marshmallow");
        androids_v.add("Nougat");

        System.out.println(androids_v.size());
        System.out.println(androids_v);

        //para eliminar usamos remove()
        androids_v.remove(2);

        System.out.println(androids_v.size());
        System.out.println(androids_v);

        /*
        * Vamos a crear vectores
        * */
        Vector<String> androids_v2 = new Vector<String >();

        androids_v2.addElement("Cupcake");
        androids_v2.addElement("Donut");
        androids_v2.addElement("Eclair");
        androids_v2.addElement("Froyo");
        androids_v2.addElement("Gingerbread");
        androids_v2.addElement("HoneyComb");
        androids_v2.addElement("IceCremSadwitch");
        androids_v2.addElement("Jelly Bean");
        androids_v2.addElement("Kit Kat");
        androids_v2.addElement("Lollipop");
        androids_v2.addElement("Froyo");
        androids_v2.addElement("Marshmallow");
        androids_v2.addElement("Nougat");

        System.out.println("Tamaño de vector: " + androids_v2.size());
        System.out.println(androids_v2);

        //para eliminar usamos remove()
        androids_v2.remove(4);

        System.out.println("Tamaño de vector: " + androids_v2.size());
        System.out.println(androids_v2);

    }
}
