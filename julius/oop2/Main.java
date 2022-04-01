package julius.oop2;
//INHERITANCE TUTORIAL

public class Main {
    public static void main(String[] args) {
        Bird phoenix = new Bird("Nina", "white", 2, false, 2);
        System.out.println(phoenix.getName());

        phoenix.eat("Meat");
        System.out.println(phoenix.getWings());
        System.out.println(phoenix.fly());


        System.out.println(phoenix.fly(80));
    }
}
