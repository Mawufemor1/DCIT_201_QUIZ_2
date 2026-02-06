// STUDENT ID: 22393383
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
        if (grade == 'A') {
            System.out.print("Excellent");
        }
        else if (grade == 'B') {
            System.out.print("Very Good");
        }
        else if (grade == 'C') {
            System.out.print("Good");
        }
        else if (grade == 'D') {
            System.out.print("Pass");
        }
        else if (grade == 'E') {
            System.out.print("Credit");
        }
        else if (grade == 'F') {
            System.out.print("Fail");
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