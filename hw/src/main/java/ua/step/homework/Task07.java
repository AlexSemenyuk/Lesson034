package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java. Lesson008. Task07
 * Cколько раз встречается каждая цифра массива
 * Semenyuk Alexander
 * Date 25.07.2022
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 * Пример вывода:
 * 3 - 2 раза
 * 5 - 3 раза
 * 8 - 1 раза
 * 9 - 3 раза
 * 11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь

//        int count; // Счечик количества
//        int number = 3; // Вспомогательная переменная
//        arr = new int[len];

        // Ввод значений массива
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt(11) + 3;
//
//        }
        // System.out.println(Arrays.toString(arr));

        // Cколько раз встречается каждая цифра массива
//        while (number <= 13) {
//            count = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (number == arr[i]) {
//                    count++;
//                }
//            }
//            // Вывод в консоль цифры и счетчика количества
//            if (count > 0) {
//                System.out.print(number + " - " + count + " раза\n");
//            }
//            number++;
//        }

        int max = 13;
        int min = 3;
        // Создание массива
        int[] array = Stream.generate(() -> rnd.nextInt(max + 1 - min) + min)
                .limit(len)
                .mapToInt(x -> x)
                .toArray();
        // Создание диапазона чисел
        int[] array1 = Stream.iterate(min, y -> y + 1)
                .limit(max - min + 1)
                .mapToInt(x -> x)
                .toArray();

        // Вывод массива в консоль
//        Arrays.stream(array)
//                .forEach(x -> System.out.print(x + " "));
//        System.out.println();
        // Вывод массива в консоль
//        Arrays.stream(array1)
//                .forEach(y -> System.out.print(y + " "));
//        System.out.println();

        int[] count = new int[1];
        count[0] = 0;

        Arrays.stream(array1)
                .forEach(x -> {
                    count[0] = 0;
                    Arrays.stream(array)
                            .forEach(y -> {
                                if (x == y) {
                                    count[0]++;
                                }
                            });
                    if (count[0] > 0) {
                        System.out.print(x + " - " + count[0] + " раза\n");
                    }
                });
    }
}
