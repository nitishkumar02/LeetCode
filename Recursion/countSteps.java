public class CountSteps {
    public static void main(String[] args) {
        int n = 8;
        int n1 = countSt(n);
        System.out.println(n1);
    }

    private static int countSt(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + countSt(n / 2);
        } else {
            return 1 + countSt(n - 1);
        }
    }
}
