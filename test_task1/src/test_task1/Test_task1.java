package test_task1;

import java.util.*;

public class Test_task1 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if (leap > game.length) {
            return true;
        }

        int i=0;
        
        while(i < game.length-1) {
            if(game[i+1]==1){    
                if((i+leap)>=game.length) {
                    return true;
                }
                if(game[i+leap]==1) {
                    return false;
                }
                i+=leap;
            }
             i++;
        }
 
        return true;
        
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

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}