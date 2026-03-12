package ch06_abstract_interface.cafeinterface;

// Beverage05와 MilkAddable 상속 받기
public class Cappuccino05 extends Beverage05 implements MilkAddable{
    private String milkType;
    private double foamAmount; // 거품량

    public Cappuccino05(String name, double price, String milkType, double foamAmount) {
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }

    @Override
    public void drink() {
        System.out.println(getName() + "를 부드러운 거품과 함께 마십니다!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCappuccino05{" +
                "milkType='" + milkType + '\'' +
                ", foamAmount=" + foamAmount +
                '}';
    }

    @Override
    public void changeMilk(String milkType) {
        this.milkType = milkType;
        System.out.println("우유가 " + milkType + "로 변경되었습니다.");
    }
}
