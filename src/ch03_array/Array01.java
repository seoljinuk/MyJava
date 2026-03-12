package ch03_array;

public class Array01 {
    static void main(String[] args) {
        String[] bts = new String[7];

        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "rm";
        bts[4] = "지민";
        bts[5] = "슈가";
        bts[6] = "제이홉";

        System.out.println("배열 요소 출력하기");
        for (int i = 0; i < bts.length; i++) {
            System.out.println(bts[i]);
        }

        // 선입 선출(FIFO), 반대 LIFO(프링글스)
        System.out.println("향상된 for 구문");
        // for(타입 단수이름 : 복수이름){
        for(String item : bts){
            System.out.println(item);
        }
    }
}
