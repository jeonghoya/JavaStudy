import java.util.Scanner;

public class BitOperator {
    public static void main(String[] args) {
        //byte status;
        Scanner sc = new Scanner(System.in);
        //status = sc.nextByte();
        int status = sc.nextInt();
        String statusByte = Integer.toBinaryString(status);
        //Integer.toBinaryString(status);
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));
        System.out.println("문 열려 있다: " + ((status & 0b00000100) != 0));



    }
}
