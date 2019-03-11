package ru.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaRectangle {

    public static void main(String[] args) throws IOException {
        System.out.println("Площадь прямоугольника");
        System.out.print("Введите через пробел стороны прямоугольника: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] arrStr = str.split(" ");

        int a = Integer.valueOf(arrStr[0]);
        int b = Integer.valueOf(arrStr[1]);
        System.out.printf("Площадь = %d\n", a * b);
    }

}
