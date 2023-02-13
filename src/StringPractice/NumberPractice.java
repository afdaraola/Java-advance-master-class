package StringPractice;

public class NumberPractice {

    public static void main(String[] args) {
        int num = -122;
        System.out.println(reverseNumber(num));

    }

    public static int reverseNumber(int num) {

        int reversed = 0;
        int r;
        int positive = 1;
        if (num < 0) {
            positive = -1;
            num *= -1;
        }
        while (num > 0) {

            r = num % 10;

            int maxDiff = Integer.MAX_VALUE - reversed * 10;

            if (reversed > Integer.MAX_VALUE / 10 || r > maxDiff) {
                System.out.println("Wrong number");
            }

            reversed = reversed * 10 + r;

            num /= 10;
        }

        return reversed * positive;
    }
}
