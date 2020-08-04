package homepractice;

public class Printer {

    static <E> void printArray(E[] array) {
        if(array == null || array.length == 0) {
            return;
        }

        for(E el:array) {
            System.out.println(el);
        }
    }
}
