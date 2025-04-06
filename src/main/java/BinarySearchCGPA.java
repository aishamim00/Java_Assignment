import java.util.Scanner;
public class BinarySearchCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] cgpa = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};

        System.out.print("Enter CGPA to search: ");
        double target = scanner.nextDouble();

        if (binarySearch(cgpa, target)) {
            System.out.println("CGPA found in the list.");
        } else {
            System.out.println("CGPA not found in the list.");
        }
    }

    public static boolean binarySearch(double[] arr, double target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
