package org.example.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요(exit: 종료):");

        while (true){
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.print("프로그램을 종료합니다");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }

    }
}
