public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String output = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println(output);
    }
}
