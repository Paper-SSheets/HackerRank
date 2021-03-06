package java._1DArray.I;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i : a) {
            System.out.println(i);
        }
    }
}
