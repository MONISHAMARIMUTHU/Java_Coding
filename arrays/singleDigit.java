public class singleDigit {
    static int singleDigit1(int n) {
        int sum = 0; 
        while (n > 0 || sum > 9) {

            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(singleDigit1(n));
    }
}
