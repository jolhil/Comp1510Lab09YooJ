/**
 * 
 */
package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Flips the coin and print the longest run of heads.
 * 
 * @author Junsang(Jason) Yoo
 * @version 2021
 */
public class CoinRunner {

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        Coin c;
        int count = 0;
        ArrayList<Integer> countData = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            c = new Coin();
            System.out.println(c);
            if (c.isHeads()) {
                count++;
            } else {
                countData.add(count);
                count = 0;
            }
        }
        countData.add(count);
        Collections.sort(countData);
        count = countData.get(countData.size() - 1);
        
        System.out.println("The longest run of heads is " + count);
    }

}
