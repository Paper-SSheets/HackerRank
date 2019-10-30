package java.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int subListLength = 0;
        for (int i = 0; i < length; i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            subListLength = scanner.nextInt();
            for (int j = 0; j < subListLength; j++) {
                subList.add(scanner.nextInt());
            }
            list.add(subList);
        }

        int numQueries = scanner.nextInt();
        for (int i = 0; i < numQueries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ArrayList<Integer> thisList = new ArrayList<>();

            try {
                 thisList = list.get(x - 1);
                 int query = thisList.get(y - 1);
                 System.out.println(query);
            } catch(IndexOutOfBoundsException exception) {
                System.out.println("ERROR!"); continue;
            }
        }
        scanner.close();
    }
}
