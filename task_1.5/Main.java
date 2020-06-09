/* Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

package com.company;

import java.util.Scanner;


// write your code here
public class Main {
    public static void main(String[] args) {
        float tempC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celcus number: ");
        tempC = scanner.nextInt();
        float tempF = ((tempC / 5) * 9) + 32;
        System.out.print("Fahrengheit number is: " + tempF);
    }
}
