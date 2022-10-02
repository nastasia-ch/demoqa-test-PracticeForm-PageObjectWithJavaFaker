import java.util.Random;

public class Training2 {
    public static void main(String[] args) {

        Random random = new Random();
        Hobbies[] hobbies = Hobbies.values();
        int number = random.nextInt(hobbies.length);
        System.out.println(hobbies[number]);
        String hobby = hobbies[number].toString();
        System.out.println(hobby);
    }
}
