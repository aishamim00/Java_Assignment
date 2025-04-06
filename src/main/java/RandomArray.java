import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;  // Random between 1 and 100
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }

        System.out.print("Random Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print the max and min values
        System.out.println("Max: " + max + ", Min: " + min);
    }

}
