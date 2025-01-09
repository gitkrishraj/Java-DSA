import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        try (// take input of 2 no. and print the sum
        Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the first no.: ");
            int num1 = in.nextInt();
            System.out.print("Enter the second no.: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum = " + sum);
        }
    }
}
