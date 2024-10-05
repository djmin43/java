package org.example.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            return new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (this.isEmpty()) {
            this.empty = false;
            this.boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            this.empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            this.boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
