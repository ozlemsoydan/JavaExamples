public class Main {
    public static void main(String[] args) {
        //pozitif tam sayÄ± bÃ¶lenlerinin toplamÄ±nÄ±n kedisine eÅŸit olan sayÄ±

        int number = 8;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println(number + " mÃ¼kemmel bir sayÄ±dÄ±r.");
        } else {
            System.out.println(number + " mÃ¼kemmel sayÄ± deÄŸildir");
        }
    }
}