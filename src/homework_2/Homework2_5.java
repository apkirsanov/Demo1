package homework_2;

import java.util.Scanner;
public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean num = false;
        while (!num) {
            System.out.print("Введите любое целое положительное число: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    num = true;
                }
                else {
                    System.out.println("Введено не целое положительное число!");
                }
            }
            else {
                System.out.println("Введено не целое положительное число!");
                scanner.next();
            }
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
        scanner.close();
    }
}

