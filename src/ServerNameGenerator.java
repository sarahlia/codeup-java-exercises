import java.util.Random;

public class ServerNameGenerator {

    String[] adjectives = {"lazy", "sleepy", "grouchy", "handsome", "beautiful", "stinky", "happy", "sad", "shy", "arrogant"};
    String[] nouns = {"lion", "tiger", "bear", "pig", "sister", "brother", "mother", "father", "teacher", "student"};

    //Douglas' way (see his lecture)
//    public static String getWord(String choices) {
//    Random random = new Random();
//    int randomNumber = random.nextInt(choices.length);
//    return choices[randomNumber];
//    }


    public String getRandomElement() {
        Random random = new Random();

        int indexAdj = random.nextInt(adjectives.length);
        int indexNoun = random.nextInt(nouns.length);
        return adjectives[indexAdj] + "-" + nouns[indexNoun];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        ServerNameGenerator s1 = new ServerNameGenerator();
//        System.out.println(s1.getRandomAdjective() + "-" + s1.getRandomNoun());
        System.out.println(s1.getRandomElement());
    }

}

