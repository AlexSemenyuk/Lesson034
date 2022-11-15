package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java. Lesson008. Task02
 * Минимальный и максимальный элементы массива
 * Semenyuk Alexander
 * Date 21.07.2022
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest02
        long seed = 0;// args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
//        int[] array = new int[30];
//        int arrayMax = Integer.MIN_VALUE;
//        int arrayMin = Integer.MAX_VALUE;
//
//        // Ввод значений и определение мин и макс
//        for (int i = 0; i < 30; i++) {
//            array[i] = rnd.nextInt(51 +70) - 70;
//
//            if (arrayMax < array[i]) {
//                arrayMax = array[i];
//            }
//            if (arrayMin > array[i]) {
//                arrayMin = array[i];
//            }
//        }
//
//        System.out.println(arrayMin + " " + arrayMax);

        int max = 50;
        int min = -70;
        int[] arr = Stream.generate(() -> rnd.nextInt(max + 1 - min) + min)
                .limit(30)
                .mapToInt(x -> x)
                .toArray();

//        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
//        System.out.println();

        Arrays.stream(arr)
                .min()
                .stream()
                .forEach(x -> System.out.print(x + " "));
        Arrays.stream(arr)
                .max()
                .stream()
                .forEach(x -> System.out.print(x));

    }
}
