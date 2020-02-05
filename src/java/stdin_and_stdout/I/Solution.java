package java.stdin_and_stdout.I;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(),
                b = scan.nextInt(),
                c = scan.nextInt();
        scan.close();
        System.out.print(a + "\n" + b + "\n" + c);
    }
}
