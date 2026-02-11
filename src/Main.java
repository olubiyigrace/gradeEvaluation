import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        while (true) {
            System.out.println("Enter Student's name:");
            name = scanner.nextLine();

            if (name.matches("[a-zA-Z ]+")) {

                break;
            } else {
                System.out.println("Invalid input! Please use only letters and spaces. Try again.");
            }
        }

        System.out.println("Enter Student's Age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            throw new ArithmeticException("Invalid age input, age must be positive!");
        }
        scanner.nextLine();

        System.out.println("Enter grade for course A:");
        double gradeA = scanner.nextDouble();
        if (gradeA < 0 || gradeA > 100) {
            throw new ArithmeticException("Invalid grade input");
        }
        scanner.nextLine();

        System.out.println("Enter grade for course B:");
        double gradeB = scanner.nextDouble();
        if (gradeB < 0 || gradeB > 100) {
            throw new ArithmeticException("Invalid grade input");
        }
        scanner.nextLine();

        System.out.println("Enter grade for course C:");
        double gradeC = scanner.nextDouble();
        if (gradeC < 0 || gradeC > 100) {
            throw new ArithmeticException("Invalid grade input");
        }
        scanner.nextLine();

        double averageGrade = (gradeA + gradeB + gradeC) / 3;
        System.out.println("The average grade is: " + averageGrade);

        String statusMessage;

        if (averageGrade >= 70) {
            statusMessage = "PASS";
        } else if (averageGrade >= 50) {
            statusMessage = "RETAKE REQUIRED";
        } else {
            statusMessage = "FAIL";
        }

        final String summary = String.format("Student: %s\nAge: %d\nAverage Grade: %f\nStatus: %s\n", name, age, averageGrade, statusMessage);
        System.out.println(summary);

        scanner.close();
    }
}
