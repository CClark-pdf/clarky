import java.util.Scanner;

public class GetArrayMean_1 {
    public static double GetArrayMean_1(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        double mean = GetArrayMean_1(numbers);
        System.out.printf("Mean of array is: %.2f%n", mean);
    }
}


