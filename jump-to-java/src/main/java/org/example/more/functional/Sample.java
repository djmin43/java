package org.example.more.functional;

//@FunctionalInterface
//interface Calculator {
//    int sum(int a, int b);
//}

//class MyCalculator implements Calculator {
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Sample {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 뽑아낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
    }
}
