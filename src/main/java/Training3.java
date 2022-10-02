import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Training3 {
    public static void main(String[] args) {

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Hobbies[] hobbiesList = Hobbies.values();
        int randomNumber = random.nextInt(1, hobbiesList.length)+1;
        System.out.println(randomNumber);
        String[] hobbies = new String[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            String hobby = hobbiesList[random.nextInt(hobbiesList.length)].toString();
            if (Arrays.asList(hobbies).contains(hobby)) {
                i--;
            } else {
                hobbies[i] = hobby;
            }
        }
        System.out.println(Arrays.toString(hobbies));
    }
}
