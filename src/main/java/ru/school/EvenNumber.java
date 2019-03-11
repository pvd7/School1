package ru.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ru.school.util.StrUtils.isNumber;

public class EvenNumber {

    public static void main(String[] args) throws IOException {
        System.out.println("Определяет, является ли число а четным или нечетным");
        System.out.print("Введите число: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        if (isNumber(str)) {
            System.out.println(Integer.valueOf(str) % 2 == 0 ? "Четное число" : "Не четное число");
        } else
            System.out.printf("%s не является числом", str);
    }

}
