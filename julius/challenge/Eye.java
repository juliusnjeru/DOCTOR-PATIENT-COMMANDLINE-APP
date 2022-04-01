package julius.challenge;

public class Eye extends Organ {

    private String color;
    private boolean isOpened;

    public Eye(String name, String medical_condition, String color, boolean isOpened) {
        super(name, medical_condition);
        this.color = color;
        this.isOpened = isOpened;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }


    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }


    public void open() {
        this.isOpened = true;
        System.out.println(this.getName() + " opened");
    }

    public void close() {
        this.isOpened = false;
        System.out.println(this.getName() + " is closed");
    }

    public String getColor() {
        return color;
    }


}
