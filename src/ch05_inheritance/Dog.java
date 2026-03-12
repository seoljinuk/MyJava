package ch05_inheritance;

// 상속을 해주는 Animal 클래스를 Dog 클래스가 상속을 받습니다.
// class 서브클래스 extends 수퍼클래스
// 수퍼클래스 = 부모 클래스
// 서브클래스 = 자식 클래스
public class Dog extends Animal {
    boolean guide ; // 안내견 여부

    @Override
    public void bark() {
        System.out.println(super.name + "이(가) 멍멍하고 짖습니다.");
    }

    @Override // 이 메소드는 오버라이딩되었습니다.
    public void display() {
        super.bark();
        // super는 나의 수퍼 클래스 Animal을 의미합니다.
        super.display();

        if(guide){
            System.out.println("안내견 여부 : 적합");
        }else{
            System.out.println("안내견 여부 : 부적합");
        }
    }
}
