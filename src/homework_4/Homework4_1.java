package homework_4;

import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char currentPlayer = 'X';
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard(board);
            System.out.println("Игрок " + currentPlayer + " ходит");
            System.out.print("Введите координаты строки (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Введите координаты столбца (1-3): ");
            int col = scanner.nextInt() - 1;
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Введены неверные координаты. Повторите попытку.");
                continue;
            }
if (board[row][col] != ' ') {
    System.out.println("Эта клетка занята. Повторите попытку.");
    continue;
}
board[row][col] = currentPlayer;
if (chekWin(board, currentPlayer)) {
    printBoard(board);
    System.out.println("Игрок " + currentPlayer + " победил");
    break;
}
if (chekDraw(board)) {
    printBoard(board);
    System.out.println("Ничья");
    break;
}
currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
    public static void
    printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public static boolean
    chekWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    public static boolean
    chekDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

