package julius.challenge;

public class Patient {
    private String name;
    private int age;
    private Eye RightEye;
    private Eye LeftEye;
    private Stomach stomach;
    private Heart heart;
    private Skin skin;

    public Patient(String name, int age, Eye rightEye, Eye leftEye, Stomach stomach, Heart heart, Skin skin) {
        this.name = name;
        this.age = age;
        RightEye = rightEye;
        LeftEye = leftEye;
        this.stomach = stomach;
        this.heart = heart;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getRightEye() {
        return RightEye;
    }

    public void setRightEye(Eye rightEye) {
        RightEye = rightEye;
    }

    public Eye getLeftEye() {
        return LeftEye;
    }

    public void setLeftEye(Eye leftEye) {
        LeftEye = leftEye;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
