package ch06_abstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkAddable{
    private String milkType ;

    @Override
    public void drink() {
        System.out.println("우유의 타입이 " + milkType + "인 " + super.getName() + "를 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nLatte05{" +
                "milkType='" + milkType + '\'' +
                '}';
    }

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("우유의 타입이 " + this.milkType + "에서 " + milkType + "으로 변경되었습니다.");
        this.milkType = milkType ;
    }
}
