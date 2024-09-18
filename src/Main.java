
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b, c;

        System.out.println("Hello를 입력하시오.");
        a = sc.nextLine();

        System.out.println("World를 입력하시오.");
        b = sc.nextLine();

        c = a + b;
        System.out.println(c);

    }
}