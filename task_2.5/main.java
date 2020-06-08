package com.company;

public class Main {

    public static void main(String[] args) {
        String[] temp = {"мама", "мыла", "раму"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == j)
                        continue;
                    if (k == i)
                        continue;
                    if (k == j)
                        continue;
                    System.out.print(temp[i]);
                    System.out.print(temp[j]);
                    System.out.println(temp[k]);
                }
            }
        }
    }
}
/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */
