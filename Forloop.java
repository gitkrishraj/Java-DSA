import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            for(int num=1; num<=n; num++){
                System.out.println("Hello world");
            }
        }
    }
}
