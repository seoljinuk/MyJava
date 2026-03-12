package ch06_abstract_interface.cafeinterface;

public class Espresso05 extends Beverage05 implements ShotAddable{
    private int shotCount ;

    @Override
    public void addShot(int count) {
        this.shotCount += count ;
        System.out.println("샷이 " + count + "개 추가되었습니다.");
    }

    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public void drink() {
        System.out.println("샷개수 " + shotCount + "인 " + super.getName() + "을 진하게 한모금 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() +  "\nEspresso05{" +
                "shotCount=" + shotCount +
                '}';
    }

}
