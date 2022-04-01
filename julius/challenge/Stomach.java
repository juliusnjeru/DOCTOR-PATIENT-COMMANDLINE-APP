package julius.challenge;

public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String medical_condition, boolean isEmpty) {
        super(name, medical_condition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if (this.isEmpty) {
            System.out.println("Need to be fed.");
        } else {
            System.out.println("Stomach is full.");
        }
    }

    public void digest() {
        System.out.println("Digesting begin...");
    }


}
