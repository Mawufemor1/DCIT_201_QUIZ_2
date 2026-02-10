// STUDENT ID ->  22393383
import java.util.Scanner;
public class GradeReport {
    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    public static char calculateLetterGrade(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else if (score >= 50) return 'E';
        else return 'F';
    }

    public static void displayPerformanceMessage(char grade) {
        switch (grade){
            case'A' ->  System.out.println("Excellent");
            case'B' ->  System.out.println("Very Good");
            case'C' ->  System.out.println("Good");
            case'D' ->  System.out.println("Pass");
            case'E' ->  System.out.println("Credit");
            case'F' ->  System.out.println("Fail");
            default ->  System.out.println("Incorrect grade");
        }
    }

    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.print("Invalid score");
            return;
        }
        char finalResult = calculateLetterGrade(score);
        displayPerformanceMessage(finalResult);
    }


    public static void main(String[] args){
        System.out.println("Enter Grade");
        Scanner input = new Scanner(System.in);
        double gradeInput = input.nextDouble();
        executeGradeReport(gradeInput);
        input.close();
    }


}