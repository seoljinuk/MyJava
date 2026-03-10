package ch02_control_statement;

public class If05 {
    static void main(String[] args) {
        // su가 7의 배수이면 제곱 값을 출력하고, 7의 배수가 아니면 3을 더하는 프로그램 작성
        //예를 들어 su가 7이면 49 출력, 12이면 15가 출력이 되어야 합니다.
        int su = 7 ;

        // 양자 택일 구문
        if(su%7 == 0){
            System.out.println(su * su);

        }else{
            System.out.println(su + 3);
        }
    }
}
