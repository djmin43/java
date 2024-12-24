package org.example.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자가 입력한 정수를 계산해주는 프로그램. 0을 입력하면 꺼짐");
        int sum = 0;
        while (true) {
            System.out.println("숫자를 입력해보세요!");

            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += input;
            System.out.println("합계는요~ " + sum);

        }

    }
}
