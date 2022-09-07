package Kimbab;

class Food {
    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if (0 <= price)
            this.price = price;
        else
            System.out.println(" 음식의 가격은 0원 이상으로 책정해야됩니다. ");
    }

    public void printNameWithPrice(){
        System.out.printf("%s(%d원)", name, price);
    }
}
class StandardKimbab extends Food{
    public StandardKimbab() {
        super("김밥", 1000);
    }

    public StandardKimbab(String name, int price) {
        super(name, price);
    }
}

class EggKimbab extends StandardKimbab {
    public EggKimbab() {
        super("계란 김밥", 1500);
    }

    public EggKimbab(String name, int price) {
        super(name, price);
    }
}

class ChungmuKimbab extends StandardKimbab {
    public ChungmuKimbab() {
        super("충무 김밥", 1000);
    }

    public ChungmuKimbab(String name, int price) {
        super(name, price);
    }
}

class Tteokbokki extends Food {
    public Tteokbokki() {
        super("떡볶이", 2000);
    }

    public Tteokbokki(String name, int price) {
        super(name, price);
    }
}
