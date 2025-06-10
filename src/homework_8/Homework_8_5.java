package homework_8;

import java.util.Scanner;
public class Homework_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 5. Введите строку:");
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (char a : s.toCharArray()) {
            result.append(a).append(a);
        }
        System.out.println("Задублирована каждая буква введенной строки: \n" + result);
    }
}