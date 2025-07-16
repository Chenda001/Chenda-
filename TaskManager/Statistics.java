import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        int[] ages = {20, 23, 19, 18, 17, 19, 19, 18, 21, 24, 26, 17, 24, 19, 18, 18, 19};

        System.out.println("Total number of ages: " + ages.length);

        int max = Arrays.stream(ages).max().getAsInt();
        System.out.println("Maximum age: " + max);

        Arrays.sort(ages);
        System.out.print("Sorted ages: ");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }

        System.out.println("\n\nThe sum of ages is: " + sum);

        double avg = (double) sum / ages.length;
        System.out.println("The average age is: " + avg);

        // Median calculation
        double median;
        if (ages.length % 2 == 0) {
            median = (ages[ages.length / 2 - 1] + ages[ages.length / 2]) / 2.0;
        } else {
            median = ages[ages.length / 2];
        }
        System.out.printf("Median age: %.2f%n", median);

        // Mode calculation
        int mode = ages[0], modeCount = 1, currentCount = 1;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] == ages[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > modeCount) {
                modeCount = currentCount;
                mode = ages[i];
            }
        }
        System.out.println("Mode age: " + mode);
    }
}