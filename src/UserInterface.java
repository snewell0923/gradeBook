// This class interacts with the user
import java.util.*;


public class UserInterface {

    int classNumber = 0;
    List<ClassRoom> classrooms = new ArrayList<>();

    // Create a scanner object
    Scanner sc = new Scanner(System.in);


    // Welcome the new user to the database
    public void welcomeScreen(){
        System.out.println();
        System.out.println("Welcome to your new Grade Book database system!");
        System.out.println("Let's get started by creating your first classroom.");
    }

    // Continue to guide the user
    public void welcomeScreen2(){
        System.out.println();
        System.out.println("Great! Next let's enter the names of the students " +
                "in this class.");
    }

    // Create a new classroom and add it a list
    public void createNewClassroom(){
        System.out.println();
        System.out.println("What would you like to name this class?");
        System.out.print("Class Name: ");
        String className = sc.nextLine();


        ClassRoom cr = new ClassRoom(className);
        classrooms.add(cr);
    }

    // Create a new student and add it to a list
    public void createNewStudent(){
        System.out.println();
        System.out.println("Which class is this student in?");
        classNumber = sc.nextInt();
        System.out.print("Student Name: ");
        String studentName = sc.next();
        System.out.println();
        System.out.print("Student ID: ");
        String studentId = sc.next();
        Student st = new Student(studentName,studentId);
        classrooms.get(classNumber).addStudent(st); // Add student to the appropriate class.
    }


    // Print out the names of each class
    public void printClassroomNames(){
        System.out.println();
        int count = 1;
        for (ClassRoom classRoom : classrooms){
            System.out.println(count + ". " + classRoom.getName());
            count++;
        }
    }

    public void mainMenu(){
        System.out.println();
        System.out.println("What do you wish to do?");
        System.out.println("1. Add a grade");
        System.out.println("2. Add a student");
        System.out.println("3. Add a class");
        System.out.println("4. List students");
        System.out.println("5. List classes");
        System.out.println("6. Get Student Info");
    }



}
