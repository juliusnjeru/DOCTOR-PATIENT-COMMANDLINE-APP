package julius.oop3;

//CPMPOSITION IN JAVA

public class Main {
    public static void main(String[] args) {
//        Car mercedes = new Car("Mercedes AMG", 4, "Red", new Engine("Renault", 56000));
//        System.out.println(mercedes.getName());
//        System.out.println("Engine model: " + mercedes.getEngine().getModel());

        final Engine engine = new Engine("Subaru", 34000);
        engine.setRpm(35000);
        System.out.println(engine.getRpm());
    }
}
