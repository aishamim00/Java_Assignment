public class ExtractTransactionId {
    public static void main(String[] args) {

        String html = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Transactions</title>\n</head>\n<body>\n    <div>\n        <div class=\"button\">\n            <p>Transaction Id: TXN1234 </p>\n        </div>\n    </div>\n</body>\n</html>";
        String startTag = "Transaction Id: ";
        int startIndex = html.indexOf(startTag);
        if (startIndex != -1) {
            String transactionId = html.substring(startIndex + startTag.length(), startIndex + startTag.length() + 8);
            System.out.println("Transaction Id: " + transactionId);
        }
        else {
            System.out.println("Transaction Id not found.");
        }
    }
}
