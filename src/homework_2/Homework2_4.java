package homework_2;

public class Homework2_4 {
    public static void main(String[] args) {
        int min = 7;
        int max = 98;
        System.out.println("Последовательность чисел: ");
        while (min <= max) {
            System.out.print(min + " ");
            min += 7;
        }
    }
}