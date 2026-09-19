package org.example;

import java.util.Arrays;
import java.util.ArrayList;

public class CountingCards {
    public Integer[] shuffleSlow(Integer[] arr){

        Integer[] copy = new Integer[arr.length];
        int n = arr.length;
        int i;

        while(n > 0) {
            i = (int)(Math.random() * arr.length);
            
            if(arr[i] != null) {
                copy[arr.length - n] = arr[i];
                arr[i] = null;
                n--;
            }
        }
        return copy;
    }

    public Integer[] shuffleBetter(Integer[] arr){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Integer[] copy = new Integer[arr.length];
        int n = arr.length;

        while(n > 0) {
            int i = (int)(Math.random() * n--);
            copy[copy.length - 1 - n] = list.remove(i);
        }
        return copy;
    }

    public Integer[] shuffleBest(Integer[] arr){
        int m = arr.length;
        Integer t;
        int i;

        while(m > 0) {
            i = (int)(Math.random() * m--);

            t = arr[m];
            arr[m] = arr[i];
            arr[i] = t;
        }
        return arr;
    }
}
