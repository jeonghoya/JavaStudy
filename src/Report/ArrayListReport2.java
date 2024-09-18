package Report;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReport2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  // ()는 객체 생성자 호출
        list.add("철수");
        list.add("영희");
        list.add("순신");
        list.add("자영");

        //list2 생성 후 내용물 삽입
        ArrayList<String> list2 = new ArrayList<>();
        String input;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하시오: ");
            input = sc.next(); //문자열을 입력받는다.
            if (input.equals("0")) {
                break;
            }
            list2.add(input); //입력 받은 문자열을 list2에 추가
        }

        System.out.print("List: ");
        for(String s : list)
            System.out.print(s + " ");
        System.out.println(" ");
        System.out.print("List2: ");
        for(String s : list2)
            System.out.print(s + " ");

        //list - list2 하는 코드
        for (int i = 0; i < list2.size(); i++)
            for(int j = 0; j < list.size(); j++){
                if(list2.get(i).equals(list.get(j))) //문자열 비교를 위해 equals 사용
                    list.remove(j);                 //list2에서 list를 비교하며 같은 문자열이면 해당 문자열을 list에서 삭제하는 방법
            }
        System.out.println(" ");
        System.out.print("List - List2: ");
        for(String s : list)
            System.out.print(s + " "); //list2와 겹치는 문자열을 삭제한 list를 출력
    }
}
