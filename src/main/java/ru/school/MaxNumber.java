package ru.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static ru.school.util.StrUtils.isNumber;

public class MaxNumber {

    public static void main(String[] args) throws IOException {
        System.out.print("Находит максимальный элемент в массиве");
        System.out.print("Введите целые числа через пробел: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] arrStr = str.split(" ");

        Integer max = null;
        Integer num;
        for (String s : arrStr) {
            if (isNumber(s)) {
                num = Integer.valueOf(s);
                if (max == null || max < num) max = num;
            }
        }
        System.out.printf("Максимальное число %d\n", max);
    }

}
