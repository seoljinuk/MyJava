package ch02_control_statement;

public class While02 {
    static void main(String[] args) {
        int odd = 0, even = 0 ;
        int i = 1 ;
        while (i < 11) {
            switch (i%2){
                case 0:
                    even += i ;
                    break;
                case 1:
                    odd += i ;
                    break;
            }
            i++;
        }
        System.out.println("홀수의 총합 : "+ odd);
        System.out.println("짝수의 총합 : "+ even);
    }
}
