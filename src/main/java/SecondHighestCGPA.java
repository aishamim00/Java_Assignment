public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double highest = cgpa[0], secondHighest = Double.MIN_VALUE;

        for (int i = 1; i < cgpa.length; i++) {
            if (cgpa[i] > highest) {
                secondHighest = highest;
                highest = cgpa[i];
            } else if (cgpa[i] > secondHighest && cgpa[i] != highest) {
                secondHighest = cgpa[i];
            }
        }

        System.out.println("The second highest CGPA is: " + secondHighest);
    }
}
