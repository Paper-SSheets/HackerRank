package java.loops.II;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int current = a;
            for (int j = 0; j < n; j++) {
                current += ((Math.pow(2, j) * b));
                if (j == n - 1) {
                    System.out.print(current);
                    continue;
                }
                System.out.print(current + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
