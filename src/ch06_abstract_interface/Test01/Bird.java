package ch06_abstract_interface.Test01;

public class Bird extends Animal implements YebangAdd01, Temperature{
    private String subject;
    private double temperCheck;
    public Bird(String name, String type, int age, int price, String subject, double temperCheck) {
        super(name, type, age, price);
        this.subject = subject;
        this.temperCheck = temperCheck;

    }

    @Override
    public void cost() {
        super.cost();
           System.out.println("진료과목 : " + this.subject);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBird{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void addYebang(String yebang) {
        System.out.println("예방접종 유무 : " + yebang);
        this.subject = yebang;
    }

    @Override
    public void temperature(double temperCheck) {
        System.out.println("이전 체온 : " + this.temperCheck );
        System.out.println("현재 체온 : " + temperCheck);
    }
}