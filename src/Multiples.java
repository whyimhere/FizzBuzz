public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        while (i < 1000) {
            boolean d5 = i % 5 == 0;
            boolean d3 = i % 3 == 0;
            i += 1;
            if (d5 || d3) {
                result += 1;
            }
        }
        System.out.println(result);

    }
}
