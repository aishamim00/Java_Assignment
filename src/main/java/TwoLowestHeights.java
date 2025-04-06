import java.util.Scanner;

public class TwoLowestHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lowest = Double.MAX_VALUE, secondLowest = Double.MAX_VALUE;
        System.out.println("Enter height of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            double h = sc.nextDouble();
            if (h < lowest) {
                secondLowest = lowest;
                lowest = h;
            } else if (h < secondLowest && h != lowest) {
                secondLowest = h;

            }
        }
        System.out.println("Lowest: " + lowest + " cm, Second Lowest: " + secondLowest + " cm");
    }
}
