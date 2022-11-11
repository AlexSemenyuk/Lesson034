package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Java. Lesson008. Task08
 * Cколько раз встречается каждая буква массива с расположением по алфавиту
 * Semenyuk Alexander
 * Date 25.07.2022
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        char[] arr;
        // TODO: Пишите код здесь
        arr = new char[len];
        int count;
        int count1 = 0;
        int number;    // Вспомагательное число
        // Создаем дополнительный массив с латиницей
        char[] array = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        System.out.println(Arrays.toString(array));

        // Ввод значений массива через массив array
        for (int i = 0; i < arr.length; i++) {
            number = rnd.nextInt(26) + 1;
            arr[i] = array[number - 1];
        }
//        System.out.println(Arrays.toString(arr));

        // Цикл по массиву array для расположения букв по алфавиту
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (array[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 3 && count1 == 0) {           // Вывод чисел повторяющихся более 3 раз
                if (count == 4) {
                    System.out.print(array[i] + " - " + count + " раза");
                } else {
                    System.out.print(array[i] + " - " + count + " раз");
                }
                count1++;
            } else if (count > 3) {
                if (count == 4) {
                    System.out.print("\n");
                    System.out.print(array[i] + " - " + count + " раза");
                } else {
                    System.out.print("\n");
                    System.out.print(array[i] + " - " + count + " раз");
                }
            }

        }


    }
}

// Вариант через random по цифрам и switch


//    int count;
//    int count1 = 0;
//    int number;    // Вспомагательное число
//
//// Ввод значений массива
//        for (int i = 0; i < arr.length; i++) {
//        number = rnd.nextInt(26) + 1;
//        switch (number) {
//        case 1:
//        arr[i] = 'a';
//        break;
//        case 2:
//        arr[i] = 'b';
//        break;
//        case 3:
//        arr[i] = 'c';
//        break;
//        case 4:
//        arr[i] = 'd';
//        break;
//        case 5:
//        arr[i] = 'e';
//        break;
//        case 6:
//        arr[i] = 'f';
//        break;
//        case 7:
//        arr[i] = 'g';
//        break;
//        case 8:
//        arr[i] = 'h';
//        break;
//        case 9:
//        arr[i] = 'i';
//        break;
//        case 10:
//        arr[i] = 'j';
//        break;
//        case 11:
//        arr[i] = 'k';
//        break;
//        case 12:
//        arr[i] = 'l';
//        break;
//        case 13:
//        arr[i] = 'm';
//        break;
//        case 14:
//        arr[i] = 'n';
//        break;
//        case 15:
//        arr[i] = 'o';
//        break;
//        case 16:
//        arr[i] = 'p';
//        break;
//        case 17:
//        arr[i] = 'q';
//        break;
//        case 18:
//        arr[i] = 'r';
//        break;
//        case 19:
//        arr[i] = 's';
//        break;
//        case 20:
//        arr[i] = 't';
//        break;
//        case 21:
//        arr[i] = 'u';
//        break;
//        case 22:
//        arr[i] = 'v';
//        break;
//        case 23:
//        arr[i] = 'w';
//        break;
//        case 24:
//        arr[i] = 'x';
//        break;
//        case 25:
//        arr[i] = 'y';
//        break;
//default:
//        arr[i] = 'z';
//        break;
//        }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//        count = 0;
//        for (int j = 0; j < arr.length; j++) {
//        if (arr[i] == arr[j] && j >= i) {  // исключение повторений
//        count++;
//        } else if (arr[i] == arr[j]) {
//        count = 0;
//        break;
//        }
//        }
//        if (count > 3 &&  count1==0){
//        if (count==4){
//        System.out.print(arr[i] + " - " + count + " раза");
//        } else {
//        System.out.print(arr[i] + " - " + count + " раз");
//        }
//        count1 ++;
//        } else if (count > 3 ){
//        if (count==4){
//        System.out.print("\n");
//        System.out.print(arr[i] + " - " + count + " раза");
//        } else {
//        System.out.print("\n");
//        System.out.print(arr[i] + " - " + count + " раз");
//        }
//        }
//        }