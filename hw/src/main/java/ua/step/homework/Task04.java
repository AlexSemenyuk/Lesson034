package ua.step.homework;

import java.util.Scanner;

/**
 * Java. Lesson008. Task04
 * Разные все элементы массива
 * Semenyuk Alexander
 * Date 25.07.2022
 * Задание: написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно по-
 * вторение.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        int count;
        int count1 = 0;

        // Ввод значений массива и его копии
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.print("\n");
        // Проверка на отсутствие повторений элементов массива
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print("No");
                break;
            } else {
                count1++;
            }
        }
        if (count1 == arr.length) {
            System.out.print("Yes");
        }

    }
}

// Решение задачи через массив-копию


//    int[] arr = new int[len];
//    int[] arr1 = new int[len];
//
//// Ввод значений массива и его копии
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = scanner.nextInt();
//        arr1[i] = arr[i];
//        }
//
//        // Проверка на отсутствие повторений элементов массива
//        outer:
//        for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr.length; j++) {
//        if (arr.length == 1) {
//        System.out.println("Yes");
//        break outer;
//        }
//        if (i != j) {
//        if (arr[i] != arr1[j]) {
//        if (i == (arr.length - 1) && j == (arr.length - 2)) {
//        System.out.println("Yes");
//        }
//        } else {
//        System.out.println("No");
//        break outer;
//        }
//        }
//        }
//        }
