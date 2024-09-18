package Report;

import java.util.ArrayList;

public class ArrayListReport1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  // ()는 객체 생성자 호출
        list.add("철수");
        list.add("영희");
        list.add("순신");
        list.add("자영");
        /*
        아래는 기존 ppt에 나와있는 방식이다.
        for (String obj : list)
            System.out.print(obj + " ");

         */
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        //list.size()로 ArrayList의 크기를 알 수 있으므로 일반 for문 사용
        //list.get(int index)를 통해 ArrayList의 내용 출력 가능
    }
}

