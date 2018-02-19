/*
 * This program is designed to test the Gale-Sharpley algorithm via a stable
 * matching problem. This is accomplished using only arrays and linked lists.
 * The process is merely an adoption of the process mapped out in the textbook
 * "Algorithm Design" by Kleinberg and Tardos with minor modifications to fit my
 * style.
 *
 * Programmer: Teepu Khan
 * Date: September 10th, 2016
 * Course: CSC 401 @ CSUDH
 * Class: Stable_Match.java
 *
 */

import java.util.LinkedList;
import java.util.Random;

public class Stable_Match 
{
    static int n = 3; // Number of men (with an equal amount of women).
    static int[][] manPref = new int[n][n]; // Man's preference.
    static int[][] womanPref = new int[n][n]; // Woman's preference.
    static LinkedList<Integer> freeMan = new LinkedList<Integer>(); // Linked list for free men.
    static int[] next = new int[n]; // Keeps track of each man's next preference.  
    static int[] current = new int[n]; // Woman's current partner.
    static int count = 1; // Only used for displaying how many proposals have been made.
    
    // Fill in manPref with a number in each position to be randomized later.
    public static void createMan()
    {
        for (int i = 0; i < manPref.length; i++)
        {
            for (int j = 0; j < manPref[i].length; j++)
            {
                manPref[i][j] = j;
            }
        }
    }    
    
    // Fill in womanPref with a a number in each position to be randomized later.
    public static void createWoman()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                womanPref[i][j] = j;
            }
        }
    }
    
    // Shuffles the preference list so that we have a random preference order in
    // each run of the program.
    // Code modified from: http://www.programcreek.com/2012/02/java-method-to-shuffle-an-int-array-with-random-order/
    public static void shufflePref(int[][] array)
    {
        Random ranGen = new Random();

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array.length; j++)
            {
                int randomPosition = ranGen.nextInt(array.length);
                int temp = array[i][j];
                array[i][j] = array[i][randomPosition];
                array[i][randomPosition] = temp;
            }
        }
    }
    
    // Fill freeMan with an entry for each man, where each man is initially
    // free. Order doesn't matter since the random element of this program is 
    // wired into the preference list. As a result of this, men are merely 
    // listed in numeric order.
    public static void createFree()
    {
        for (int i = 0; i < n; i++)
        {
            freeMan.add(i);
        }
    }    
    
    // Prints all the elements of the array. Merely used as a reference tool
    // for accuracy checking.
    public static void printPref(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("...");
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(" " + array[i][j] + " ");
            }
        }
        System.out.println();
    }
    
    // The next proposal to be checked is initialized to their top preference.
    // 0 will be indicative of the first position of each man's preference
    // and thus the first woman that needs to be approached.
    public static void createNext()
    {
        for (int i = 0; i < next.length; i++)
        {
            next[i] = 0;
        }
    }
    
    // Initializes each woman's current partner to a null symbol.
    public static void createCurrent()
    {
        for (int i = 0; i < current.length; i++)
        {
            current[i] = -1; // Null symbol is -1.
        }
    }
    
    // Does multiple checks in order to see if there is a proposal that can be
    // made by whatever man we are working with.
    public static void propose()
    {
        // If there is at least one free man...
        if ((freeMan.isEmpty() == false))
        {
            int m = freeMan.remove(); // Current man we're working with.
            int w = manPref[m][next[m]]; // Current woman we're working with.
            next[m]++; // Advances to the next preferred woman.
            
            // If the current woman doesn't have a partner...
            if (current[w] == -1)
            {
                current[w] = m; // Set the current woman's partner to current man.
                System.out.println(count + ". Man " + m + " is now engaged to"
                        + " woman " + w + ".");
                count++;
            }
            else // If the current woman has a partner...
            {
                for (int i = 0; i < womanPref.length; i++)
                {
                    // If the i'th preference of current woman is the same as
                    // her current partner...
                    if (womanPref[w][i] == current[w])
                    {
                        freeMan.addFirst(m); // Put the current man back as free.
                        System.out.println(count + ". Man " + m + " rejected.");
                        count++;
                        break;
                    }
                    else if (womanPref[w][i] == m) // If the i'th preference of current woman is the same as the current man...
                    {
                        freeMan.addFirst(current[w]); // Put current woman's partner back as free.
                        current[w] = m; // Set current woman's partner as current man.
                        System.out.println(count + ". Man " + m + " is now engaged to" 
                                + " woman " + w + ".");
                        count++;
                        break;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {       
        createMan();        
        shufflePref(manPref);
        
        createWoman();        
        shufflePref(womanPref);
        
        createFree();        
        createNext();
        createCurrent();
        
        System.out.println("Men's preferences (In order: Man 0, Man 1, Man 2, etc):");
        printPref(manPref);
        System.out.println("Women's preferences (In order: Woman 0, Woman 1, Woman 2, etc):");
        printPref(womanPref);
        
        System.out.println();

        // Keep proposing until no men are free.
        while (freeMan.isEmpty() == false)
        {
            propose();
        }
        
        System.out.println("\nAll men and women are now engaged.");
    }    
}