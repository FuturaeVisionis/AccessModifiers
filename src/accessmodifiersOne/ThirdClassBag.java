package accessmodifiersOne;

/**
 * Created by ronald on 24/09/16.
 */
public class ThirdClassBag extends FirstClassGloves implements Headgear { // multiple inheritance

    public void freekenbad() {

        heavyweight = "Mike Tyson";

        fighter();
    }

    @Override
    public void head_protection() {
        System.out.println("Always wear head protection when sparring.");
    }
}
