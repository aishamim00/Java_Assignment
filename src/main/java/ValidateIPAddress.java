import java.util.Scanner;
public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();
        if (isValidIPAddress(ipAddress)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }
    public static boolean isValidIPAddress(String ipAddress) {
        int dotCount = 0;
        int currentNumber = 0;
        StringBuilder currentPart = new StringBuilder();
        for (int i = 0; i < ipAddress.length(); i++) {
            char currentChar = ipAddress.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentPart.append(currentChar);
            }
            else if (currentChar == '.') {
                if (currentPart.length() == 0) {
                    return false;
                }
                if (!isValidPart(currentPart.toString())) {
                    return false;
                }

                currentPart.setLength(0);
                dotCount++;
            }
            else {
                return false;
            }
        }
        if (dotCount != 3 || currentPart.length() == 0 || !isValidPart(currentPart.toString())) {
            return false;
        }
        return true;
    }

    public static boolean isValidPart(String part) {
        try {
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255 || (part.length() > 1 && part.charAt(0) == '0')) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
