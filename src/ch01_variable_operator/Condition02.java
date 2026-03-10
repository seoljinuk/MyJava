package ch01_variable_operator;

public class Condition02 {
    static void main(String[] args) {
        int x = 10, y = 20 ;

        // 2개의 숫자 중에서 큰수 고르기
        //타입 result = 조건식 ? 참일때처리 : 거짓일때처리 ;
        int result = x >= y ? x : y ;

        System.out.println("result : " + result);

        // x가 짝수인지 홀수인지 판단해 보세요.
        String str = x%2 == 0 ? "짝수" : "홀수" ;

        System.out.println("str : " + str);

        x = 6 ;
        // x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과 출력하기
        result = x%3 == 0 ? x*x : x+5 ;
        System.out.println("result : " + result);

        int month = 3 ;
        str = month >= 3 && month <= 5 ? "봄" : "다른 계절" ;
        System.out.println("결과 : " + str);
    }
}
