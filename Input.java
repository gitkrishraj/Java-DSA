import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter some input:");
            int rollno = input.nextInt();
            System.out.println("Your roll number is " + rollno);
        }
    }
}
