import java.util.Scanner;

public class BitOperator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세탁기 초기 상태 입력
        System.out.print("세탁기 초기상태 Byte를 입력하세요(0~127): ");
        int status = sc.nextInt();

        // 입력된 상태를 2진수 문자열로 출력
        System.out.println("세탁기 입력상태=" + Integer.toBinaryString(status));

        // 각 비트 상태 확인 (0~6 비트)
        boolean isElectricityConnected = (status & (1 << 0)) != 0;
        boolean isWaterConnected = (status & (1 << 1)) != 0;
        boolean isDoorClosed = (status & (1 << 2)) != 0;
        boolean isLaundryLoaded = (status & (1 << 3)) != 0;
        boolean isLaundryNotOverloaded = (status & (1 << 4)) != 0;
        boolean isDrainNotBlocked = (status & (1 << 5)) != 0;
        boolean isLaundryBalanced = (status & (1 << 6)) != 0;

        // 상태 출력
        System.out.println("전기가 연결되었는지=" + isElectricityConnected);
        System.out.println("수도가 연결되었는지=" + isWaterConnected);
        System.out.println("문이 닫혀 있는지=" + isDoorClosed);
        System.out.println("빨래가 들어있는지=" + isLaundryLoaded);
        System.out.println("빨래가 너무 많이 들어있지 않은 지=" + isLaundryNotOverloaded);
        System.out.println("배수관이 막혀 있지 않은 지=" + isDrainNotBlocked);
        System.out.println("빨래가 한쪽에 치우쳐 있지 않은 지=" + isLaundryBalanced);
    }

}
