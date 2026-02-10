import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Student Full Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Student Age:");
            int age = scanner.nextInt();
            if (age < 0) {
            throw new ArithmeticException("Age must be positive.");
            }
            scanner.nextLine();

            System.out.println("Enter Grade for Course A:");
            double gradeA = scanner.nextDouble();
                 if (gradeA < 0 || gradeA >100) {
            throw new ArithmeticException("Grade must be between 0 and 100.");
            }
            scanner.nextLine();

            System.out.println("Enter Grade for Course B:");
            double gradeB = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter Grade for Course C:");
            double gradeC = scanner.nextDouble();
            scanner.nextLine();

            double averageGrade = (gradeA + gradeB + gradeC) / 3;

            System.out.println("Average grade: " + averageGrade);
            scanner.close();

            String studentName = name;
            int studentAge = age;
            double studentAverageGrade = averageGrade;

            System.out.println("                                        ");
            System.out.println("Student: " + studentName);
            System.out.println("Age: " + studentAge);
            System.out.println("Average Grade: " + studentAverageGrade);

            double average = studentAverageGrade;
            if (average < 50) {
                System.out.println("FAIL");
            } else if (average >= 50 && average < 70) {
                System.out.println("RETAKE REQUIRED");
            } else {
                System.out.println("Status: PASS");
            }
     }
}