package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Arrays;

/**
 * Java. Lesson008. Task06
 * Уникальные элементы массива и их индексы
 * Semenyuk Alexander
 * Date 25.07.2022
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество уникальных значений
 * (встречающихся в массиве один раз). Вывести на консоль
 * значения уникальных элементов и индексы, под которыми
 * они находятся в массиве.
 * <p>
 * Пример:
 * -5 -> 0 индекс
 * 3 -> 1 индекс
 * 4 -> 2 индекс
 * 2 -> 3 индекс
 * 0 -> 4 индекс
 * -2 -> 5 индекс
 * -4 -> 6 индекс
 * -1 -> 9 индекс
 */
public class Task06 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest06
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int count; // Счечик количества

        int[] array = new int[10];

        // Ввод значений массива
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11) - 5;
        }
//        System.out.println(Arrays.toString(array));

        // Вывод в консоль уникальных элементов (встречаются в массиве 1 раз)
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }
            }
            if (count == 1) {
                System.out.print(array[i] + " -> " + i + " индекс" + "\n");
            }
        }

    }
}

