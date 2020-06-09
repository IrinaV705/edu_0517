package com.company;
public class Main {
    public static int multiplication(int num) {
        int a = 1;
        for (int i = 1; i <= num; i++) {
            a *= i;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(multiplication(10));
    }
}
/* Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.
Подсказка:
будет три миллиона с хвостиком.
Требования:
•	Программа должна выводить целое число на экран.
•	Метод main должен вызывать функцию System.out.println.
•	Выведенное число должно быть больше трех миллионов.
•	Выведенное число должно соответствовать заданию. */
