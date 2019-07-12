package pattern.state;

import java.util.Scanner;

/**
 * @author leishifang
 * @date 2019-07-12 14:32
 */
public class Test {

    public static void main(String[] args) {
        Women women = new Women("Marie");
        while (true) {

            women.giveMoney(new Scanner(System.in).nextFloat());
            women.talk();
            women.play();
        }

    }
}
