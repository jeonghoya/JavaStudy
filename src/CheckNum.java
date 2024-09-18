import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("학점 입력: ");
        int a = sc.nextInt();
        /*
        if(a >= 90)
            System.out.println("A");
        else if(a >= 80){
            System.out.println("B");
        }
        else if(a >= 70){
            System.out.println("C");
        }
        else System.out.println("F");
         */
        char grade;
        num = a / 10;
        switch (num){
            case 10:
                grade = 'A';
                break;

        }
    }
}
