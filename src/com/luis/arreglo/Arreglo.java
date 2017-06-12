package com.luis.arreglo;

/**
 * Created by luisb on 5/06/2017.
 */
public class Arreglo {
    public static void main(String[] args){

        int[] arreglo = new int[5];//indices de  a 4
        arreglo[2]=10;
        System.out.println(arreglo[2]);

        double[][] numeritos = new double[3][3];//segunda dimension puede estar o no vacia
        numeritos[1][1] = 4;
        numeritos[1][2] = 4.2;
        System.out.println(numeritos[1][2]);

        char [][][] arreglo3d = new char[2][2][2];
        arreglo3d[0][0][0]= 'a';
        arreglo3d[0][1][0]= 'a';
        arreglo3d[0][0][1]= 'a';
        arreglo3d[1][0][0]= 'a';

    }
}
