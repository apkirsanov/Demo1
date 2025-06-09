package homework_7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
    public static void method1() {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("Результат деления: " + c);
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
        }
    }
    public static void method2() {
        try {
            int a = 10;
            System.out.println("Введите число на которое будем делить " + a + " :");
            int b = scanner.nextInt();
            System.out.println(a + "/" + b + " = " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение");
        }
    }
    public static void method3() {
        try {
            int a = 10;
            System.out.println("Введите число на которое будем делить " + a + " :");
            int b = scanner.nextInt();
            System.out.println(a + "/" + b + " = " + a/b);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Произошла ошибка, возможно введены некорректные данные!");
        }
    }
    public static void method4() {
        try {
            int c = 10;
            System.out.println("Введите число на которое будем делить " + c + " :");
            int d = scanner.nextInt();
            System.out.println(c + "/" + c + " = " + c/d);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение");
        } finally {
            System.out.println("Завершение работы");
        }
    }
}
