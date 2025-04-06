public class QuestionPaper {
    public static void main(String[] args) {

        int totalMarks = 100;
        int totalQuestions = 15;
        int x = 0;
        int y = 0;
        for (y = 0; y <= totalQuestions; y++) {
            x = totalQuestions - y;
            if (5 * x + 10 * y == totalMarks) {
                break;
            }
        }
        System.out.println("5 marks question is " + x);
        System.out.println("10 marks question is " + y);
    }
}
