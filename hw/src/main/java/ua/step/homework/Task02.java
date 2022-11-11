package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Arrays;

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
        int[] array = new int[30];
        int arrayMax = Integer.MIN_VALUE;
        int arrayMin = Integer.MAX_VALUE;

        // Ввод значений и определение мин и макс
        for (int i = 0; i < 30; i++) {
            array[i] = rnd.nextInt(51 +70) - 70;
//            System.out.print(array[i]);
//            System.out.print(rnd.nextInt(51+70) - 70); // 0..120 - 70 = -70..+50
//            System.out.print(" ");
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
            if (arrayMin > array[i]) {
                arrayMin = array[i];
            }
        }

        System.out.println(arrayMin + " " + arrayMax);
//        System.out.println(Arrays.toString(array));
    }
}
