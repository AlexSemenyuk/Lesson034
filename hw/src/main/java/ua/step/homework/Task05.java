package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Arrays;

/**
 * Java. Lesson008. Task05
 * Вывод повторяющихся элементов массива и их количества
 * Semenyuk Alexander
 * Date 25.07.2022
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int count; // Счечик количества
        int number = -5; // Вспомогательная переменная
        int[] array = new int[10];

        // Ввод значений массива
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11) - 5;

        }
        //       System.out.println(Arrays.toString(array));
        // Проверка каждого из чисел диапазона на совпадение с элементами массива
        while (number <= 5) {
            count = 0;
            for (int i = 0; i < 10; i++) {
                if (number == array[i]) {
                    count++;
                }
            }
            // Вывод в консоль повторяющихся элементов массива и их количества
            if (count >= 2 && number != 5) {
                System.out.printf(number + " - " + count + " раза\n");
            } else if (count >= 2) {
                System.out.printf(number + " - " + count + " раза");
            }
            number++;
        }

    }
}
