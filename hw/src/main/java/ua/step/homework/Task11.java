package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Java. Lesson008. Task11
 * Разделение массива на части
 * Semenyuk Alexander
 * Date 26.07.2022
 * Задание: Есть массив размером n элементов и заполненный
 * случайными числами в диапазоне от 0 до 100.
 * Необходимо разделить этот массив на массивы меньшего
 * размера в каждом из которых будет находиться не менее m элементов из
 * большого массива.
 * Значения n и m вводятся с клавиатуры пользователем.
 * Вывести на экран исходный массив и разделенный массив.
 * <p>
 * Пример вывода:
 * <p>
 * Исходный массив [35, 80, 39, 79, 63, 32, 89, 22, 29, 29]
 * Результат
 * [35, 80, 39]
 * [79, 63, 32]
 * [89, 22, 29]
 * [29]
 */
public class Task11 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массивов через пробел: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь

        arr = new int[n];

        // Ввод значений массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
        }

        // Вывод массива в консоль
        System.out.print("исходный массив ");
        System.out.print(Arrays.toString(arr));
        System.out.print("\n");

        // Расчет счетчика строк после деления основного массива длиной n на массив длиной m
        System.out.print("результат\n");
        int k;
        if (n % m == 0) {
            k = n / m;
        } else {
            k = n / m + 1;
        }
//        System.out.println("k = " + k);
        int[] arr1;

        // Создание массивов длиной m и вывод их в консоль за счет копии диапазона основного массива
        for (int i = 1; i <= k; i++) {
            if (i < k) {
                arr1 = Arrays.copyOfRange(arr, i * m - m, i * m);
                System.out.print(Arrays.toString(arr1));
                System.out.print("\n");
            } else {
                arr1 = Arrays.copyOfRange(arr, i * m - m, n);
                System.out.print(Arrays.toString(arr1));
            }
        }

    }
}


// Решение через двухмерный массив (Работает, но не соответствует выводу - скобок [] нет)
//    int count = 0;
//        arr = new int[n];
//                int a=0;
//                int b=0;
//                int k = (int)Math.ceil(n/m)+1;
////        System.out.println("k = " + k);
//                int[][] arr1 = new int [k][m];
//                for (int i = 0; i < arr.length; i++) {
//        arr[i] = rnd.nextInt(101);
//        }
//        System.out.print("исходный массив ");
//        System.out.print(Arrays.toString(arr));
//        System.out.print("\n");
//        System.out.print("результат\n");
//        for (int i = 0; i < arr.length; i++) {
//        a=i/m;
//        b=i%m;
//        arr1[a][b]=arr[i];
////            System.out.println("i= " + i + "   a= " + a + "  b= " + b + "    arr1[" + a + "][" + b+ "]=" + arr1[a][b]);
//        }
////        System.out.println("a= " + a + "  b= " + b);
//        outer:
//        for (int i = 0; i < k ; i++) {
//        for (int j = 0; j <=m; j++) {
//
//        if (j!=m ) {
//        System.out.print(arr1[i][j] + "\t");
//        } else {
//        System.out.print("\n");
//        }
//        if (i==a && j==b){
//        break outer;
//        }
//        }
//        }