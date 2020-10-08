package com.company;

public class Calculadora {

    public Calculadora() {

    }

    public int producto(int a, int b) {
        return a * b;
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("ERROR. B = 0");
        }
        return a / b;
    }
//    Calculadora.Producto;
//
//    private class Producto{
//        int a = 2;
//        int b = 3;
//        int result = a*b;
//    }
//    private class Suma{
//        int a = 2;
//        int b = 3;
//        int result = a+b;
//    }
//    public void Resta{
//        int a = 2;
//        int b = 3;
//        int result = a-b;
//    }
//    private class Division{
//        int a = 2;
//        int b = 3;
//        int result = a/b;
//    }
}
