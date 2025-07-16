import java.util.*;

public class Statistics { // Class name should match the file name: reallife.java
    public static void main(String[] args) {
        int[] ages = {20, 23, 19, 18, 17, 19, 19, 18, 21, 24, 26, 17, 24, 19, 18, 18, 19};

        System.out.println("Age Statistics Report");
        System.out.println("--------------------------");

        // Total count
        System.out.println("Total number of ages: " + ages.length);

        // Maximum age
        int max = Arrays.stream(ages).max().orElse(-1);
        System.out.println("Maximum age: " + max);

        // Sort the ages
        Arrays.sort(ages);
        System.out.print("Sorted ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        // Sum and average
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println("\nSum of ages: " + sum);

        double avg = (double) sum / ages.length;
        System.out.printf("Average age: %.2f%n", avg);

        // Median
        double median;
        if (ages.length % 2 == 0) {
            median = (ages[ages.length / 2 - 1] + ages[ages.length / 2]) / 2.0;
        } else {
            median = ages[ages.length / 2];
        }
        System.out.printf("Median age: %.2f%n", median);

        System.out.println("--------------------------");
        System.out.println(" End of Report");
    }
}
