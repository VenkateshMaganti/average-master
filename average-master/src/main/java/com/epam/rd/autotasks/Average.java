package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int sum = 0, num, n = 0, avg;
        while((num = scanner.nextInt()) != 0) {
            sum += num;
            ++n;
        }
        avg = sum / n;
        System.out.println(avg);
    }

}