package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortBySelection {
    public static void selectionSort(final List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Collections.swap(list, i, minIndex);
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter how many numbers you want to sort");
            int count = in.nextInt();

            System.out.println("Enter the numbers you want to sort");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                list.add(in.nextInt());
            }

            selectionSort(list);

            System.out.println("Sorted entered are: ");
            for (int x : list) {
                System.out.print(x + " ");
            }
        }
    }
}