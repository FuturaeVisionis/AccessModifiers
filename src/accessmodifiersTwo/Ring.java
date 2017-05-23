package accessmodifiersTwo;

//import accessmodifiersOne.FirstClassGloves;

/**
 * Created by ronald on 24/12/16.
 */
public class Ring { //single inheritance

    public Ring() { // is a default constructor
        accessmodifiersOne.FirstClassGloves firstClassGloves = new accessmodifiersOne.FirstClassGloves();
        firstClassGloves.heavyweight = "Ronald";
        firstClassGloves.fighter();

    }


    public static void main(String[] args) {

        Ring ring = new Ring();
        ring.equals(ring);
/*
        FirstClassGloves gg = new FirstClassGloves();
        gg.heavyweight = "Ronald";
        gg.fighter();
    }
}
*/
    }
}