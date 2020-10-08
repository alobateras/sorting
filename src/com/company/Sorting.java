package com.company;

public abstract class Sorting {

    public static void bubble(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                if (array[j-1] > array[j]){
                    swap(array, j, j-1);
                }
            }
        }
    }
    public static void quickSort(int[] array){

    }



    private static void swap(int[] array, int a, int b){
        int intermedio = array[a];
        array[a] = array[b];
        array[b] = intermedio;

    }
}
