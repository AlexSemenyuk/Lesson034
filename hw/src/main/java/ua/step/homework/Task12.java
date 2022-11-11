package ua.step.homework;

import java.util.Scanner;

/**
 * Java. Lesson008. Task12
 * Симметричность двухмерного массива по горизонтали
 * Semenyuk Alexander
 * Date 26.07.2022
 * Программа должна выводить слово Yes для симметрич-
 * ного массива и слово No – для несимметричного. Симме-
 * тричным считается массив, в котором значения элементов с
 * конца равно значению элементов с начала. Массив заполняется
 * пользователем вручную.
 * Размер массива (количество строк и колонок) задается при
 * запуске программы.
 * <p>
 * Примеры значений для симметричного массива:
 * <p>
 * 1, 2, 3, 2, 1
 * 2, 2, 3, 2, 2
 * 1, 3, 2, 3, 1
 * 5, 4, 3, 4, 5
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размернось массива (сколько строк и колонок): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] marr;
        // TODO: Пишите код здесь
        int count;      // Счетчик симметричности столбцов
        int count1 = 0;   // Счетчик симметричных строк
        marr = new int[rows][cols];
//        System.out.println("Введите массив: " + rows + " строк(и) и " + cols + " столбцов(а)");

        // Ввод массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                marr[i][j] = scanner.nextInt();
            }
        }


        // Вывод массива в консоль
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols ; j++) {
//                if (j!=(cols-1)) {
//                    System.out.print(marr[i][j] + ", ");
//                } else {
//                    System.out.print(marr[i][j]);
//                }
//            }
//            System.out.print("\n");
//        }
//        System.out.print(marr[1][2]);

        // Проверка симметричности столбцов с учетом строк
        for (int i = 0; i < rows; i++) {
            count = 0;
            for (int j = 0; j < (cols / 2); j++) {
                if (marr[i][j] == marr[i][cols - j - 1]) {
                    count++;
//                    System.out.println("count = " + count);
                }
            }
            if (count == (cols / 2)) {
                count1++;
//                System.out.println("count1 = " + count1);
            }
        }

        // Вывод в консоль результата по симметричности массива по горизонтали
        if (count1 == rows) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }


    }
}
