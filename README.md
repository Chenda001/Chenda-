import java.io.*;
import java.util.*;

public class CDACC {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("CDACC - Daily Activity Scheduling Assistant");
           
  System.out.println("1. Add task");
  System.out.println("2. Mark task as completed");
  System.out.println("3. View to-do list");
  System.out.println("4. Exit");
  System.out.print("Enter your choice: ");
     int choice = scanner.nextInt();
     switch (choice) {
     case 1:
  System.out.print("Enter task details: ");
                    tasks.add(scanner.next());
         break;
      
      case 2:
   System.out.print("Enter task number to mark as completed: ");
   int taskNumber = scanner.nextInt();
  
  if (tasks.contains(tasks.get(taskNumber - 1))) {
                        tasks.remove(tasks.get(taskNumber - 1));
                        System.out.println("Task marked as completed");

 } else {
                    
System.out.println("Task not found in the list");
    }
  break;
  
               
  case 3:   
  System.out.println("To-do list: " + tasks);
      break;
               
  case 4:
                    System.out.println("Exiting the program");
    scanner.close();
      return;
        default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }
}
