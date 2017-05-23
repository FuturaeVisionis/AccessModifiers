package accessmodifiersOne;

/**
 * Created by ronald on 24/09/16.
 */
public class BoxingMatch {

    public static void main(String[] args) {

        SecondClassRope rope = new SecondClassRope();
        rope.heavyweight = "Mayweather";
        rope.fighter();
        rope.Workout();

        ThirdClassBag bag = new ThirdClassBag();
        bag.freekenbad();
        bag.head_protection();
    }
}
