import java.util.Scanner;

public class BreakDown {
    public static void main(String[] args) {

        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        for (int i = 0; i < notes.length; i++) {

            int count = amount / notes[i];

            if (count > 0) {
                System.out.println(notes[i] + " " + count);
                amount %= notes[i];
            }
        }
    }
}
