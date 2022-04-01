package julius.challenge;

public class Skin extends Organ {

    private String color;
    private int softness;

    public Skin(String name, String medical_condition, String color, int softness) {
        super(name, medical_condition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Skin Color " + this.getColor());
    }

    public String getColor() {
        return color;
    }

}
