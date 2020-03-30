import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println("0");
            return;
        }

        // Write your code here.
        String regex = "[!,?._'@ ]+";
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println("0");
            return;
        }

        s = s.replaceAll("^\\W+", "");
        String[] tokens = s.split(regex);

        System.out.println(tokens.length);
        for (String str : tokens) {
            System.out.println(str);
        }

        scan.close();
    }
}

