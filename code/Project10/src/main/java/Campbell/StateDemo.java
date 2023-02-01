
package Campbell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Project 10
 * State Pattern
 * cycle through states by pulling chain(pressing enter)
 */
public class StateDemo
{
    public static void main(String[] args) {
        System.out.println("State Pattern: Ceiling fan State Change");

        final int MAX_CNT = 8;  //number of cycles for test

        //instantiate fan class
        FanPullChain chain = new FanPullChain();
        for (int testCnt = 1; testCnt <= MAX_CNT; testCnt++)

        {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }

    }

    // output status on fan states
    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
