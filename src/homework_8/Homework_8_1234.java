package homework_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Homework_8_1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 1. Введите 3 строки:");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        String min = strings[0];
        String max = strings[0];
        for (String s : strings) {
            if (s.length() < min.length()) {
                min = s;
            }
            if (s.length() > max.length()) {
                max = s;
            }
        }
        System.out.println("Самая короткая строка: \"" + min + "\", длина: " + min.length());
        System.out.println("Самая длинная строка: \"" + max + "\", длина: " + max.length());
        System.out.println("\nЗадача 2. Введите 3 строки:");
        String[] strings2 = new String[3];
        for (int i = 0; i < 3; i++) {
            strings2[i] = scanner.nextLine();
        }
        Arrays.sort(strings2, Comparator.comparingInt(String::length));
        System.out.println("Строки в порядке возрастания длины:");
        for (String s : strings2) {
            System.out.println("\"" + s + "\" (длина: " + s.length() + ")");
        }
        System.out.println("\nЗадача 3. Введите 3 строки:");
        String[] strings3 = new String[3];
        int sumLength = 0;
        for (int i = 0; i < 3; i++) {
            strings3[i] = scanner.nextLine();
            sumLength += strings3[i].length();
        }
        double averageLenght = sumLength / 3.0;
        System.out.println("Средняя длина строк: " + averageLenght);
        System.out.println("Строки короче средней длины:");
        for (String s : strings3) {
            if (s.length() < averageLenght) {
                System.out.println("\"" + s + "\"(длина: " + s.length() + ")");
            }
        }
        System.out.println("\nЗадача 4. Введите 3 строки:");
        String[] strings4 = new String[3];
        for (int i = 0; i < 3; i++) {
            strings4[i] = scanner.nextLine();
        }
        String result = null;
        for (String s : strings4) {
            if (uniqChars(s)) {
                result = s;
                break;
            }
        }
        if (result != null) {
            System.out.println("Первое слово из различных символов: \"" + result + "\"");
        }
        else {
            System.out.println("Слов с различными символами нет!");
        }
    }
public static boolean uniqChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
}

}
