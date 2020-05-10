import java.util.Random;

public class ServerNameGenerator {

    String[] adjectives = {"lazy", "sleepy", "grouchy", "handsome", "beautiful", "stinky", "happy", "sad", "shy", "arrogant"};
    String[] nouns = {"lion", "tiger", "bear", "pig", "sister", "brother", "mother", "father", "teacher", "student"};

    Random random = new Random();

    public String getRandomAdjective() {
        int indexAdj = random.nextInt(adjectives.length);
        return adjectives[indexAdj];
    }

    public String getRandomNoun() {
        int indexNoun = random.nextInt(nouns.length);
        return nouns[indexNoun];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        ServerNameGenerator s1 = new ServerNameGenerator();
        System.out.println(s1.getRandomAdjective() + "-" + s1.getRandomNoun());
    }


}

