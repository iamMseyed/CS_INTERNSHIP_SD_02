package codSoft;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        try {
        	Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            int totalMarks = 0;

            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                int marks = scanner.nextInt();
                if(marks>100)
                {
                	System.err.println("Marks can't be higher than 100!");
                	System.exit(0);
                }
                totalMarks += marks;
            }

            float averagePercentage =  totalMarks / numSubjects;
            String grade = calculateGrade(averagePercentage);

            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage:"+ averagePercentage);
            System.out.println("Grade: " + grade);
        }catch(InputMismatchException ime) {
        	System.err.println("Please enter numbers only!");
        }

    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

