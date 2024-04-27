package ru.otus.java.basic.practice;

import java.util.Random;
import java.util.Scanner;

public class CrossesAndZeros {

    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_RED = "\u001B[31m";

    static char[][] gameField = new char[3][3];
    static char[][] winnerLine = new char[3][3];

    final static char CROSS = 'X';
    final static char ZERO = '0';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int x;
    static int y;

    public static void main(String[] args) {
        initGameField();
        printGameField();

        while (true) {
            turnHuman(CROSS);
            if (isWon(CROSS, false)) {
                printWinnerGameField(CROSS);
                System.out.println(ANSI_GREEN + CROSS + " is winner!" + ANSI_RESET);
                return;
            } else {
                printGameField();
            }
            if (isGameOver()) {
                System.out.println(ANSI_GREEN + "Ничья" + ANSI_RESET);
                return;
            }

            turnBot(ZERO);
            if (isWon(ZERO, false)) {
                printWinnerGameField(ZERO);
                System.out.println(ANSI_GREEN + ZERO + " is winner!" + ANSI_RESET);
                return;
            } else {
                printGameField();
            }
            if (isGameOver()) {
                System.out.println(ANSI_GREEN + "Ничья" + ANSI_RESET);
                return;
            }
        }
    }

    private static boolean isWon(char letter, boolean isFakeCheck) {
        return (checkHorizontal(letter, isFakeCheck) || checkVertical(letter, isFakeCheck) || checkDiagonal(letter, isFakeCheck));
    }

    private static boolean checkHorizontal(char letter, boolean isFakeCheck) {
        boolean result = false;
        for (int i = 0; i < gameField.length; i++) {
            if ((gameField[i][0] == letter) && (gameField[i][1] == letter) && (gameField[i][2] == letter)) {
                if (!isFakeCheck) {
                    winnerLine[i][0] = gameField[i][0];
                    winnerLine[i][1] = gameField[i][1];
                    winnerLine[i][2] = gameField[i][2];
                }
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean checkVertical(char letter, boolean isFakeCheck) {
        boolean result = false;
        for (int i = 0; i < gameField.length; i++) {
            if ((gameField[0][i] == letter) && (gameField[1][i] == letter) && (gameField[2][i] == letter)) {
                if (!isFakeCheck) {
                    winnerLine[0][i] = gameField[0][i];
                    winnerLine[1][i] = gameField[1][i];
                    winnerLine[2][i] = gameField[2][i];
                }
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean checkDiagonal(char letter, boolean isFakeCheck) {
        if ((gameField[0][0] == letter) && (gameField[1][1] == letter) && (gameField[2][2] == letter)) {
            if (!isFakeCheck) {
                winnerLine[0][0] = gameField[0][0];
                winnerLine[1][1] = gameField[1][1];
                winnerLine[2][2] = gameField[2][2];
            }
            return true;
        }

        if ((gameField[0][2] == letter) && (gameField[1][1] == letter) && (gameField[2][0] == letter)) {
            if (!isFakeCheck) {
                winnerLine[0][2] = gameField[0][2];
                winnerLine[1][1] = gameField[1][1];
                winnerLine[2][0] = gameField[2][0];
            }
            return true;
        }
        return false;
    }

    private static boolean isGameOver() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void turnHuman(char letter) {
        do {
            System.out.print("Строка = ");
            x = scanner.nextInt() - 1;
            System.out.print("Столбец = ");
            y = scanner.nextInt() - 1;
            if (isEmpty(x,y)) {
                gameField[x][y] = letter;
                return;
            }
        } while(true);
    }

    private static void turnBot(char letter) {
        char enemyLetter = (letter == ZERO) ? CROSS : ZERO;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] == ' ') {
                    gameField[i][j] = letter;
                    if (isWon(letter, true)) {
                        return;
                    }
                    gameField[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (isEmpty(i,j)) {
                    gameField[i][j] = enemyLetter;
                    if (isWon(enemyLetter, true)) {
                        gameField[i][j] = letter;
                        return;
                    }
                    gameField[i][j] = ' ';
                }
            }
        }

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
            if (isEmpty(x,y)) {
                gameField[x][y] = letter;
                return;
            }
        } while (true);
    }

    private static boolean isEmpty(int x, int y) {
        return gameField[x][y] == ' ';
    }

    private static void printGameField() {
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print("   " + (i + 1));
        }
        System.out.println();

        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(" " + gameField[i][j] + " |");
            }
            System.out.println();
        }
    }

    private static void printWinnerGameField(char letter) {
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print("   " + (i + 1));
        }
        System.out.println();

        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < gameField.length; j++) {
                if ((gameField[i][j] == letter) && (gameField[i][j] == winnerLine[i][j])) {
                    System.out.print(" " + ANSI_RED + gameField[i][j] + ANSI_RESET + " |");
                } else {
                    System.out.print(" " + gameField[i][j] + " |");
                }
            }
            System.out.println();
        }
    }

    private static void initGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = ' ';
            }
        }
    }
}
