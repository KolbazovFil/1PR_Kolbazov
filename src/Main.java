import java.util.Scanner;

public class Main
{
    public static <string, Var> void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\nЗадача 1: Чётное или нечётное число");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.");
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        if((num%2)==0)
        {
            System.out.println("Число " + num + " чётное ");
        }
        else
        {
            System.out.println("Число " + num + " нечётное ");
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 2: Минимальное из трех чисел");
        System.out.println("Условие: Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.");
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третее число: ");
        int c = in.nextInt();

        if (a < b && a < c)
        {
            System.out.println("Минимальное из числел: " + a);
        }
        else if (b < a && b < c)
        {
            System.out.println("Минимальное из числел: " + b);
        }
        else
        {
            System.out.println("Минимальное из числел: " + c);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 3: Таблица умножения");
        System.out.println("Условие: Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10)");
        int mult = 5;

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(mult + " * " + i + " = " + mult * i);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 4: Сумма чисел от 1 до N");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.");
        System.out.print("Введите число: ");
        int n = in.nextInt();

        int sum = 0;
        for(int i = 1; i < n; i++)
        {
            System.out.print(i + " + ");
            sum += i;
        }
        sum += n;
        System.out.print(n + " = " + sum);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 5: Число Фибоначчи");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.");
        System.out.print("Введите число: ");
        int n1 = in.nextInt();

        int[] f = new int[n1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n1; ++i)
        {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < n1; ++i)
        {
            System.out.print(f[i] + " ");
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 6: Проверка простого числа");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).");
        System.out.print("Введите число: ");
        int n2 = in.nextInt();
        boolean isPrime = true;

        if (n2 < 2)
        {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(n2); i++)
            {
                if (n2 % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Число " + n2 + " является простым: " + isPrime);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 7: Обратный порядок чисел");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.");
        System.out.print("Введите число: ");
        int n3 = in.nextInt();

        for (int i = n3; i > 0; i--) {
            System.out.print(i + " ");
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 8: Сумма четных чисел");
        System.out.println("Условие: Пользователь вводит два целых числа A и B. Программа должна найти сумму всех чётных чисел в диапазоне от A до B (включительно).");
        System.out.print("Введите число A: ");
        int nA = in.nextInt();
        System.out.print("Введите число B: ");
        int nB = in.nextInt();

        int sum1 = 0;
        for (int i = nA; i <= nB + 1; i++)
        {
            if (i % 2 == 0) sum1 += i;
        }
        System.out.print("сумма чётных чисел: " + sum1);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nЗадача 9: Реверс строки");
        System.out.println("Условие: Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.");
        System.out.print("Введите строку: ");
        String text = in.next();

        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println("Строка после реверса: " + reverse);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 10: Количество цифр в числе");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.");
        System.out.print("Введите целое число: ");
        int n4 = in.nextInt();

        int length = String.valueOf(n4).length();
        System.out.println("Вывод: " + length);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 11: Факториал числа");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).");
        System.out.print("Введите целое число: ");
        int n5 = in.nextInt();

        int res = 1;
        for (int i = 1; i <= n5; i++)
        {
            res = res * i;
        }
        System.out.println(res);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 12: Сумма цифр числа");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.");
        System.out.print("Введите целое число: ");
        int n6 = in.nextInt();



        in.close();
    }
}


//Задача 13: Палиндром
//Условие:
//Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).
//Задача 14: Найти максимальное число в массиве
//Условие:
//Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.
//        Задача 15: Сумма всех элементов массива
//Условие:
//Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.
//        Задача 16: Количество положительных и отрицательных чисел
//Условие:
//Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.
//Задача 17: Простые числа в диапазоне
//Условие:
//Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).
//Задача 18: Подсчет гласных и согласных в строке
//Условие:
//Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.
//        Задача 19: Перестановка слов в строке
//Условие:
//Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.
//        Задача 20: Число Армстронга
//Условие:
//Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).
