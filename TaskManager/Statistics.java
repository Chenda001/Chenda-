package TaskManager;

import java.util.*;

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
    }
}
