package TaskManager;

import java.util.*;

public class Attachment {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMy task plan");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. View to-do list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter task details: ");
                    String details = scanner.nextLine();
                    tasks.add(new Task(details));
                    break;
                }
                case 2: {
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.get(taskNumber - 1).setCompleted(true);
                        System.out.println("Task marked as completed");
                    } else {
                        System.out.println("Task not found in the list.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("To-do list:");
                    for (int i = 0; i < tasks.size(); i++) {
                        Task t = tasks.get(i);
                        System.out.printf("%d. %s [%s]%n", i + 1, t.getDetails(), t.isCompleted() ? "Done" : "Pending");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Exiting the program");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice, please try again");
                    break;
                }
            }
        }
    }
}

class Task {
    private String details;
    private boolean completed;

    public Task(String details) {
        this.details = details;
        this.completed = false;
    }

    public String getDetails() {
        return details;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
