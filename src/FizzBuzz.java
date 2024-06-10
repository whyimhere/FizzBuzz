/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            doFuzzBuzz result = new doFuzzBuzz(divisibleBy3, divisibleBy5);

            // Print our appropriate result.
            if (result.divisibleBy3() && result.divisibleBy5()) {

                System.out.println("Fizz Buzz");

            } else if (result.divisibleBy3()) {

                System.out.println("Fizz");

            } else if (result.divisibleBy5()) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }

    private record doFuzzBuzz(boolean divisibleBy3, boolean divisibleBy5) {
    }
}
