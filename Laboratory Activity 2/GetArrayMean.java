import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean(int[] arr) {
        
        if (arr.length == 0) {
            return 0; 
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
            
            
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
            
            
            double mean = getArrayMean(array);
            
            
            System.out.printf("Mean of array is: %.2f%n", mean);
        }
    }
}
