JAVA PROGRAMMING LANGUAGE.


import java.io.*;
import java.util.*;

public class Attachment {
public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("My task plan");
           
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
                    
System.out.println("Task not found in the list.Would you like to add?");
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



import java.util.*;

public class Reallife {
public static void main(String[] args) {
		
int age[]={20,23,19,18,17,19,19,18,21,24,26,17,24,19,18,18,19};
	
System.out.println(age.length);
  int max = Arrays.stream(age).max().getAsInt();
		
System.out.println(max);
		Arrays.sort(age); 
  // Sorts the array in ascending order
        for (int i : age) {
 System.out.print(i + " ");
            
        }
  //section to calculate the sum of the ages
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
System.out.print("\n\nThe sum is: " + sum);
        double avg = sum/age.length;
  //calculates the avarage age of all the ages
  
System.out.println("\n\nThe avarage is: " + avg);
	}
