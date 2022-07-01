public class Main {
    public static void main(String[] args) {
        int number = 15;
        int divisor = 0;

        for (int i = 2; i < number; i++) {
            int remainder = number % i;

            if (remainder == 0) {
                System.out.println(number + " asal deÄŸildir.");
                divisor++;
                break;
            }
        }
        if (divisor == 0) {
            System.out.println(number + " asaldÄ±r.");

        }

    }
}