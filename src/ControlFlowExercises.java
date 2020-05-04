public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15) {
//            System.out.println("From a while loop. i = " + i);
//            i++;
//        }
//
//        int counter = 0;
//        do {
//            System.out.println("From a do-while loop. counter = " + counter);
//            counter += 2;
//        } while (counter <= 100);
//
//        int x = 100;
//        do {
//            System.out.println("Do-while loop, counting backwards from 100. x = " + x);
//            x -= 5;
//        } while (x >= -10);
//
//        int y = 1;
//        do {
//            System.out.println("Do-while loop. " + (int) Math.pow(2, y));
//            y *= 2;
//        } while (y <= 16);

        //Using for loop instead:
        for(int i = 5; i <= 15; i++) {
            System.out.println("From a for loop. i = " + i);
        }

        for(int counter = 0; counter <= 100; counter += 2) {
            System.out.println("From a for loop, counting up to 100 by 2s. " + counter);
        }

        for(int x = 100; x >= -10; x -=5) {
            System.out.println("For loop, counting backwards from 100 by 5s. " + x);
        }

        for(int y = 1; y <= 16; y *=2) {
            int intResult = (int) Math.pow(2,y);
            System.out.println("Squares using for loop. " + intResult);
        }

    }
}
