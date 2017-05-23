package accessmodifiersTwo;

import accessmodifiersOne.Headgear;

/**
 * Created by ronald on 09/10/16.
 */
public class Shorts implements Headgear {
    @Override
    public void head_protection() {
        System.out.println("You can't find the boxing shorts in the headgear isle!");
    }

    public static void main(String[] args) {
        Shorts shorts = new Shorts();
        shorts.head_protection();
    }
}
