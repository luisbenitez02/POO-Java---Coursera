package com.luis.exception;

/**
 * Created by luisb on 13/06/2017.
 */
public class Principal {
    //genero con psvm y tab
    public static void main(String[] args) {

        int[] numeros = {5,2,8};

        //souts genera el metodo print
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        //accesar a un indice no definido
        //para ello, como puede generar un error usamos try-catch
        try {
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hay un error! Te pasaste del total, ese indice no existe");
        } catch (Exception e){//una exception que no tenemos en la lista
            System.out.println("Algo paso, el problema es que no se que...");
            System.out.println("La siguiente linea ayudara a ver el error");
            e.printStackTrace();//solo para desarrolladores
        }  finally {
            System.out.println(":D saliii");
        }

    }
}
