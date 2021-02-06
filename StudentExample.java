import java.util.Scanner;

public class StudentExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student stud1 = new Student();
        
        System.out.println("Enter your name: ");
        stud1.setName(input.nextLine());
        System.out.println("Enter student number: ");
        stud1.setStudNumber(input.nextInt());
        System.out.println("Enter score: ");
        stud1.setScore(input.nextDouble());
        
        System.out.println("Name: "  + stud1.getName());
        System.out.println("Student Number: " + stud1.getStudNumber());
        System.out.println("Score: " + stud1.getScore());
        stud1.study();
        stud1.play(1000);
        String message = (stud1.doChores() == false ? "Do you work!" : "Job well done!");
        System.out.println(message);
    }
}
