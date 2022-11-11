package ua.step.homework;

import java.util.Scanner;

/**
 * Java. Lesson008. Task03
 * Одинаковые все элементы массива
 * Semenyuk Alexander
 * Date 25.07.2022
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        int a = 0;

        // Ввод значений массива с проверкой на одинаковые значения
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();    // Ввод значений
            if (i == 0) {
                a = arr[i];
                if (i == (arr.length - 1)) {    // Вывод "yes", если имеется всего одно значение массива
                    System.out.println("Yes");
                }
            } else if (a == arr[i]) {  // Проверка на одинаковые значения
                if (i == (arr.length - 1)) {
                    System.out.println("Yes");
                }
            } else {   // Если значения не равны -  вывод "no"
                System.out.println("No");
                break;
            }
        }


    }
}
