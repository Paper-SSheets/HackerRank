package java._2DArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        // Now, create all the subarrays and put them 
        // in the  list of subarrays (powerSet).
        for (int i = 0; i < length + 1; i++) {
            for (int j = 0; j < length + 1; j++) {
                ArrayList<Integer> currSubarray = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    currSubarray.add(array[k]);
                }
                powerSet.add(currSubarray);
            }
        }

        int negativeSubarrays = 0;
        for (ArrayList<Integer> list : powerSet) {
            if (isNegativeArray(list)) {
                negativeSubarrays++;
            }
        }
        System.out.println(negativeSubarrays);
    }

    private static boolean isNegativeArray(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum < 0;
    }
}
