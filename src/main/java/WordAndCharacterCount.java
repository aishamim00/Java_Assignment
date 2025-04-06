public class WordAndCharacterCount {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        int words = 0, chars = 0, vowels = 0, consonants = 0;
        boolean inWord = false;
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                chars++;

                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            if (ch == ' ' && inWord) {
                words++;
                inWord = false;
            } else if (ch != ' ' && !inWord) {
                inWord = true;
            }
        }

        if (inWord) {
            words++;
        }
        System.out.println("Words: " + words);
        System.out.println("Chars: " + chars);
        System.out.println("Vowel: " + vowels);
        System.out.println("Consonant: " + consonants);
    }
}
