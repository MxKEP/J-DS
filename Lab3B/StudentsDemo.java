//MICHAEL POLONIO
//CSC 236-64
//LAB 3-#2
package Lab3B;

import java.util.Scanner;

public class StudentsDemo {

    public static void main(String[] args) {

        Students student1 = new Students();
        Scanner keyboard = new Scanner(System.in);

        student1.setMaxNumberOfStudents(3);
        student1.addStudent(1111);
        student1.addStudent(1234);
        student1.addStudent(2357);
        System.out.println("What action would you like to implement?");
        System.out.println("1: Show all students\n\n2: Add a course\n\n3:Drop a course.\n\n9: Quit.");
        int choice = keyboard.nextInt();

        String input;
        int choice2;


        switch (choice){
            case 1:
                System.out.println(student1);
                break;
            case 2:
                System.out.println("Enter course name");
                input = keyboard.next();
                System.out.println("Enter course section.");
                choice = keyboard.nextInt();
                System.out.println("Enter course credits.");
                choice2 = keyboard.nextInt();
                student1.addCourse(input, choice, choice2);
                break;
            case 3:
                System.out.println("Enter the class you want to drop.");
                input = keyboard.next();
                student1.dropCourse(input);
                break;
            case 9:
                System.out.println("Exiting program.");
                System.exit(0);
                break;
            default:
                System.out.println("Not valid input.");
                break;
        }


    }
}
