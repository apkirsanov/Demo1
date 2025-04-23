package homework_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Выполнение предусловия к ДЗ, ввод размера массива и его заполнение
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] mass = new int[size];
        System.out.println("Заполняю массив");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        //Вывод массива в строку
        System.out.println("Массив: " + Arrays.toString(mass));

        //Задача 1. Вывод массива в прямом порядке
        System.out.println("Прямой порядок: " + Arrays.toString(mass));

        //Задача 1. Вывод массива в обратном порядке
        System.out.print("Обратный порядок: [");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println("]");

        //Задача 2. Вывод min и max элементов
        int min = mass[0];
        int max = mass[0];
        for (int num : mass) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min элемент: " + min);
        System.out.println("Max элемент: " + max);

        //Задача 3. Вывод индексов min и max элементов
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (mass[i] < mass[minIndex]) minIndex = i;
            if (mass[i] > mass[maxIndex]) maxIndex = i;

        }
        System.out.println("Индекс min элемента: " + minIndex);
        System.out.println("Индекс max элемента: " + maxIndex);

        //Задача 4. Вывод количества нулевых элементов
        int zero = 0;
        for (int num : mass) {
            if (num == 0) {
                zero++;
            }

        }
        if (zero > 0) {
            System.out.println("Количество нулевых элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов нет");
        }

        //Задача 5. Изменение мест элементов массива
        for (int i = 0; i < mass.length / 2; i++) {
            int pos = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = pos;
        }
        System.out.println("Массив после изменения мест элементов: " + Arrays.toString(mass));

        //Задача 6. Проверка возрастающей последовательности
        boolean incr = true;
        for (int i = 1; i < size; i++) {
            if (mass[i] <= mass[i - 1]) {
                incr = false;
                break;
            }
        }
        System.out.println("Массив " + (incr ? "" : "не ") + "является возрастающей последовательностью");
        scanner.close();

    }

}




