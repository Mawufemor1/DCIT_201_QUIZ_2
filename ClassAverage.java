// STUDENT ID: 22393383
import java.util.Scanner;
public class ClassAverage {
    public static double calculateClassAverage(int num1, int num2){
        double sum = num1+num2;
        int countNum = 2;
        return sum / (double) countNum;

    }
    public static double calculateClassAverage(int num1, int num2, int num3){
        double sum = num1+num2+num3;
        int countNum = 3;
        return sum / (double) countNum;

    }
    public static double calculateClassAverage(int[] numbers){
        double sum = 0;
        for (int num: numbers){
          sum+= num;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args){
        System.out.println("Enter more than one number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("The class average is: "+calculateClassAverage(num1,num2,num3));

    }

}
