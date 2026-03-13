package ch06_abstract_interface.Test01;

public class Cat extends Animal implements YebangAdd01, Mouth{
    private String subject;
    private boolean MouthTest;
    public Cat(String name, String type, int age, int price, String subject, boolean Mouthtest) {
        super(name, type, age, price);
        this.subject = subject;
        this.MouthTest = Mouthtest;
    }

    @Override
    public void cost() {
        super.cost();
        System.out.println("진료과목 : " + this.subject);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCat{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void addYebang(String yebang) {
        System.out.println("예방접종 유무 : " + yebang);
        this.subject = yebang;
    }
    @Override
    public void mouth(boolean MouthTest) {
        System.out.println("구강상태 검사 : " + this.MouthTest);
        System.out.println("현재 구강상태 검사 : " + MouthTest);
        this.MouthTest = MouthTest;

    }

}
