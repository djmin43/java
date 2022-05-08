public class HelloGoodbye {
    public static void main (String[] args) {
        String firstName = args[0];
        String secondName = args[1];
        System.out.printf("Hello %s and %s %n", firstName, secondName);
        System.out.printf("Goodbye %s and %s %n", secondName, firstName);
    }
}