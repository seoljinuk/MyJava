package ch03_array;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 요소 개수 입력 : ");
        int size = scan.nextInt() ;

        int[] jumsu = new int[size];
        int odd = 0 , even = 0 ; // 합산 변수들은 반복하기 전에 정의

        for (int i = 0; i < jumsu.length; i++) {
            System.out.print(i + "번째 정수 입력 : ");
            jumsu[i] = scan.nextInt() ;

            if(jumsu[i] % 2 == 0){ // 요소의 값이 짝수이면
                even += jumsu[i] ;

            }else{ // 홀수이면
                odd += jumsu[i] ;
            }
        }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
