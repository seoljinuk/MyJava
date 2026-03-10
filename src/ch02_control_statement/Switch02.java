package ch02_control_statement;

public class Switch02 {
    static void main(String[] args) {
        // switch 구문을 사용하여 4계절 중 해당 계절 정보 출력하기
        int month = 3 ;

        switch (month){
            case 3:  case 4: case 5:
                System.out.println("봄");
                break;
            case 6:  case 7: case 8:
                System.out.println("여름");
                break;
            case 9:  case 10: case 11:
                System.out.println("가을");
                break;
            case 12:  case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("오류");
        }
    }
}
