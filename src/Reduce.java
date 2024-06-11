public class Reduce {
    public static void main(String[] args) {
        reduce(100);
    }
    private static void reduce(int n) {
        int step = 0;
        while (n != 0) {
            step += 1;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
        }
        System.out.println(step);

    }
}
