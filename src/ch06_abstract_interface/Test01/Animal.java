package ch06_abstract_interface.Test01;

public abstract class Animal {

    public  static  final  String HELLO ="동물병원";
    private  static  int animalCount = 0;
    public static int getAnimalCount(){
        return  animalCount;
    }
    private  String name;
    private String type;
    private int age;
    private int price;

    public Animal(String name, String type, int age, int price) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.price = price;

        animalCount++;
    }

    public String getName() {
        return name;
    }
    public String getType(){return type; }
    public int getAge(){return  age; }
    public int getPrice() {
        return price;
    }


    public void cost(){
        System.out.println("이름 : " + this.getName());
        System.out.println("품종 : " + this.getType());
        System.out.println("나이 : " + this.getAge());
        System.out.println("진료비 : " + this.getPrice() + "만원");
    }


    public Animal(){} // 매개변수 없는 생성자
}
