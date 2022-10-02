import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Training {
    public static void main(String[] args) {

        ThreadLocalRandom random = ThreadLocalRandom.current();
        String[] hobbiesList = {"Sports", "Reading", "Music"};
        int randomNumber = random.nextInt(1, hobbiesList.length)+1;
        System.out.println(randomNumber);
        String[] hobbies = new String[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            String hobby = hobbiesList[random.nextInt(hobbiesList.length)];
            if (Arrays.asList(hobbies).contains(hobby)) {
                i--;
            } else {
                hobbies[i] = hobby;
            }
        }
        System.out.println(Arrays.toString(hobbies));
    }
}
