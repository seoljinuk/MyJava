package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {
        String name = "김철수";
        int kor = 85, eng = 70, math = 90;
        String grade; // 학점 변수
        String message = "";
        double average = (kor + eng + math) / 3.0;

        if (average >= 90.0) {
            grade = "A";

        } else if (average >= 80.0) {
            grade = "B";

        } else if (average >= 70.0) {
            grade = "C";

        } else if (average >= 60.0) {
            grade = "D";

        } else {
            grade = "F";
        }

        switch (grade){
            case "A":  case "B":
                message = "참 잘 하셨습니다.";
                break;
            case "C":  case "D":
                message = "조금만 더 노력하세요.";
                break;
            case "F":
                message = "다음 학기에 재수강하세요.";
                break;
        }

        System.out.println("이름 : " + name + "님");
        System.out.println("국어 : " + kor + "점, 영어 : " + eng + "점, 수학 : " + math + "점");
        System.out.println("총점 :  " + (kor + eng + math) );
        System.out.println("평균 : " + average );
        System.out.println("학점 : " + grade );
        System.out.println("메시지 : " + message );
    }
}
/*
이름과 국어, 영어, 수학 점수를 이용하여 학점을 매기세요.
학점은 세 과목의 평균을 이용하여 매기세요.

String name = "김철수";
int kor = 85, eng = 70, math = 90 ;

String grade ; // 학점 변수

String message = "" ;

학점이 "A" 또는 "B"이면 "참 잘 하셨습니다."를 message 변수에 저장한다.
학점이 "C" 또는 "D"이면 "조금만 더 노력하세요."를 message 변수에 저장한다.
학점이 "F"이면 "다음 학기에 재수강하세요."를 message 변수에 저장한다.
그 외의 값이 입력되면 "잘못된 입력입니다."를 message 변수에 저장한다.

출력 예시
이름 : 김철수님
국어 : 85점, 영어 : 70점, 수학 : 90점
총점 : 245점, 평균 : 81.66666
학점 : B
메시지 : 참 잘 하셨습니다.
*/