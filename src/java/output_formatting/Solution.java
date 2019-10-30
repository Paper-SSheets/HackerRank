package java.output_formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str1 = scan.next();
            int x = scan.nextInt();
            System.out.printf("%-14s %03d\n", str1, x);
        }
        scan.close();
        System.out.println("================================");
    }
}
