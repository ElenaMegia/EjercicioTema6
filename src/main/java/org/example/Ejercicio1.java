package org.example;

public class Ejercicio1 {

    //Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos.
    public static double mayor(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    //Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva:
    //
    //0 si los dos valores son iguales;
    //
    //1 si el primer valor es el mayor;
    //
    //el texto -1 en caso contrario.
    public static String mayor2(double a, double b){
        if(a > b){
            return "1";
        }else if(a == b){
            return "0";
        }else{
            return "-1";
        }
    }

    //Escribir un algoritmo principal que llame a estas dos funciones.
    public void Ejercicio1metodo() {
        System.out.println("El mayor es: " + mayor(5, 10));
        System.out.println("El mayor es: " + mayor2(5, 10));
    }
}
