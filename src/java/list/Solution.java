package java.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for(int i = 0; i < q * 2; i++) {
            String line = scanner.nextLine();
            if (line.contains("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if (line.contains("Delete")) {
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
        scanner.close();
        
        int i;
        for (i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print(list.get(i));
    }
}
