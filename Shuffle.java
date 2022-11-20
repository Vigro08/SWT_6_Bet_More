import java.util.concurrent.ThreadLocalRandom;

public class Shuffle {

    public static int pick_card() {
        //Source https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        int x = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        return x;
    }
}
