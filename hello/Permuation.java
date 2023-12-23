/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Permuation {
    public static void main(String[] args) {
        String testString = "A B C D E F G H I";
        String string = StdIn.readString();
        Integer k = Integer.parseInt(string);
        String[] stringList = testString.split(" ");
        for (int i = 0; i < k; i++) {
            System.out.println(stringList[StdRandom.uniformInt(0, stringList.length)]);
        }
    }
}
