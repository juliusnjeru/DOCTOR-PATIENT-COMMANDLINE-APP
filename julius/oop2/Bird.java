package julius.oop2;

public class Bird extends Animal {

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    public void eat(String food) {
        System.out.println(this.getName() + " is eating " + food);
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public String fly() {
//        System.out.println();
        return this.getName() + " is flying";
    }

    public String fly(int speed) {
        return "Soaring... at " + speed;
    }
}
