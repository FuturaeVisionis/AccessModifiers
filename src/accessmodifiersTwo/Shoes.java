package accessmodifiersTwo;

import accessmodifiersOne.FirstClassGloves;

/**
 * Created by ronald on 09/10/16.
 */
public class Shoes extends FirstClassGloves {

    public void runningShoes() {
        heavyweight = "Usain Bolt";
        fighter();

    }

    public static void main(String[] args) {
        Shoes nike = new Shoes();
        nike.runningShoes();

    }
}
