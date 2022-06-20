public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int numberToProcess = number;
        int reverse = 0;
        while (numberToProcess != 0) {
            reverse *= 10;
            int lastDigit = numberToProcess % 10;
            numberToProcess = (numberToProcess - lastDigit) / 10;
            reverse += lastDigit;
        }
        return number == reverse;
    }
}
