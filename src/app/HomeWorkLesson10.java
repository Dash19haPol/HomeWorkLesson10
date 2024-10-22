package app;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson10 {

    public static final double PI = 3.1415;

    public static void main(String[] args) {
//        1. Введіть ціле число: 5
//        Квадрат числа 5 дорівнює 25.
//
//        2. Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює 384.81334713945307.
//
//        3. Масив чисел: [10, 20, 30, 40, 50]
//        Сума всіх елементів масиву дорівнює 150.
//
//        4. Введіть рядок: Hello, World!
//                Рядок в зворотньому порядку: !dlroW ,olleH
//
//        5. Введіть a: 2
//        Введіть b: 3
//        Результат 2^3 дорівнює 8.
//
//        6. Введіть ціле число n: 4
//        Введіть текстовий рядок: Java програмування
//        Java програмування
//        Java програмування
//        Java програмування
//        Java програмування

//        1

        Scanner console = new Scanner(System.in);
        System.out.print("1. Введіть ціле число: ");
        int number = console.nextInt();
        System.out.printf("Квадрат числа %d дорівнює %d.", number, numberSquared(number));
        System.out.println();


//        2

        System.out.println();
        double radius = 3.5;
        double height = 10;
        double cylinderVolume = calculateCylinderVolume(radius, height);
        System.out.printf("2. Об'єм циліндра з радіусом %.1f і висотою %.1f дорівнює %.5f.", radius, height, cylinderVolume);
        System.out.println();

//        3

        System.out.println();
        int[] array = new int[]{10, 20, 30, 40, 50};
        System.out.println("3. Масив чисел: " + Arrays.toString(array));
        int sum = sumArray(array);
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

//        4

        System.out.println();
        console = new Scanner(System.in);
        System.out.print("4. Введіть рядок: ");
        String string = console.nextLine();
        String str = reverseTheLine(string);
        System.out.println("Рядок в зворотньому порядку: " + str);


//        5

        System.out.println();
        System.out.print("5. Введіть a: ");
        int a = console.nextInt();
        System.out.print("Введіть b: ");
        int b = console.nextInt();
        int degree = calculateDegree(a, b);
        System.out.printf("Результат %d^%d дорівнює %d.", a, b, degree);
        System.out.println();

//        6

        System.out.println();
        System.out.print("6. Введіть ціле число n: ");
        int n = console.nextInt();
        System.out.print("Введіть текстовий рядок: ");
        console = new Scanner(System.in);
        String text = console.nextLine();
        textStringTextNTimes(n, text);


    }

//    1

    public static int numberSquared(int number) {
        return number * number;
    }

//    2

    public static double calculateCylinderVolume(double radius, double height) {
        double cylinderVolume = PI * radius * radius * height;
        return cylinderVolume;
    }

//    3

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        return sum;
    }

//    4

    public static String reverseTheLine(String string) {
        char[] charArray = string.toCharArray();
        char[] temp = new char[charArray.length];
        for (int i = charArray.length - 1; i > -1; i--) {
            temp[charArray.length - 1 - i] = charArray[i];
        }
        return String.valueOf(temp);
    }

//    5

    public static int calculateDegree(int a, int b) {
        int degree = (int) Math.pow(a, b);
        return degree;
    }

//    6

    public static void textStringTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }

    }

}
