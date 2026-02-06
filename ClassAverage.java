// STUDENT ID: 22393383
import java.util.Scanner;
public class ClassAverage {
    public static double calculateClassAverage(double num1, double num2){
        double sum = num1+num2;
        int countNum = 2;
        return sum / (double) countNum;

    }
    public static double calculateClassAverage(double num1, double num2, double num3){
        double sum = num1+num2+num3;
        int countNum = 3;
        return sum / (double) countNum;

    }
    public static double calculateClassAverage(double[] numbers){
        double sum = 0;
        for (double num: numbers){
            sum+= num;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args){

        System.out.println("Enter two number");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("The class average is: "+calculateClassAverage(num1,num2));

        System.out.println("Enter three number");;
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        System.out.println("The class average is: "+calculateClassAverage(n1,n2,n3));

        System.out.println("Enter size of Array");
        int size = input.nextInt();
        double[] numbers = new double[size];
        for (int i = 0; i < numbers.length;i++){
            System.out.print("Enter value for index : ");
            numbers[i] = input.nextDouble();

        }
        System.out.println("The class average is: "+calculateClassAverage(numbers));

        input.close();

    }

}
