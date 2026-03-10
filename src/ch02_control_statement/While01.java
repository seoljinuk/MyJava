package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0 ;

        int i = 1 ; // 초기식

        while (i < 11){ //조건식
            total += i ;
            i++; // 증감식
        }

        System.out.println("총합01 : " + total);

        // 1 + 4 + 7 + ... + 100 = 1717
        total = 0 ;
        i = 1 ; // 초기식
        while(i < 101){ // 조건식
            total += i ;
            i+=3 ; // 증감식
        }
        System.out.println("총합02 : " + total);

        // 97 + 92 + 87 + ... + 2 = 990
        total = 0 ;
        i = 97 ; // 초기식
        while(i > 1){ // 조건식
            total += i ;
            i-=5 ; // 증감식
        }
        System.out.println("총합03 : " + total);

        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
        total = 0 ;
        i = 1 ; // 초기식
        while(i < 97){ // 조건식
            total += i * i ;
            i+=5 ; // 증감식
        }
        System.out.println("총합04 : " + total);
    }
}
