package org.example.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자를 입력해주세요: ");
            int firstInt = scanner.nextInt();

            System.out.println("두번째 숫자를 입력해주세요:");
            int secondInt = scanner.nextInt();

            if ((firstInt + secondInt) == 0) {
                System.out.println("두 합은 0입니다. 프로그램 종료");
                break;
            }
            System.out.println("두 수의 합은? " + (firstInt + secondInt));


        }

    }
}
