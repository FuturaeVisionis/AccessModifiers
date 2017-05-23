package accessmodifiersOne;

/*
Try and change the access modifier of the Class to default. See what happens!
Now, you cannot change the class to private or protected, because it's a top level class!
A top level class is either public or default (nothing).
 */

/**
 * Created by ronald on 24/09/16.
 */
public class FirstClassGloves {

    public String heavyweight; // try and change the access modifier to private, or protected, or default.

    public void fighter() {
        System.out.println(heavyweight + " is the boxing champion of the world.");
    }
}

