package com.exercise.IllegalTriangleException;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MOi nhap 3 canh cua tam giac");
            System.out.println("Canh A: ");
            int a = input.nextInt();

            System.out.println("Canh B: ");
            int b = input.nextInt();

            System.out.println("Canh C: ");
            int c = input.nextInt();

        try {
            checkCanhTamGiac(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getError());
        }
    }

    public static void checkCanhTamGiac(int a, int b, int c) throws IllegalTriangleException {
        if ((a<0||b<0||c<0) || (a+b)<=c || (a+c)<=b || (b+c)<=a) {
            throw new IllegalTriangleException("Khong thoa man gia tri");
        } else {
            System.out.println("OK");
        }
    }
}
