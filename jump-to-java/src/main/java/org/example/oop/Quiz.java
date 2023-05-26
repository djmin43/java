package org.example.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

class Calculator {
    Integer value;

    Calculator() {
        this.value = 0;
    }


    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator {
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}

class Gold implements Mineral {
    public int getValue() {
        return 100;
    }
}

class Silver implements Mineral {
    public int getValue() {
        return 90;
    }

}

class Bronze implements Mineral {
    public int getValue() {
        return 80;
    }

}

interface Mineral {
    public int getValue();
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class Quiz {

    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}
