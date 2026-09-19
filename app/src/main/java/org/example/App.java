package org.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
      CountingCards countingCards = new CountingCards();

      Integer[] arr = {1, 2, 3, 4, 5};
      Integer[] arr2 = {1, 2, 3, 4, 5};
      Integer[] arr3 = {1, 2, 3, 4, 5};

      System.out.println(Arrays.toString(countingCards.shuffleSlow(arr)));
      System.out.println(Arrays.toString(countingCards.shuffleBetter(arr2)));
      System.out.println(Arrays.toString(countingCards.shuffleBest(arr3)));
    }
}
