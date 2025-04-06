public class SortCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 1; i < cgpa.length; i++) {
            double key = cgpa[i];
            int j = i - 1;
            while (j >= 0 && cgpa[j] < key) {
                cgpa[j + 1] = cgpa[j];
                j--;
            }
            cgpa[j + 1] = key;
        }

        System.out.print("Sorted CGPA in descending order: ");
        for (double num : cgpa) {
            System.out.print(num + " ");
        }
    }
}
