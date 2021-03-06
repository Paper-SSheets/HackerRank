package java.map;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.print(s + "=" + map.get(s));
            } else {
                System.out.print("Not found");
            }
            if (in.hasNext()) {
                System.out.println();
            }
        }
        in.close();
    }
}



