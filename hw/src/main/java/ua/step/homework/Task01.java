package ua.step.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java. Lesson008. Task01
 * Числа Фибона́ччи
 * Semenyuk Alexander
 * Date 21.07.2022
 * <p>
 * Числа Фибона́ччи — это последовательность чисел в которой два первых числа
 * последовательности равны 0 и 1, а каждое последующее число равно сумме двух
 * предыдущих.
 * Пример:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p>
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Пишите код здесь
//
//        int a = 0;
//        int b = 1;
//        int c;
//        int[] arrayFibonachi = new int[15];
//
//        for (int i = 0; i < arrayFibonachi.length; i++) {
//            if (i == 0) {
//                arrayFibonachi[i] = 0;
//            } else if (i == 1) {
//                arrayFibonachi[i] = 1;
//            } else {
//                arrayFibonachi[i] = a + b;
//                c = a + b;
//                a = b;
//                b = c;
//            }
//            if ((i + 1) % 2 == 0 && i == 2) {
//                System.out.print(arrayFibonachi[i]);
//            } else if ((i + 1) % 2 == 0) {
//                System.out.print(" " + arrayFibonachi[i]);
//            }
//        }
//        System.out.print("\n");
//        System.out.println(Arrays.toString(arrayFibonachi));
//
        int n = 16;
        List list = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(y -> y[0]).collect(Collectors.toList());
        int i = 0;
//        list.forEach(num -> System.out.print(num + " "));
//        System.out.println();

        for (Object num : list) {
//                System.out.println("num = " + num);
            if ((i + 1) % 2 == 0) {
                System.out.print(num + " ");
            }
            i++;
        }
    }
}