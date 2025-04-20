//Author: Zane James
//Program: Chap7PP_ZaneJames
//Purpose: Locker open/close problem; students move through opening/closing lockers that are multiples of their place (#1 changes all, #2 changes all even, #3 changes every 3rd)
//Date: 04/18/2025

public class Chap7PP_James {
    public static void main(String[] args) {

        boolean[] lockers = new boolean[200];   //set up array of lockers
       
        //cycles through array, setting each equal divider to the opposite state 
        for (int student = 0; student < lockers.length; student++) {
            //cycles through with each number comparing to each locker
            for (int locker = 0; locker < lockers.length; locker++) {
                if (((locker + 1) % (student + 1)) == 0) {
                    lockers[locker] = !(lockers[locker]);
                }
            }
        }
        //cycles through and returns the locker number for true lockers
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i+1) + "  "); //i is +1 here again because the student number is +1 the index of the array
            }
        } 
    }
}
