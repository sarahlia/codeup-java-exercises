package homepractice;

public class Animal {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

//        Does NOT work in reverse:
//        Dog brinkley = new Animal();
//        brinkley.animalSound();

    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}




