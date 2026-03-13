package ch06_abstract_interface.Test01;


import java.util.Scanner;

public class AnimalTest {
    static void main(String[] args) {
        System.out.println("어서 오세요~~ " + Animal.HELLO + "입니다.");

        Scanner scan = new Scanner(System.in);

        Animal [] List = {
                new Dog("하루", "진돗개",7, 70, "심장사상충", false),
                new Cat("이틀", "샴",3, 20, "광견병", true),
                new Bird("사흘", "앵무새",4, 40, "앵무병", 50),
                new Dog("나흘", "삽살개",5, 50, "골절", true)
        };

        System.out.print("\n성함을 말씀해 주세요\n");
        String answer = scan.nextLine();
        System.out.println("\n" + answer + " 님 내원을 환영합니다. \n");

        for (Animal animal : List){
            animal.cost();
            if (animal instanceof Dog){
                ((Dog)animal).addYebang("Y");((Dog) animal).mouth((true));
            }else if (animal instanceof Cat){
                ((Cat)animal).addYebang(("Y"));((Cat)animal).mouth((true));
            }else if(animal instanceof Bird){
                ((Bird)animal).addYebang(("Y"));((Bird)animal).temperature((39));
            }
            System.out.println("------------");
        }

        System.out.println();

        System.out.println("총 진료 건수 : " + Animal.getAnimalCount() + "건");
    }

}
