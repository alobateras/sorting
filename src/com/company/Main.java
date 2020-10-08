package com.company;

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

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(3, 3));
        System.out.println(calculadora.resta(2, 2));
    }
}

