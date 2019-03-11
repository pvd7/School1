package ru.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ru.school.util.StrUtils.isNumber;

public class NumberMultiplicity {

    public static void main(String[] args) throws IOException {
        final int DIVIDER = 5;

        System.out.printf("Определяет количество чисел в массиве кратные %d\n", DIVIDER);
        System.out.print("Введите целые числа через пробел: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] arrStr = str.split(" ");

        int count = 0;
        for (String s : arrStr) {
            if (isNumber(s) && (Integer.valueOf(s) % DIVIDER == 0)) {
                count++;
            }
        }

        System.out.printf("%d чисел кратны %d\n", count, DIVIDER);
    }

}
