import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, sum = 0;

        while(true){
            System.out.print("정수를 입력: ");
            input = sc.nextInt();
            if(input == -1){
                break;
            }
            sum += input;
        }
        System.out.println("정수의 합: " + sum);
    }
}
