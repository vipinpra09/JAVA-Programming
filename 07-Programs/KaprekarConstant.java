import java.util.Arrays;

public class KaprekarConstant {

    // Function to convert number to sorted digits (ascending or descending)
    public static int getNumber(int num, boolean ascending) {
        String str = String.format("%04d", num); // ensures 4 digits (leading zeros)
        char[] digits = str.toCharArray();
        Arrays.sort(digits);

        if (!ascending) {
            // reverse for descending
            for (int i = 0; i < digits.length / 2; i++) {
                char temp = digits[i];
                digits[i] = digits[digits.length - 1 - i];
                digits[digits.length - 1 - i] = temp;
            }
        }

        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        int num = 3524; // you can change this

        if (num < 1000 || num > 9999) {
            System.out.println("Enter a valid 4-digit number.");
            return;
        }

        if (String.valueOf(num).chars().distinct().count() == 1) {
            System.out.println("All digits are same. Not valid.");
            return;
        }

        int steps = 0;

        while (num != 6174) {
            int desc = getNumber(num, false);
            int asc = getNumber(num, true);

            num = desc - asc;
            steps++;

            System.out.println(desc + " - " + asc + " = " + num);
        }

        System.out.println("Reached Kaprekar Constant 6174 in " + steps + " steps.");
    }
}