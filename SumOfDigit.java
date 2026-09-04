public class SumOfDigit {

    static void sumofdigit(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        int digit = n % 10;
        sum = sum + digit;

        sumofdigit(n / 10, sum);
    }

    public static void main(String[] args) {
        int n = 12345;
        sumofdigit(n, 0);
    }
}