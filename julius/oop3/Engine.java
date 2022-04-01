package julius.oop3;

public class Engine {
    private String model;
    private int rpm;

    /**
     * Returns the Engine of our Car
     *
     * @param model
     * @param rpm
     */
    public Engine(String model, int rpm) {
        this.model = model;
        this.rpm = rpm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
