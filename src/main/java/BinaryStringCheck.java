import java.util.Scanner;
public class BinaryStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        boolean isBinary = input.matches("[01]+");
        System.out.println(isBinary);
    }
}
