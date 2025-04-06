import java.util.Random;
public class RandomPasswordGenerator {
    public static void main(String[] args) {

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        Random random = new Random();

        char upper = upperCase.charAt(random.nextInt(upperCase.length()));
        char lower = lowerCase.charAt(random.nextInt(lowerCase.length()));
        char digit = digits.charAt(random.nextInt(digits.length()));
        char special = specialChars.charAt(random.nextInt(specialChars.length()));

        String allCharacters = upperCase + lowerCase + digits + specialChars;

        StringBuilder password = new StringBuilder();
        password.append(upper);
        password.append(lower);
        password.append(digit);
        password.append(special);

        for (int i = 4; i < 8; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        String passwordString = password.toString();
        passwordString = shuffleString(passwordString, random);

        System.out.println("Generated Password: " + passwordString);
    }

    private static String shuffleString(String input, Random random) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int j = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}
