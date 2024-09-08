import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nЗадача 1: Чётное или нечётное число");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.");
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        if ((num % 2) == 0) {
            System.out.println("Число " + num + " - чётное ");
        } else {
            System.out.println("Число " + num + " - нечётное ");
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 2: Минимальное из трех чисел");
        System.out.println("Условие: Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.");
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третее число: ");
        int c = scanner.nextInt();

        if (a < b && a < c) {
            System.out.println("Минимальное из числел: " + a);
        } else if (b < a && b < c) {
            System.out.println("Минимальное из числел: " + b);
        } else {
            System.out.println("Минимальное из числел: " + c);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 3: Таблица умножения");
        System.out.println("Условие: Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10)");
        int mult = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(mult + " * " + i + " = " + mult * i);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 4: Сумма чисел от 1 до N");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.");
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        sum += n;
        System.out.print(n + " = " + sum);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 5: Число Фибоначчи");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.");
        System.out.print("Введите число: ");
        int n1 = scanner.nextInt();

        int[] f = new int[n1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n1; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < n1; ++i) {
            System.out.print(f[i] + " ");
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 6: Проверка простого числа");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).");
        System.out.print("Введите число: ");
        int n2 = scanner.nextInt();
        boolean isPrime = true;

        if (n2 < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n2); i++) {
                if (n2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Число " + n2 + " является простым: " + isPrime);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 7: Обратный порядок чисел");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.");
        System.out.print("Введите число: ");
        int n3 = scanner.nextInt();

        for (int i = n3; i > 0; i--) {
            System.out.print(i + " ");
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 8: Сумма четных чисел");
        System.out.println("Условие: Пользователь вводит два целых числа A и B. Программа должна найти сумму всех чётных чисел в диапазоне от A до B (включительно).");
        System.out.print("Введите число A: ");
        int nA = scanner.nextInt();
        System.out.print("Введите число B: ");
        int nB = scanner.nextInt();

        int sum1 = 0;
        for (int i = nA; i <= nB + 1; i++) {
            if (i % 2 == 0) sum1 += i;
        }
        System.out.print("сумма чётных чисел: " + sum1);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 9: Реверс строки");
        System.out.println("Условие: Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.");
        System.out.print("Введите строку: ");
        String text = scanner.next();

        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println("Строка после реверса: " + reverse);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 10: Количество цифр в числе");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.");
        System.out.print("Введите целое число: ");
        int n4 = scanner.nextInt();

        int length1 = String.valueOf(n4).length();
        System.out.println("Вывод: " + length1);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 11: Факториал числа");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).");
        System.out.print("Введите целое число: ");
        int n5 = scanner.nextInt();

        int res = 1;
        for (int i = 1; i <= n5; i++) {
            res *= i;
        }
        System.out.println(res);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 12: Сумма цифр числа");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.");
        System.out.print("Введите целое число: ");
        int n6 = scanner.nextInt();
        int sum2 = 0;

        while (n6 != 0) {
            sum2 += n6 % 10;
            n6 /= 10;
        }
        System.out.println("Сумма всех цифр числа: " + sum2);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 13: Палиндром");
        System.out.println("Условие: Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).");
        System.out.print("Введите строку: ");
        String strrev = "";
        String str = scanner.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            strrev = strrev + str.charAt(i); // charAt возвращает символ из массива строки по указанному индексу
        }
        if (strrev.equalsIgnoreCase(str))    // equalsIgnoreCase сравнение строк лексикографически, игнорируя различия регистра
            System.out.println("Строка является палиндромом");
        else
            System.out.println("Строка НЕ является палиндромом");
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 14: Найти максимальное число в массиве");
        System.out.println("Условие: Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.");
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); // Ввод размера массива
        int array[] = new int[size]; // Создаём массив

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Заполнение массива элементами
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 15: Сумма всех элементов массива");
        System.out.println("Условие: Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.");
        System.out.print("Введите размер массива: ");
        int size2 = scanner.nextInt();
        int array2[] = new int[size2];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int sum3 = 0;
        for (int num1 : array2) {
            sum3 += num1;
        }
        System.out.println("Сумма всех элементов массива: " + sum3);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 16: Количество положительных и отрицательных чисел");
        System.out.println("Условие: Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.");
        System.out.print("Введите размер массива: ");
        int size3 = scanner.nextInt();
        int array3[] = new int[size3];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size3; i++) {
            array3[i] = scanner.nextInt();
        }

        int Positive = 0;
        int Negative = 0;

        for (int num2 : array3) {
            if (num2 > 0) {
                Positive++;
            } else if (num2 < 0) {
                Negative++;
            }
        }
        System.out.println("Количество положительных чисел: " + Positive);
        System.out.println("Количество отрицательных чисел: " + Negative);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 17: Простые числа в диапазоне");
        System.out.println("Условие: Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).");
        System.out.print("Введите число A: ");
        int n1A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int n1B = scanner.nextInt();
        boolean isPrime1;

        System.out.print("простые числа: ");
        for (int i = n1A; i <= n1B; i++)            // если ввести единицу, код не работает, надо с цифры 2
        {
            isPrime1 = true;

            for (int j = n1A; j < i; j++) {
                if ((i % j) == 0) {
                    isPrime1 = false;
                    break;
                }
            }
            if (isPrime1) {
                System.out.print(i + " ");
            }
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 18: Подсчет гласных и согласных в строке");
        System.out.println("Условие: Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.");
        System.out.print("Введите строку: ");
        String str1 = scanner.next().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'а' || ch == 'е' || ch == 'ё' || ch == 'у' || ch == 'о' || ch == 'и' || ch == 'э' || ch == 'ы' || ch == 'я' || ch == 'ю') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            } else {
                consonants++;
            }

        }
        System.out.println("Количество гласных букв: " + vowels);
        System.out.println("Количество согласных букв: " + consonants);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 19: Перестановка слов в строке");
        System.out.println("Условие: Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.");
        System.out.print("Введите строку: ");
        String str4 = scanner.next();
        String[] words = str4.split(" ");

        System.out.print("Строка в обратном порядке: ");
        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 20: Число Армстронга");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга " +
                "(сумма цифр в степени, равной количеству цифр, равна самому числу).");

        System.out.print("Введите число: ");
        int n7 = scanner.nextInt();
        int n7Dig = String.valueOf(n7).length();    //возвращает строковое представление;
        int sum7 = 0;
        int orig = n7;
        //числа Армстронга 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54 748, 92 727, 93 084, 548 834, 1 741 725 и т.д.

        while (n7 > 0) {
            int dig = n7 % 10;  // остаток от деления
            sum7 += Math.pow(dig, n7Dig);
            n7 /= 10;
        }

        if (sum7 == orig) {
            System.out.println(orig + " - является числом Армстронга");
        } else {
            System.out.println(orig + " - не является числом Армстронга");
        }
        scanner.close();
        System.out.println();
    }
}
