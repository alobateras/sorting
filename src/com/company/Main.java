package com.company;

import java.util.Arrays;

public class Main {
    /*
    hacer una clase que se llame calculadora, donde tenga un contructor publico i sin parametros
    y en esta clase no tiene atributos,se tiene que implementar los metodos, suma, resta, producto
    y división.

     1- crear la clase
     2- crear el constructor
     3- crear el objecto del constructor
     3- Implementar los metodos

     public class Calculadora

     public Calculadora
     */

    /*
        implementar lo mismo donde el constructor sea privador i sin parametros. La clase se llamara calculadora static

     */
    /*
        crear una interficie llamada calculadora interficie i la usa calculadora.
     */

    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr = {65, 25, 34, 2, 56};
//        ejercicioCalculadora();
        bubbleEjercicio(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void bubbleEjercicio(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                if (array[j-1] > array[j]){
                    swap(array, j, j-1);
                }
            }
        }
    }
    private static void swap(int[] array, int a, int b){
        int intermedio = array[a];
        array[a] = array[b];
        array[b] = intermedio;
    }
    private static void ejercicioCalculadora() {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(3, 3));
        System.out.println(calculadora.resta(2, 2));
    }
}

