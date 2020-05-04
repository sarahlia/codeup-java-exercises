public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i <= 15) {
            System.out.println("From a while loop. i = " + i);
            i++;
        }

        int counter = 0;
        do {
            System.out.println("From a do-while loop. counter = " + counter);
            counter += 2;
        } while (counter <= 100);

        int x = 100;
        do {
            System.out.println("Do-while loop, counting backwards from 100. x = " + x);
            x -= 5;
        } while (x >= -10);

        int y = 1;
        do {
            System.out.println("Do-while loop. " + Math.pow(2, y));
            y *= 2;
        } while (y <= 16);

    }
}
