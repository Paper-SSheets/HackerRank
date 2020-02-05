package java._1DArray.II;

import java.util.Scanner;

public class Solution {

    /**
     * A recursive method to determine whether a game with the given
     * conditions can be won.
     */
    public static boolean canWin(int leap, int[] game, int n, int i) {
        /*  By adding in the n, it prevents the need to calculate
            game.length, which, esp when dealing with recursion,
            is a big deal. I think. It's possible Java deals with
            this already and thus "remembers" for each call, but
            perhaps I'm just tryna be a C guy.  */

        // Base case for losing.
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // Base case for winning.
        if ((i == n - 1) || i + leap > n - 1) {
            return true;
        }

        // Shouldn't walk over the same index twice.
        // This stops infinite recursion loops.
        game[i] = 1;

        return canWin(leap, game, n, i - 1) // Move back 1 cell
                || canWin(leap, game, n, i + 1)     // Move forward 1 cell
                || canWin(leap, game, n, i + leap); // Move forward leap distance
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, n, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}

