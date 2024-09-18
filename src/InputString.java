import java.util.Scanner;

public class InputString {
    public static double calculateAverage(double n1, double n2, double n3) {
        double result;
        result = (n1 + n2 + n3) / 3;
        return result;
    }
    public static void main(String[] args) {
        String name, studentNumber;
        double javaScore, cScore, pythonScore, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오: ");
        name = sc.nextLine(); // “java util scanner”
        System.out.print("학번을 입력하시오: ");
        studentNumber = sc.nextLine();
        System.out.println("java 점수 입력: ");
        javaScore = sc.nextDouble();
        System.out.println("c언어 점수 입력: ");
        cScore = sc.nextDouble();
        System.out.println("python 점수 입력: ");
        pythonScore = sc.nextDouble();

        result = calculateAverage(javaScore, cScore, pythonScore);

        System.out.println("<학생 정보>");
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("<Score>");
        System.out.println("JAVA: " + javaScore);
        System.out.println("C: " + cScore);
        System.out.println("Python: " + pythonScore);
        System.out.println("Average Score: "+ result);

    }
}
